# 纪要

## 2020-11-10
测试地址是否可用
ping 
测试地址+端口是否可用
telnet host ip

## 2020-11-26
netstat -ano|findstr "port/pid"
tasklist|findstr "LISTENING"
taskkill /T /F /PID LISTENING       /F强制 /T子进程

# 2020-12-3
创建文件
fsutil file createnew <filename> <length>

# 2022-10-15
java -jar 启动报错 nacos 配置文件找不到
-Dfile.encoding=UTF-8
```
java -Dfile.encoding=UTF-8 -jar xx.jar
```