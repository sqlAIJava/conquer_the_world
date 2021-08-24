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

## 多线程的原理（2）
volatile
跨线程的可见性-不及时生效
```
hsdis
多了一个Lock的汇编指令
```

可见性
 硬件层面
     CPU增加高速缓存 
          缓存不一致 《《《 总线锁 \ 缓存锁（缓存一致性协议）
                                   MESI （X86的） 缓存行
                                        L1 L2 保存一致 Shared（共享）
                                        L1 L2         Invalid（失效）
                                        Exclusive（独占） -> Modify（修改）
                                        问题 》》》 storebuffer（S  ->  I） CPU0存在阻塞  【write -> invalte \ ack】 》》》 CPU的乱序执行 -> 重排序 -> 可见性问题 《《《 CPU层面提供指令 -> 内存屏障 (线程全部针对主内存) 
                                             写屏障    store barrier
                                             读屏障    load barrier
                                             全屏障    full barrier （失效队列）
     线程、进程
     指令优化 -> 重排序

 jmm层面（内存模型） = Java内存模型(Java memory model)
     Java程序 -> JMM 保证可见性 -> 不同操作系统平台
     [X86层面]volatile -> Lock -> 汇编指令 -> 内存屏障
     可见性根本问题 
          高速缓存，重排序
     JMM解决 有序性、可见性
     语言级别抽象内存模型 -> 
          主内存 》 工作内存【指令 CPU 高速缓存】 》 多线程
     重排序
          源代码 -> 编译器的 -> cpu层面（指令级， 内存） -> 最终执行的指令
          解决
               数据依赖规则 》 不会重排序 
                    as-if-serial
                         不管如何重排序，对于单个线程的执行结果不能变
     解决方案 -> 内存屏障 volatile, synchornized, final, (happens-before)
          语言级别（编译器级别） /  cpu层面（内存屏障（有些平台强一致性））
          volatile > ACC_VOLATILE > OrderAccess：：：storeload();
          四种预言级别屏障
          loadload() 读屏障 acquire();
               read1;   loadlocal() read2;
          storestore() 写屏障 release();
          loadstore() acquire();
          storeload() 全屏幛 fence();
                         fence() ->>> 内存级别的 lock 屏障
     Happens-Before规则
          可见性的保障 >  volatile以外，还提供了其他的方法
          A happens-before B 
          建立条件
               程序顺序规则 （单线程）
               volatile规则 （内存屏障）
               传递性规则 （建立在前两者基础上）
               start()规则、join()规则、监视器规则synchronized()、

# volatile 只保证可见性（禁止指令重排序来达到可见性效果），不确定原子性
# synchronized 解决原子性，可见性，有序性

# Java 执行查看hsdis输出
```
java -v temp.class
```

# JUC系列
## Lock 基本使用 + 原理分析
```
Java.util.concurrent // 并发工具包
```

并发安全性
Lock -> JDK更灵活的方式

ReentrantLock （重入互斥锁）
     ---> Sync
          ---> AQS 同步队列工具
               ```
                    独占 》 互斥
                    共享 》 读写锁

                    借助AQS实现线程的阻塞
               ```

锁的基本要素
```
1: 一个共享状态记录锁的状态（有锁 >= 1 /无锁 0）
State: 

  CAS 比较与替换 （0， 1）
```


重入锁

读写锁
```
读多写少的场景， Look的 性能高
```

# 学习方法
## 场景 》 需求 》 解决方案 》 使用 》 原理
```
JVM 
Dubbo
```

# 初始多线程 发展 + 使用
```
真空管 》 晶体管 》 集成电路
穿孔打卡 》批处理 》 进程
空闲   》 IO，CPU 》 CPU 时间片
```

线程
```
单核 》 多核 》 并行
实时性 
合理的利用多核心CPU资源，提高程序吞吐量
```

都是实现了 Runable 接口

// 阻塞队列 生产者/消费者模型 责任链
LinkBlockingQueue<?>

责任链 》 减少一些if elsf 
```
异步消息队列 ZK, KFK, 
```

