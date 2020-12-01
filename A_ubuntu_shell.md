# 每日常用的Ubuntu20命令记录

## 2020-11-10
sudo cat 文件地址
sudo su - root
vim 文件地址
ls
ll
mkdir 
cd ../
cd 
apt install 
ifconfig -a 
curl ifconfig.me
tracert url
vim :wq 保存并退出

## 2020-11-11
sudo apt-get update
ls -l /usr/bin | grep python

## 2020-11-23
scp 文件名 远端服务器:/用户

## 2020-11-24
shutdown -r now 
reboot
shutdown -h now

# 2020-11-27
ssh 地址
tmux a 分屏root权限
exit gi
tig
crtl b c / w  j/k 
crtl b " / %  exit
crtl b 反向键 / o 
crtl b z 
crtl b [    page Up /Down
vim 改代码
tmux win pane 
git tig
tmux

# 2020-12-1
安装MySQL 8 
    ```
    1: wget ttps://dev.mysql.com/get/mysql-apt-config_0.8.12-1_all.deb
    2：sudo dpkg -i mysql-apt-config_0.8.12-1_all.deb
    3：sudo apt-get update
    4：sudo apt-get install mysql-server;1,2,3不做安装的是5.7
    5：设置密码，选择加密方式，ok
    6：mysql -u root -p
    7：设置远程访问
        use mysql;指定库操作
        select host, user, authentication_string, plugin from user;查看已有的权限
        ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';修改root 密码 和 加密方式
        grant all on *.* to 'root'@'%';授权远程root任何连接
        flush privileges;刷新权限
    ```
卸载等方式
    ```
    sudo service mysql start;启动
                       status;查看状态
                       stop;停止
    sudo apt-get autoremove --purage mysql-server
    sudo apt-get remove mysql-server
    sudo apt-get autoremove mysql-server
    sudo apt-get remove mysql-common
    dpkg -l |grep mysql|awk '{print $2}' |sudo xargs dpkg -P;清理残留数据
    ```

后台运行运行
````
nohup Command命令 [ Arg ... ][ & ]
nohup java -jar xxx.jar &
nohup java -jar xxx.jar > nohup.log 2>&1 &
```

curl中文乱码
```
 curl -G --data-urlencode "question=asdasd问题sssas" http://10.0.1.11:8080/api/search  
```

删除
```
rm -r向下递归f强行删除
rmdir
```

查找进程
```
ps -ef|grep java
kill -9 70056
```

创建
```
mkdir java
vi java.java
echo > java.java
touch > java.java
```

拷贝
```
```