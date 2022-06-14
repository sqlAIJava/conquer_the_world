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

# mysql一般安装位置
/etc/mysql

# mysql 取消127.0.0.1绑定地址
注释掉/etc/mysql/mysql.conf.d/mysqld.cnf
中的bind-addres = 127.0.0.1

# 后台运行运行
```
nohup Command命令 [ Arg ... ][ & ]
nohup java -jar xxx.jar &
nohup java -jar xxx.jar > nohup.log 2>&1 &
```

# 查看后台运行任务
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

查看进程起来没 & 关闭软件
ps aux | grep <gun>
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
```
cat /etc/*-release
```

# contos 安装 程序
```
sudo yum install <名字>
```

# 查找文件 在什么位置有
```
find / -name <名字>
```

# CentOS Linux 端口 防火墙
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

# 服务管理命令
sudo systemctl status redis-server <redis>
```
systemctl 方式管理 redis 服务
隶属于 systemd
```

sudo service redis-server status
```
service 方式管理 redis 服务
```

# 查看java安装位置 | java有几个版本 | 更换java版本
update-alternatives --config java

# root身份打开文件夹
sudo nautilus

# 文件权限
drwxrwxrwx   -rwxrwxrwx   drrwxr-xr-x
第一个rwx 所有者用户
第二个rwx 同组用户
第三个rwx 其他用户组
r 读
w 写
x 执行

# 设置文件权限
sudo chmod 777 <文件名>  开放所有读写执行权限

# 打开文本编辑器
sudo gedit <文件名>

# 查看服务目录
whereis <nginx>

# 模糊查找服务
whereis | grep <模糊名>

# ssh退出服务器
exit 回车
logout 回车

# ubuntu登录windows服务器
rdesktop [options] server[:port]    
rdesktop -f -a 16 -u Administrator 10.1.192.237 -r disk:abc=/media/sql/DATA/A_work_sql/2021_sql/wanders_zf/work_space/wd_idea/svn/A_wegov_2_to_3/source/wegovb/target
```
命令参数常用的有：
-u用户名
-p密码
-n客户端主机名（显示windows任务管理器中的连接客户端名）
-g桌面大小（ 宽＊ 高）[也可以用 x(小写的X)]
-f全屏模式,从全屏模式切换出来按Ctrl+Alt+Enter
-a连接颜色深度（最高到16位），一般选16才会显示真彩色（window7支持32位）
-0数字0表示连接上windows控制台，等效mstsc/console命令

后接参数:
rdesktop <ip> -r clipboard:PRIMARYCLIPBOARD -r disk:abc=/home/xxx/test/
-r clipboard:PRIMARYCLIPBOARD是允许共享剪切板.
-r disk:abc=/home/xxx/test/这个是将'/home/xxx/test'这个文件夹映射到'abc'这个目录下.连接上之后,可以通过将文件复制粘贴到'abc'文件夹内,来实现文件的转移
```

# 查看体系版本 如 x86 x64
file /bin/bash
arch

# 将普通用户加入权限组
sudo gpasswd -a <sql> <docker> 
```
sql用户 加入到 docker组
```

# 刷新权限组
newgrp <docker>
```
刷新docker组
```

# Terminal命令行清屏，置顶
```
claer 回车
```

# 查询历史指令
history | grep <seach name>