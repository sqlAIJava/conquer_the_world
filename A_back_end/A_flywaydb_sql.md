# 2020-12-1
flywaydb 便于版本 管理sql
* V版本号__作用_名字.sql
    ```
    版本控制：
        V后面的版本号区分
        增，改，删表等记录
    1：引入 flyway-core 依赖
    2：resource 下建立 db.migration 用于存放 不同版本的 .sql
    3：配置 yml 中 flyway
        spring: 
            flyway:
                enabled: true
                clean-disabled: true
                baseline-version: 0
                baseline-on-migrate: true
                locations: classpath:db/migration
    ```

# 2021-3-19
当一条记录失败后，需手动干预处理，记录