# 线程的生命周期 （6个）
6个状态
创建 》 运行（运行中 》 就绪（调度/yield让出时间片） 》 ） 》 抢占，受阻 》 等待（sleep,wait,join,LockSupport.park() /// notify,notifyall,unpark） 》 超时等待  》 终止

# 线程按照指定循序执行

# InterrupteException 阻塞异常

# jps 
查看Java进程命令

# jstack PID
任务内存的堆栈 日志

# 线程的创建（4种）
Runnable接口
Thread类 （本质实现了Runnable）
Callable/Future 带返回值
ThreadPool 线程池

# start启动？   /   终止？
hotspot源码start0 navite方法
回调run();

stop 类似 kill  不安全

Interrupt 中断
原生OSThread中 status 1 / 0

# 线程的中断 和 复位
复位， 
1: Thread.Interrupted(); 复位 》 回到初始化状态
2: InterruptedException  中断异常  sleep，jion，wait // 阻塞方法 事件触发来结束阻塞事件 取决于 notify 、时间等

目的： 让外界知道我现在还不能中断


# 多线程 基本原理 + 分析
数据安全性
     > 原子性  锁 》 互斥
     > 

synchronized 重量级锁 1.6以后 优化 引入 偏向锁、轻量级
# sync 控制力度 方式
1: 修饰实例方法
2: 修饰静态方法
     》 跨对象
3: 修饰代码块

# sync 作用范围
》》》 关键字 的 生命周期  sync（关键字）{}

## 2种表现形式（方法上，代码块），2种作用范围（对象锁， 类锁 [是否跨线程可保护]）

# 锁 对象 在 内存中是如何存储的 / 内存布局
sync 
     > 对象头
          > age
          > 锁标记
          > 偏向锁标记
          > 。。。
     > 实例数据
     > 填充

# 1.6 以后的 sync 对象头=MarkWord 锁状态
```
无锁状态：
     对象的HashCode + 对象的分代年龄 + 状态位001
```
OOP 源代码 32bit 结构
锁状态  |       25 bit    | 4 bit |     1 bit    |   2 bit 
          23 bit / 2 bit             是否为偏向锁    锁标记位
轻量级锁 |          指向栈中锁记录的指针             | 00
重量级锁 |          指向互斥量 重量级锁 的指针          | 10
GC标志      |                                    | 11
偏向锁   | ThreadID | Epoch | age对象分代年龄 | 1          | 01 

# 锁升级
无锁 》 {偏向锁 》 轻量级锁} ～ 无锁 》 重量级锁（内核态 》 用户态 唤醒）
场景：
1：只有ThreadA去访问 》 偏向锁
2：有ThreadA + ThreadB交替访问 》 轻量级锁 》 自旋
3：多个线程同时访问 》 阻塞

变化：
线程进入  》  (乐观锁)CAS（value, explore, update） 》 MarkWord [偏向锁] 》 线程在进入 》 CAS + 原来锁有运行完成吗 > 偏向锁ThreadID = null
                                                                                                                        > 完成 继续 MarkWord [偏向锁]
                                                                                                                        > 没有 锁升级 轻量级锁 

轻量级锁 变化 自旋[for 中 if cas 比较] （前提： 绝大部分的线程拿到锁后，很快的释放锁）
挂起比自旋好
自旋会占用CPU资源 。  时间 平衡 规定 自旋次数  》》》 锁膨胀 -》 重量级锁
preBlockSpin ～ 10
自适应自旋

线程自己的线程栈
线程栈空间 Execution Stack
     > Lock recode 线程栈空间的锁空间
          > displaced hdr
               ```
               MarkWord

               ```
          > owner 
               ```
               指向  stack pointer 的对象
               ‵‵‵

ObjectMonitor 对象监视器
monitor 》 mutexLock（互斥）
                             内核态 》 用户态
enter     > 同步队列 、获得锁  > exit > 唤醒 同步队列 的线程
```
非公平 snyc 非fifo 
```

snyc 不能降级的

wait 、 notify 、 notifyall   线程通信
```
wait
     1: 阻塞、释放锁
notfy、notfyall
     1：唤醒被阻塞的线程；等待队列 移入 》增强 同步队列 》 唤醒 一个 或 多个

