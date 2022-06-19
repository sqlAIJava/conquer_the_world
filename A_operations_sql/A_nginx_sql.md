# 2020-1-7
服务器上占用端口，进行转发代理服务


# 重启服务
./nginx -s reload

# 指定配置文件
./nginx -c <nginx.conf>

# 启动
nginx.exe 回车

# nginx.conf 配置
server {
    相当于一个 服务容器
}

80端口 = http
443 ssl 端口 = https

# 一个server部署多个前端 = 配置多个location = 配置多个server
```
location / {
        proxy_pass http://127.0.0.1:20005;
        # root   E:\projects\wonders\xylink_dist;
        # index  index.html index.htm;
}

location /rtc {
        # 别名
        alias   E:\projects\wonders\xylink_dist;
        # index  index.html index.htm;
}

location /appapi/ {
        proxy_set_header Host $host;
        proxy_set_header  X-Real-IP        $remote_addr;
        proxy_set_header  X-Forwarded-For  $proxy_add_x_forwarded_for;
        proxy_set_header X-NginX-Proxy true;

        proxy_pass http://127.0.0.1:20000/;
    }
```

# 生成https证书, 配置Nginx， 使用JDK
生成JKS(.keystore)证书
```
keytool -genkey -v -alias lgy.com -keyalg RSA -keystore d:\lgy.com.keystore -validity 3650

keytool.exe                 为jdk/bin下自带工具
lgy.com                     填域名 或者 IP
d:\lgy.com.keystore         生成目录下的证书文件 以.keystore结尾
```

JKS 转成 PEM
```
先百度下载JKS2PFX

JKS2PFX.bat d:\lgy.com.keystore 123456 lgy.com exportfile

keystore：KeyStore文件绝对路径
password：KeyStore文件对应的密码
alias：生成证书CSR时，所起的Alias别名
exportname：准备导出的文件名称 (不要带扩展名)

常用证书格式：JKS(.keystore)，微软(.pfx)，OPSSL之PEM(.key + .crt)，其中tomcat使用JKS格式，nginx使用PEM格式
```

拷贝文件值Nginx
```
该命令将server.jks中别名为lgy.com的SSL证书导出，运行后将在jks2pfx的按照目录产生3个文件：
exportfile.key、exportfile.crt、exportfile.pfx；

将exportfile.key、exportfile.crt复制到nginx的conf目录，并将exportfile.crt重命名未exportfile.pem
```

配置Nginx, 访问https 443 ssl
```
# 可以不配80 表示 http
server {
    listen       80;
    server_name  localhost;
    #将http请求自动跳转到https上
    return 301 https://$server_name$request_uri;
}
 
# 443 表示 https 必须要配置
server {
    #监听443端口
    listen       443 ssl;
    server_name  localhost;
 
    #证书路径。从conf开始找
    ssl_certificate      exportfile.pem;
    ssl_certificate_key  exportfile.key;
 
    ssl_session_cache    shared:SSL:1m;
    ssl_session_timeout  5m;
 
    ssl_ciphers  HIGH:!aNULL:!MD5;
    ssl_prefer_server_ciphers  on;
 
    location / {
        #反向代理http://127.0.0.1:8080
	    proxy_pass http://127.0.0.1:8080;
    }
}
```

# 请求前缀
```
不带/api/访问目标
注意前后/
    location /api/ {
        #反向代理http://127.0.0.1:8080
	    proxy_pass http://127.0.0.1:8080/;
    }
```

# nginx.conf 模板
```conf

worker_processes  1;

events {
    worker_connections  1024;
}


http {
    include       mime.types;
    default_type  application/octet-stream;

    sendfile        on;

    keepalive_timeout  65;


    server {
        listen       80;
        server_name  localhost;

        location / {
            root   /usr/share/nginx/html;
            index  index.html index.htm;
            try_files $uri $uri/ /index.html;
        }

        location /base/{
            proxy_set_header Host $host;
            proxy_set_header X-Real-IP $remote_addr;
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header X-Forwarded-Proto $scheme;
            # 后端jar启动后访问位置
            proxy_pass http://10.1.192.238:20103/;
        }

        error_page   500 502 503 504  /50x.html;
        location = /50x.html {
            root   html;
        }
    }
	
}
```