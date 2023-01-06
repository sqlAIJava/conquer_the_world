# 要点纪要

# 2020-11-13
git clone 
git add .
git commit -m "add: update: test: docs: remove: create: fix: change：release: merge: chore: "
git status 
git pull --rebase
git push [-u r_name 本地/远端_master]
git branch 
git remote
git branch -d b_name
git remote add r_name(origin) <remote-url>
git remote rm  r_name(origin)
git remote set-url r_name(origin) <remote-url>
git config --global user.name(user.email) ""

# 2020-11-19
git push origin(远端在本地的名字) dev(本地的分支名)：dev(远端要新建的分支名)
git push origin :dev  删除远端的dev分支
git push origin --delete dev 同上

# 2020-11-20
切换分支
git checkout -b dev（本地新建分支） origin/dev(远端分支名) 
git clone 理解把远端的分支全拉了下来只不过是master在本地，想切换用上面一行命令，原因上一行命令打印日志并没有下载的记录Branch dev set up to track remote branch dev from origin.Switched to a new branch 'dev'
gitk 图形化历史界面
同一个文件下，分支切换，文件夹会发生变化

# 2020-11-23
git remote -v 查看详细的远端配置
git pull <remote> <branch>
git branch --set-upstream-to=origin/<branch> master
git push origin HEAD:main 当远端名字和本地名字不一致时

# 2020-11-27
git reflog
git pull origin master --allow-unrelated-histories
git remote add vm2 azureuser@40.73.36.88:~/gitrepo/testgremlinapi.
git
服务器变成仓库的？

# 2021-1-7
git checkout . 一般用于调试还原

# 2021-3-20
CentOS 7 安装 git 1.8
yum install git

设置RSA Key  密钥对
ssh-keygen
回车后 注意 位置 .ssh

4串1

克罗地亚（1） ： 巴西（2）

荷兰（0）：阿根廷（1）

摩洛哥（0） : 葡萄牙（3）

英格兰（1）：法国（2）

16倍

2串1

克罗地亚 Vs 巴西  买 巴西赢
荷兰 Vs 阿根廷 买 荷兰赢

10倍

选4场过3关

克罗地亚 ：巴西 （买巴西赢）
荷兰 ：阿根廷（买阿根廷赢）
摩洛哥  :  葡萄牙（买葡萄牙赢）
英格兰 ：法国（买法国赢）

10倍