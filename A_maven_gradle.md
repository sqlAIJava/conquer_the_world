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
    
