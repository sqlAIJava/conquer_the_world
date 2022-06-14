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
docker exec -it交互式运行 <containerName> bash
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
# 2022-6-8 Docker 灵魂探讨
## image 的 得来
由Dockerfile生成
```
cd到目录，构建image
docker build -t <镜像名字> .
```

## Dockerfile 语法
```
一层一层Layer的过程
entrypoint执行 = CMD 会覆盖docker-entrypoint.sh中的内容
COPY 宿主机文件 image路径 = ADD 会自动解压压缩包
RUN 镜像里执行一些命令
ENV 环境变量
VOLUME  image主机安装地址 
EXPOSE image里的端口 宿主机端口
MAINTAINER 作者申明
LABEL 标签识别 作者信息
```

## SpringBoot jar 做成 image
```Dockerfile
FROM openjdk:8

MAINTAINER sql

LABEL name="dockerfile-demo" version="1.0" author="sql"

COPY 宿主机文件相对dockerfile位置   image里面（可以加后缀.jar）

CMD ["java", "-jar", "test.jar"]
```

## Servlet / SpringMVC war 做成 image 
deploy ---> tomcat
```Dockerfile
项目COPY TO Tomcat Image webapps/
```

## image 共享
```
docker 位置
    > cd /var/lib
        > cd docker
            > cd image/
                > cd overlay2/
                    > ls

docker 推送至 Hub中
    > docker login

    > docker tag别名副本 test-docker-image sqlong/test-docker-image:v1.0

    > docker push sqlong/test-docker-image:v1.0
```

## docker 设置阿里云镜像仓库站点加速器
```
/etc/docker/daemon.json
    > {...}
```

## 推送至 阿里云 docker仓库
```
sudo docker login --username=阿里云账号 registry.cn-hangzhou.aliyuns.com
```

## 自己的docker 仓库
harbor
```
修改配置文件，harbor.cfg

--- docker-compose.yml

sh install.sh
```

## image TO container
```
Container 基于 image layer
```

## container 逆向 image
```
docker commit 已有的容器名 生成的容器名
```

## container 核心 cpu 内存 资源
```log
docker log contain_id

docker top contain_id_name

docker status contain_id_name
```

指定 --memory 100M --cpu-shares 10相对分片

## Linux 机器 监控 工具 weaveworks/scope 资源


## Linux 隔离
namespace 隔离 pid net mnt持久化过载

CGroups 隔离 资源 内存 cpu

Union file systems 区分 image/container 

# 应用进行通信[分布式/微服务] ip iptables 网络 
## 计算机网络模型
7 / 4层 

两台计算器通信
```
网卡 信息
ifconfig / ip a / ipconfig / ip link show / ls /sys/class/net 看网络 网卡 通信网段
    lo 本地
    eth0 互联网
    eth1 宿主机 / 物理主机
    docker0 docker通信

与 基础层 的 数据链路层 交互

唯一的MAC地址

网卡 以 文件形式存在  计算机中
``` 

## 增加/删除 IP 地址
```
ip addr add ip/24位子网掩码 dev设备 eth0网卡

ip addr delete ip/24位子网掩码 dev设备 eth0网卡

ifup/ifdown开启/关闭 eth0网卡
```

## 网卡属于Linux系统的，怎么做 namespace 隔离 网卡
```
ip netns add nsl 创建一个network namespace
ip netns list 查看

ip netns exec nsl新的namespace ip a 

ip netns exec nsl新的namespacename <net相关指令>
            > ip a
            > ifup lo
            > ...

lo 回环地址网卡
```

## veth pair : Virtual Ethernet Pair 成对--->两个网卡
创建出来时默认能够连接的，分别给 两个新的 namespace 网卡

创建 可连接的 net
ip link add veth-ns1网卡名字 type veth peer name veth-ns2网卡名字

分别分发给两个namespace，
ip link set veth-ns1网卡名字 netns ns1新的namespace

## 给 namespace 添加 ip 地址
ip netns exec ns1 ip addr add ip/24 dev veth-ns1

