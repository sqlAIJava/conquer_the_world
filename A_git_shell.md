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
