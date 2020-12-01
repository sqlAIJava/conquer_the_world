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