前提
     不同线程 作用的是同一把锁

```

等待队列 》 同步队列
```
等待队列
     lock.wait() 的使用 导致

同步队列（每一个被阻塞的线程会加入到这一个队列中）
     共同的东西维持 占用对象锁 的线程 机制
     同步锁
```

Epoch
```
撤销 释放
全局安全点（没有线程再执行指令时） 》 批量撤销
epoch 升级epoch的值（2）
1 -》 撤销并且重新偏向
是不是一个朝代（时间段）
```

AQS中有 锁的 相应实现

sleep
```
释放CPU资源，不释放锁资源
```

# volatile
跨线程 的 共享资源 的 保证 可见性（及时读取已修改的值）

# 总线锁 缓存锁

# 缓存一致性协议
CPU 不同 协议不一样

# MESI协议 缓存行的 四种状态
M Modify  已修改
E Exclusive   当 存在 I 的 不再缓存时，且与主内存一致时， 独占
S Shared  已经缓存了，且与其他保持一致，共用
I Invalid 。。。。。。。。。。。不一致时，与M相反的状态，失效

# CPU 资源通信
```
嗅探协议，监听其他个缓存的读写操作
S 》 M 会 通知
```

# CPU 缓存协议 =读写原则
```
MES 可读取缓存
I 从 主内存再读取

ME 可以 直接 写
S  需要把别的改成 I 才能 写
I  。。。？！
```

# MESI 问题  > 演变
```
缓存行 状态 同步
     > ？ cpu 之间的 wait 
                    > storebuffer 不要等 | 异步处理
                                                  > ？ 仍有 ACK 回执 可见性问题  
                                                  > ？ 代码乱序执行 ... 重排序 ... 代码前后没有依赖 
                                                                                              > 内存屏障 CPU层面 指令 
                                                                                                    ```
                                                                                                         storeMemoryBarrier();
                                                                                                         loadMemoryBarrier();
                                                                                                         读屏障store、写屏障load、全屏障full barrier
                                                                                                    ```
```

# 可见性 根本 问题
高速缓存 + 重排序

# JMM 解决
有序性 + 可见性

# JVM 层面
硬件/系统 > 内存屏障 > JVM 层面 > Java 程序
```
JMM 的 内存模型 （语言级别的抽象内存模型） 》 有 volatile、sync、fianl、happens-before 来解决
     主内存 
          》 工作内存
                    》 线程
```

# AQS 底层原理解析  +   J.U.C Lock的基本使用，原理分析
java.util.concurrent 并发工具包 juc
     > 原子操作
     > 锁的操作
     > 阻塞队列

# ReentrantLock 重入锁
防止死锁
```
     内嵌 锁调用
```
snyc也支持
互斥特性

可以通过API控制，合理控制力度

# ReentrantReadWriteLock 重入读写锁
针对读写不同锁互斥
读多写少
```
读时
     > 加读锁 > 释放
写时
     > 加写锁 > 释放
```

# 多线程 竞争 重入锁时， 其他 进入 阻塞 状态 怎么实现的 ？ >>> AQS
AQS 同步工具/组件 》 实现线程的阻塞
功能：
1：独占 》互斥锁 （只能一个线程获得锁）
2：共享 》读写锁 （可以有多个线程获得锁）

# AQS 怎么做的
双向链表

# unsafe CAS
obj, 占用锁对象
offsef, 内存地址偏移量
     ```
     一个Java对象 看成 一段内存
     每一个字段都会按照一定的顺序放到内存里面
          通过一个方法objectFieldOffset 获得 这个字段 相对 对象的起始内存地址的一个 偏移量
               实现原子性
     ```
expect, 比较的预期值
update, 替换的修改值

# 加锁 、 获得同步锁
对一个共享资源的状态 做一些变化

# AQS 同步锁
Status 0 共享数据，锁标记
exclusiveOwnerThread ThreadA

^
 CAS 比较替换 同步锁 


# AQS 双向链表
Node head;头 null
     > prev 前一个Node
     > next 下一个Node
     > waitStatus 0
     > thread null
Node tail;尾 null
