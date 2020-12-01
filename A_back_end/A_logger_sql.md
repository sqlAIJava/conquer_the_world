# 2020-12-1
springboot
    slf4j接口 + Log4j2实现
        ```
        1: 导入 spring-boot-starter-log4j2 pom
        2：屏蔽 spring-boot-starter-web 的默认日志依赖
            <exclusions><!-- 去掉springboot默认配置 -->
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-logging</artifactId>
                </exclusion>
            </exclusions>
        3：导入Log4j2.xml 配置
            [Log4j2.xml](../A_resource_sql/Log4j2.xml)
        4：配置 yml 文件
            logging:
                config: classpath:logger/Log4j2.xml
                level:
                    com.laiye.knowledgegraph.mapper: trace
        5：建立 Log4j2 工具类，方便调用
            [Log4j2Util.java](../A_resource_sql/Log4j2Util.java) 
        ```
