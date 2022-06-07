# 每一天的常用或查找使用过的命令记录

## 2020-11-10
docker images 
docker ps [-a]
docker run --name some-container-name -p docker_port:host_port -d images-repository-name:tag
docker image rm images-repository-name:tag
docker rmi -f images-repository-name:tag

进入docker容器
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

# 查找Docker Hub 的有哪些镜像
docker search <nginx>

# 拉取镜像
docker pull <nginx>

# 2022-6-7 Docker 开篇记录 1
定义
```
传统：
    > 基础设施 + 不同系统 + 软件应用

虚拟机：
    > 基础设施 + 不同系统 + 多个VM太重 （不同系统 + 软件应用）

容器：
    > 基础设施 + 不同系统 + Docker Engine (Image + Containers)
```

应用 
    > 代码 + 配置 + 环境 
        > image 
            > container

虚拟化 ~ 容器 区别
```
VM 中 要核定的OS 宿主主机的 资源
Docker 直接要 宿主机 资源 如 100M 0.5核
```

更好的安装虚拟机
```
vagrant(配置镜像) + VetrouBox

Vagrantfile精髓文件
```

docker 流程 
```
docker client 
    > docker server
        > docer hub
```

docker 删除全部镜像
```
docker rm -f ${docker ps -aq}
```

与Kubernetes 结合使用
```
            一台主机 多容器的 编排   多机的跨机容器管理    
Kubernetes ---> Docker compose ---> Docker Swarn（过时） --->  
```

Docker 到底是什么 ？ 为什么一个images 弄出那么多 containe ? 怎么设计Docker 
```
中间件 到 部署
docker 将 中间件从下载到部署完成 全做了步骤

docker 每一个> 都是一个 layer
    > container layer层级 
        ···上是自定义层 下是镜像基础层不可更改···
        > Custom自定义的 image = [如：mysql 代码 文件]
            > Centos..... Image 基础系统镜像
                > Linux Kernel内核 
```

## 查看docker 的网络
docker network ls
```
打印出
bridge 网桥
host   主机
```

## 查看docker 具体网络
```
docker inspect bridge
```

## 问题：持久化、网络化、物理存储化？