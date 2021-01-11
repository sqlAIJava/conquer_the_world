# 纪要

## 2020-11-10
测试地址是否可用
ping 
测试地址+端口是否可用
telnet host ip

## 2020-11-26
netstat -ano|findstr "port"
tasklist|findstr "LISTENING"
taskkill /T /F /PID LISTENING       /F强制 /T子进程

# 2020-12-3
创建文件
fsutil file createnew <filename> <length>
