# 2020-12-1
SpringBoot读取Resource下文件
** 类加载机制可以读取jar包 中的 class文件 和 jar包中的文件流 **
```
ClassPathResource classPathResource = new ClassPathResource("/db/marigin/test.sql");
InputStream inputStream = classPathResource.getInputStream();
```
```
Thread.currentThread().getContextClassLoader().getResourceAsStream("/db/test.sql");
```
```
this.getClass().getResourceAsStream("/db/test.sql");
```

指定配置环境
-Dspring-boot.run.profiles=
-Dspring.profiles.active=

# 2020-12-2
自定义注解Annotations
@Target(ElementType.) 作用目标
@Retention(RetentionPolicy) 保留位置 
```
.java -> .class -> jvm
SOURCE    CLASS    RUNTIME
```
@Document javadoc文档中
@Inherited 子类会继承父类的该注解

JWT
```
登陆后密码加密
    对接口权限可校验
        只有是我的用户 才能请求我的接口 接口拦截
        对 服务 + 资源 访问进行验证
    对身份验证 不带密码 验证
        降低 携带 密码 泄露
    经过签名，发的消息 没有经过伪装
        ！知道token 就可以模拟
    SSO单点登陆 
优点
    简介 header 小 快
    自包含 请求自己包含 避免多次查询数据库 ？
    JSON跨语言
    服务端不保存会话 分布式微服务使用
```

# 2020-12-4
RestTemplate 请求
@PostConstruct 快速构建 项目启动及执行

# 2020-12-27
new Thread(()->{
    // TODO something
}).start();

# 2021-3-22
关于参数校验
开启校验    javax.validation.Valid
对象集合空校验  javax.validation.constraints.NotEmpty
参数空校验  javax.validation.constraints.NotNull

401 没有访问权限，没进入系统
403 进入系统了，没有接口权限

# 2021-3-22
普通mvc接口到文件（如excel）
HttpServletResponse  getOutputStream() 给这个直接写入数据 就行 记得.close();

RESTful API 
ResponseEntity<btye[]> 
.ok()
.contentType(MediaType.APPLICATION_OCTET_STERAM)
.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=<文件名带后缀>")
.body(<内容>)

接口javax包 过滤 校验
@Valid

日期格式转换
@DateTimeFOrmat(iso = <想要的标准化格式>)