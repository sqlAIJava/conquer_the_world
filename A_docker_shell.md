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