## 启动 namespace 的 ip
ip netns exec ns1 ip link set veth-ns1 up

ip netns exec ns1 ip a 查看 

## 给 第二个 namespace 添加 ip
ip netns exec之下 ns2 ip addr add ip/24 dev veth-ns2

## docker 网络
namespace + 网卡实现

网口 21 ~ 23 刚觉不像一对 ，没有用veth pair吗？

有用 ， docker0做桥接

新的namespace的pair 与 docker0 的pair通过

## 验证 docker0桥接
yum install bridge-utils

brctl show

ip a 查看宿主机 网段

docker exec -it 容器名 ip a 查看容器的所有网段

## 宿主机 ping container ping container ok
有docker0 同一个网段

docker network ls
bridge 桥接 模式

不够用时 可以用
docker network create mynet指定网络 网段自动上1从17
docker run --network指定网络  --ip指定ip

docker 新网络 之间网段 ping 不通 172.17..... not ping 172.19.........

## 解决不同网段 ping 通
容器 添加到 网络 进去
docker network connect 添加入的网络 被添加的容器

## 容器名 ping 容器名 (单机集群 案例)
link 共同的交接

docker 默认 网络 无法 两个容器 ping 名字
* 自定义的 网络 确实可以的
```
桥接的方式
docker 会自动 添加一条DNS记录
```

默认的 ping 加run 参数
docker run --link 要ping的容器名

link 不好用 不好用

一般用 新网络

单机集群mysql
docker run -d --name m1 --network mysql-net mysql_image
docker run -d --name m2 --network mysql-net mysql_image
docker run -d --name m3 --network mysql-net mysql_image

## docker 网络模式
bridge 
host
null
自定义

## 多机 相通
Vxlan

overlay docker 多机网络通信

# 容器 destroy 持久化 数据 存储
## Docker 中 container 为 中心
```
容器里的安装 VOLUME 安装位置

创建挂载别名位置
docker volume create --name v1

dcoker volume ls

dcoker volume inspect查看 VOLUME_ID
```

## 误删 可恢复 根据 VOLUME_ID
mysql_volume container 恢复
* docker run -v mysql_volume已经存在的:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 mysql

## docker run 自定义挂载
docker run -v 宿主机位置/自定义的VOLUME_ID:容器位置 
* 数据实时同步 默认也是 宿主机=容器内

## Bind Mounting 
任意宿主机位置 挂载 容器内的任意位置
- v 任意：容器任意
实时同步 === 开发者改宿主机的东西 自动 挂载

## 部署 --- 集群 mysql
数据同步性
Replication 
```
弱一致性
速度快，无需所有节点都成功
异步复制，无法保证每个节点都一致

低价值数据 评论。。。。。。
```

PXC
Percona XtraDB Cluster
```
强一致性

订单 抢红包。。。。。。
```

docker tag 有的镜像 要打成的进项
docker images 可查看

创建网络 》 创建别名挂载 》 创建容器 - 关联PXC集群关系 -e CLUSTER_JOIN=已经有的容器

## HaProxy container 请求分化
docker run 端口被占用
先把contains rm -f 掉 ， 因为还在Created

## SpingBoot docker 集群
改DB_ip DNS 》docker network  > dockerfile > images > docker VOLUME > run container (mysql网段和boot的network 一样 也可以不一样) > nginx 配置文件 》 run nginx 

## network volume container image
写好多docker命令 比较混乱 

# docker-compose .yml 单机多容器 管理
docker-composr up -d -f指定的容器 
docker-composr down关闭

# docker-swarm mesos kubernetes 多机多容器 管理 编排
cpu 1  mem 1024M = docker-swarn * 2 = k8s

manager
策略分发 + 健康检查 + 服务发现 + 请求调度 + 数据分布式存储
cli > manager > worker

* docker swarm ...

## 多机通信 VXlAN
docker server create ... --network 类型 overlay， swarm join 之后
docker network create -d overlay my-overlay-net

* 节点的 端口 都打开了

