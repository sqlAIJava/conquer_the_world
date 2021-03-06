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
立刻重启
shutdown -r now 
reboot
立刻关机
shutdown -h now

# 2020-11-27
ssh 地址
tmux a 分屏root权限
exit gi
tig
crtl b c / w  j/k 
crtl b " / %  exit
crtl b 反向键 / o 
crtl b z 放大pane
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

查看后台运行任务
```
jobs
```

curl中文乱码
```
 curl -G --data-urlencode "question=asdasd问题sssas" http://10.0.1.11:8080/api/search  
```

curl 打印html标签
curl  url -k 

删除
```
rm -r向下递归f强行删除
rmdir

删文件 后面 带上 /
删多个 用 空格 隔开 
```

查找进程
```
ps -ef|grep java
kill -9 70056
```

创建
```
创建文件
mkdir java
vi java.java
echo > java.java
创建文件夹
touch > java.java
```

拷贝
```
复制文件到指定地方
cp -r <需要拷贝的文件> <.表示以创建><目标全路径>
```

# 2020-12-2
GNU 内核
nano 命令

# 2020-12-4
tmux 关闭windows 
tmux ls
tmux kill-window -t <id>
exit 退出tmux 也能 关闭pane

命令行请求 设置 方式 头部信息 参数 结果换行
curl url -X POST -H "token:asdas" -d 'xxxxxx' -w '\n'

# 2020-12-9
解压.gz文件
gzip -d xxx.gz 

# 2020-12-15
tmux 操作
直接tmux 会新建界面
tmux ls 查看
tmux kill-window -t <id> 
tmux at -t <id>
ctrl b
    & y     关闭窗口

exit 针对 bash 子程序

tmux出去不关闭
出 不关闭 ctrl b / d 

# 2021-1-7
实时查看文件
    tail -f ***.log

命令行换行 \ 回车

拷贝一个文件到服务器
sftp
scp

sftp连接服务器
sftp -P 端口 用户@ip

查看进程起来没
ps aux | grep gun
查看网咯端口又没被占用
netstat -anp | grep 8000

# 2021-1-11
查看ip 地址
ip addr
ifconfig

查看防火墙状态 inactive为关闭 
sudo ufw status

重启服务
service mysql restart


PuTTY添加SSH Key
https://cloud.tencent.com/developer/article/1471206

# 2021-3-20
查看netstat 网表 看某个服务 是否再端口被监听，
sudo netstat -lntp | grep <dockerd 服务名 模糊>

# ssh 连接服务器
ssh 用户名@外网IP [ -p 端口 ]

# 退出服务器
logout

# scp 上传文件至服务器
scp <文件> root@ip:<目的地>

# scp 上传文件夹至服务器
scp [-v debug日志] -r[递归] </文件夹> root@ip:<目的地>

多个文件 用 空格 隔开
下载至本地 只需要 不填上传时的 <文件就行> 
scp -r root@ip:/var/temp .
.表示等地目录

下载多个文件
scp root@ip:/var/\{index.html,json.js\} .

# CentOS 查看内核版本
uname -r

# 比ping要更强一些，可以看到更多信息
nslookup <baidu.com>

# 查看Linux是什么系统
```
cd ~
cd /proc
cat version
```

# contos 安装 程序
```
sudo yum install <名字>
```

# 查找文件 在什么位置有
```
find / -name <名字>
```

# CentOS 端口 防火墙
```
查看开放的端口列表 
firewall-cmd --zone=public --list-ports

添加开放端口
firewall-cmd --permanent --zone=public --add-port=8088/tcp

刷新开放端口列表
firewall-cmd --reload

关闭/启动/重启防火墙
systemctl stop/start/restart firewall.service

查看防火墙状态
systemctl status firewalld
```

# 重命名文件名
mv a b

# 移动重命名 (将a目录移动到home下为temp目录)
mv /a /home/temp