# 2020-12-27
修改字段长度命令
alter table 表名 modify column 列名 类型(要修改的长度);

mysql修改字段名：  
ALTER  TABLE 表名 CHANGE 旧字段名 新字段名 新数据类型;   

如果报错3072字节 是索引的字节数不能超过3072。

过程是这样的，要修改一个字段的字段长度，想设置为2000字段长度，但是这个字段有索引，修改成2000字段长度，索引就超过了2000字段长度，

做法：先删除之前的索引 

然后添加索引 alter table table_neme add index `Column` (`Column`(1024))

再修改字段长度就可以了


ALTER TABLE product_date_price_f ADD UNIQUE INDEX u_product_date_price_2 (`product_id`, `res_id`, `departs_date`, `del_flag`,`stock_risk_attr`);
DROP INDEX u_product_date_price_1 ON product_date_price_f;


alter table 表名 add unique key [索引名称]  (字段); // 唯一索引
alter table t_dept add unique index index_name(name);

修改字段
ALTER TABLE 表名 CHANGE COLUMN  原字段 新字段 类型 ...;


# 2021-1-8
数据库查询时，老是提示错误，用不了GROUP BY
select version(), @@sql_mode;
set global sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
set session sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

# 2021-1-11
命令连接
mysql -P -h -r -p
退出命令行
quit
mysql查找my.cnf文件
mysql --help|grep my.cnf