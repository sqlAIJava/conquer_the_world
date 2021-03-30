# 每一天的常用或查找使用过的命令记录

## 2020-11-10
docker images 
docker ps [-a]
docker run --name some-container-name -p docker_port:host_port -d images-repository-name:tag
docker image rm images-repository-name:tag
docker rmi -f images-repository-name:tag
docker exec -ti some-container-name/id bash
docker stop some-container-name
docker container rm some-container-name
docker container prune
docker restart some-container-id
docker search images-name

# 2020-11-12
docker update --restart=always <container id>

# 2020-11-23
docker save 名 > 名.tar
docker load < 文件路径
docker-compose.yml 构建文件
docker-compose stop
docker-compose up -d
增量更新 另起一个 前提依赖requirements.txt 不变

# 2021-1-11
添加当前用户到docker组
sudo groupadd docker
sudo gpasswd -a $USER docker
newgrp docker
docker version
删除容器
docker rm <contaninerID>
查看容器日志
docker logs <containerName>
进入docker 容器服务 命令
docker exec -it <containerName> bash
退出docker 容器服务 命令
exit;

# 2021-3-30
CentOs7安装docker
1：sudo yum install -y yum-utils 安装 软件包
2：sudo yum-config-manager \
    --add-repo \
    https://download.docker.com/linux/centos/docker-ce.repo
    添加储存库

3：sudo yum install docker-ce docker-ce-cli containerd.io 
    安装最新版本的Docker Engine和容器
[
    sudo list docker-ce --showduplicates | sort -r 
    列出储存库中的可用版本
    sudo yum install docker-ce-<VERSION_STRING> docker-ce-cli-<VERSION_STRING> containerd.io
    安装指定版本的Docker Engine + Containerd 
] 
4: 启动Docker
    sudo systemctl start docker
[
    sudo docker run <containerd-name>
    可以尝试启动一个实例
]

5：卸载Docker 
    sudo yum remove docker-ce docker-ce-cli containerd.io
    删除主机上的 容器，图像,卷
    sudo rm -rf /var/lib/docker
    sudo rm -rf /var/lib/containerd

分配Docker 命令使用权限
1：分组命令
    sudo groupadd <docer 组名>
2：添加用户进去 docker 组
    sudo usermod -aG <docker 组名> $USER
3：激活对组的更改
    newgrp <docker 组名>

自动启动服务 systemd 管理系统启动时启动的服务
sudo systemctl enable <docker.service 服务名>

禁用自动启动 
sudo systemctl disable <docker.service 服务名

重启服务
sudo systemctl restart <docker.service 服务名>
