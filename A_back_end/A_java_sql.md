# 2020-12-15
String.format() 格式校验规则
Pattern 定义正则匹配模型
Matcher 正则匹配匹配器

# 2021-3-22

# 2021-5-8
多线程
Thread 
Runable
Callable/
ThreadLock

interrupted 复位 
wait sleep join ... 阻塞方法
notify 

总结
1. start 启动  
2. interrupt() 终止
3. interrupted() 重置
4. InterruptedException 重置 可以结束了 时间给到使用者 告知能停止了

new
running
    ready
     调度 yield 
    running

    waiting 
     seelp,wait,join,LockSupport.park
     notify,notifyall,LockSupport,unpark
    time_waiting
     带时间参数的
    blocked
     synchronized -> t1/t2 t1获得了锁 -> t2 的状态

terminated

任务链
 接收 -> 打印 -> 保存


## 2021-6-8 锁
对象锁 + 类锁
```
锁目标生命周期 的 不一样
```
对象【new Object(); this; funcation(){};】
类【Object.class; Demo.class; static function(){}】


##  对象访问定位方式
```
通过Java栈本地变量栈的reference数据来操作堆上的具体对象
虚拟机实现：> 1。使用句柄 （句柄地址稳定）
                ```
                reference中存储对象句柄地址 --->>> [句柄池（实例数据的指针，实例池（对象实例数据）[Java堆];;;方法区（对象类型数据）]
                ```
           > 2。直接指针 （快，少一次指针）
                ```
                refernce中存储对象句柄地址 --->>> [Java堆（对象实例数据（到对象的类型数据指针））;;; >>> 方法区（对象类型数据）]
                ```
```