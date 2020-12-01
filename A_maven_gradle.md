# 2020-11-23
Maven
    构成属性
        groupId,artifactId,version
    Nexus仓库版本
        SNAPSHOT 快照版
            ```
            拉取机制 配置
                <updatePolicy>daily,always,interval:30,never</updatePolicy>
            ```
        RELEASE  正式版
            ```
            缓存机制
            ```

Gradle
    本地缓存？位置 更新策略
    ```
    configurations.all{
        resolutionStrategy.cacheChangingModulesFor 0,"secondes/minutes/hours"
    }
    ```

# 2020-11-30
打包
sh mvnw package
启动main入口函数程序
sh mvnw exec:java@SYNCASYNCMODE -DACCOUNT_HOST=YOUR_COSMOS_DB_HOSTNAME -DACCOUNT_KEY=YOUR_COSMOS_DB_MASTER_KEY
mvn exec:java -D exec.mainClass=GetStarted.Program
    ```
    exec 运行
    ```

屏蔽test环节
    mvn package/install -Dmaven.test.skip=true

启动springboot项目
    mvn spring-boot:run

指定profiles active 配置环境
```
mvn spring-boot:run -Ptest 指定mvn的 一般打包用 配合 build 对应的 构建指定文件
mvn spring-boot:run -Dspring-boot.run.profiles=test 直接指定springboot启动的环境
java -jar -Dspring.proflies.active=test xxx.jar jar包启动指定方式
```