## Ingress network 端口的软负载 转发
类似iptabs 请求分发
（tomcat + IPVS） + （tomcat + IPVS） + （tomcat + IPVS） 

集群里的端口 造成浪费

tomcat 集群多台 统一的请求分发 案例
docker service --name whoami -p 8000:8000 --network my-overlay-net -d jwilder/whoami
whoami 集群单个是谁
curl ip:port

## docker swarm 负载均衡
对应节点
LoadBalance

自动存在 DNS 的解析
* 当集群边多的时候 统一入口
curl 到 主IP:port 
* Internal 做了负载均衡 LoadBalance ;;; 前提是 manager 中 docker server scale ....=3台

## docker stack 类似多机多容器 管理 ~~~ docker compose

docker service scale 编排
docker service ps查看详情 容器名

# K8s/Kubernetes 容器 管理 和 编排
服务发现 容器编排 Google > Borg 15years ---> K8s
gartner forrester 分析报告
云原生时代的基础设施
* Cloud Native 云原生
CNCF 15年 Linux基金会 
```
    服务器硬件
        > 很多个VM虚拟机

        > docker container

    公有云、私有云、混合云
        > 软件迁移 复杂

        > K8s 管理 container容器
```

* K8s 迁移 容器 到云上
```
    gRPC 服务层面远程调度

    Linkerd 服务网格 代理转发流量
```

开发很简单 > 技术增加 > deplay问题越多

* 把容器应用，运行在 任何时机 任何地方

* 13 年 马丁大叔 > 微服务

## K8s 结构
```
    K8s
        > Deployments 控制 ReplicaSer or Pod
            > ReplicaSer 扩缩容
                > Pod 豌豆 最小单位控制
                    ```
                    Service 管理相同的 Label 共同的属性 key-value 的 Pod ;
                        ```
                        Selector 某个组件选择别的组件
                        ```
                        Label 分门别类 key=value app=login
                    ```
                    > 大量 Container
```
```
    work节点
        Node 物理机器 多个 组成 K8s集群
        ```
            Master Node \ Worker Node
        ```
            > 多个Pod
```

## K8s 环境搭建的方式
* The hard way
```
    比较难 Github  kubernetes-the-hard-way
```

* The easiest way
```
    Play with Kubernetes 在线
```

* 普遍搭建方式
```
    kops github 在云服务中 用 搭建
    coreos      在企业级中 搭建

    minikube    本地单机的k8s         封装步骤
    kubeadm/二进制 本地及集群的k8s     封装步骤
```

* 2G RAM AND 2 CPUs or more

## 集群架构
TODO 图片 找找再放 

# Service Mesh


## 安装teamcity笔记
```shell
docker run --name teamcity-server-instance  \
-v /docker/data/teamcity_server/datadir:/data/teamcity_server/datadir \
-v /docker/opt/teamcity/logs:/opt/teamcity/logs  \
-p 8111:8111 \
teamcity-server


docker run -e SERVER_URL="http://192.168.3.211:8111/"  \
-u 0 \
-v /data/teamcity_agent/conf:/data/teamcity_agent/conf \
-v /var/run/docker.sock:/var/run/docker.sock  \
-v /opt/buildagent/work:/opt/buildagent/work \
-v /opt/buildagent/temp:/opt/buildagent/temp \
-v /opt/buildagent/tools:/opt/buildagent/tools \
-v /opt/buildagent/plugins:/opt/buildagent/plugins \
-v /opt/buildagent/system:/opt/buildagent/system \
teamcity-agent

docker run -e SERVER_URL="http://192.168.3.211:8111/"  -u 0 -v /data/teamcity_agent/conf:/data/teamcity_agent/conf -v /var/run/docker.sock:/var/run/docker.sock  -v /opt/buildagent/work:/opt/buildagent/work -v /opt/buildagent/temp:/opt/buildagent/temp -v /opt/buildagent/tools:/opt/buildagent/tools -v /opt/buildagent/plugins:/opt/buildagent/plugins -v /opt/buildagent/system:/opt/buildagent/system teamcity-agent
```