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

# AQS 线程竞争 步骤
Thread A、B、C
> 1: 第一个线程进入 nonfairTryAcquire(int);
     ```
     state = 1
     exclusiveOwnerThread = ThreadA
     head = null
     tail = null
     ```
          > 2: 第二个线程进入 enq(Node);在addWaiter()中；在acquire()中
          ```
          CAS初始化 head
          tail = head
          ```
               > 3: 其他线程进入争抢 addWaiter(Node);
               ```
               自旋没有获得锁的线程添加到双向链表中
               head = Node(thead = null, waiteStatus = 0).next -> [<-.prev]Node(thread = ThreadB, waitStatus = 0).next -> [<-.prev]Node(thread = ThreadC, waitStatus = 0) = tail
               ```
                    > 4:  挂起队列中的其他线程节点[再争抢？阻塞？]   acquireQueue(Node, int);
                    ```
                    前两个 SIGNAL -1 prev前置节点 shoud...();
                    后两个 线程 挂起 park         parkAndCheckInterrupt();
                                                  ```
                                                  这之前阻塞了，等到别的线程唤醒它的时候，再继续执行。。。
                                                  为什么要返回Thread.interrupted();
                                                  该线程在抢占锁的时候，是没有办法响应别的线程给我发起的中断请求；下次被唤醒的时候再去响应中断请求selfInterrupt()
                                                  ```
                    ```

A lock.unlock(); 解锁
> 唤醒
     ```
     release(int arg)
          unparkSuccessor(Node node[head])  head 表示拥有锁的节点
               尾部节点 开始 for 扫描
               唤醒 
                    干到头结点， 把下个节点变成头结点， aqs的中占有锁的改成 theadB
     ```

# 自旋 中断线程
thread.interrupt 中断线程 设置中断标志（需要响应）
thread.interrupted 获得当前中断状态，复位

需要响应
run() {
     if (Thread.currentThread.isInterrupted()) {
          // 业务 自动中断， bread等
     }
}    

AQS 中 自旋 死循环
只是设置中断状态， 后 可能 被park挂起阻塞， 并没有响应中断过程

# 唤醒next时，当next == null；尾部节点 开始 for 扫描
循环的方式把取消的线程移除；
前提 节点状态 status 》 1 如 CANCELL
构建链路的时候3个步骤enq(node);
1：设置 prev
2：设置 tail 原子 操作
3：设置 next 
     ```
     当别的线程释放锁时, 可能导致 next 设置不成功, 
     ```
场景
     当前线程 去获得锁 出现 异常 或者被标记为CANCELL（处于等待队列的线程超时，中断，异常） 状态

# 公平锁 非公平锁 区别
nofair
```
lock() {
     多个CAS 状态State
     插队线程 
     或者 acquire
}

tryAcquire(){
     nofairTryAcquire();
     ```
     {

     }
     ```
}
```

fair
```
lock() {
     直接 acquire
}
tryAcquire() {
     在 c  == 0 时；多了一个 if 条件 ！hasQueuedPredecessors() 如果当前队列中已有其他阻塞的话，AQS有线程排队的话  就不会再CAS
}
```

# JUC 并发工具的使用以及原理 
线程场景

# Condition
```
wait notify 通信
condition.await/signal/signalall 多线程中的线程通信

应用
XX队列】
生产者消费者模型
```

# Condition 实现
单向链表
firstWaiter
lastWaiter

类似
     AQS队列 = 同步队列
     Condition队列 = 等待队列

fullyRelease() 支持重入锁

WaitStaus = CONDITION 存在等待队列 -2

ConditionAwait > lock() > condition > await() > ConditionQueue 
ConditionSignal > lock() > condition > signal                   > AQSQueue 


Thread.interrupt(); //中断
     ```
     底层会 唤醒 睡眠的 和 挂起的 线程
     ```
siganl(); // 唤醒 等待队列的线程

# CountDownLath
计数器场景
等到子线程执行完了，再执行；awit() 结合 countDown() 以及 初始化传入int

缓存 预热 
前置条件 完成时 

共享锁Shared

state = 3 
     > 当 state = 0 
               > 唤醒 全部 线程 以 传播pro...的方式

# Semaphore
限流（AQS中）
令牌
停车位 5个 车位 最大 车位数
存在 公平 和 非公平

初始化 传入 int；
     》 acquire(); 满了就阻塞
     》 release(); 释放

共享锁Shared

# CyclicBarrier
栅栏
循环屏障
可以使得一组线程达到一个同步点 之前 阻塞
之前时之前多久？
     ```
     ```

例子
旅游 ， 导游 10个人到了 再发票
导入数据，不同数据导入完了，再分析

初始化传入 int 与 线程类
     > cyclicBarrier.await();// 阻塞  每个线程多执行了await 就是 -- 到 0;

重入锁
Condition

Barrier
     > newGernation




# 七大设计原则

## Open-C 开闭原则

* 对修改关闭 + 对扩展开放
```
     接口 行为 与 实现类
     基础类 与 扩展类

     课程 活动打折
```

## D-I-P 依赖倒置原则 = 面向接口编程 ~ spring 案例*
```
     高层 + 底层 + 细节 + 实现 都依赖 抽象

     传入接口 稳定

     spring 依赖注入 set 具体对象， 抽象作为依赖
     构造函数注入
     类set方法

     one 学习 many 课程
     针对one自己的逻辑不需要修改了
```

## S-R-P 单一职责原则
```
     一个类、接口、方法只负责一项职责

     方法：明确定义方法名，修改名修改地址就不要统称修改信息
     接口：确定一个接口干免费的事，一个接口干付费的事，互不影响
     类：明确定义类名，这是直播课类还是录播课类，类里的学习方法该干嘛干嘛
```

## I-S-P 接口隔离原则
```
     接口的定义要适度，不能有多余的也不要少。延伸高内聚低耦合
     用多个专门的接口，不用单一的总接口，客户端使用依赖只需要对的接口

     动物接口 可分为 会吃的、会飞的、会游的动物接口
```

## Law of Demeter 迪米特法则
```
     一个对象保持对其他对象最少的了解，最少知道法则
     只和朋友，不和陌生人说话

     成员变量、入参出参是朋友
     方法体内部的类是陌生人

     领导 ————> 员工 ————> 统计课程
```

## L-S-P 里氏替换原则
```
     Type1 O1 , Type2 O2 , p程序中 用的是 O1, 全部替换 为 O2 正常没有变化P， 》 T2 是 T1的 子类型

     子类 替换 父类

     含义
     子类 扩展 父类 功能，不能改变原有功能
     子 实现 父类 的抽象方法，不能覆盖非抽象方法
     子 可 增加 自己特有方法
     子类重载父类的方法时，前置条件 （入参） 比父类更宽松
     子  实现父类的方法时(重写、重载、实现抽象方法)，后置条件，（出参）要比父类更严格或者相等。

     优点
     1、约束继承泛滥，开闭原则的一种体现
     2、健壮性、兼容性、维护性、扩展性、降低需求变更时引入的风险

     设计可替换类的Demo
```

## C & A -R-P 合成复用原则
```
     尽量使用 对象组合、聚合，而不用继承关系 达到软件复用的目的
     聚合has-a, 组合contains-a,    继承is-a
     
     DBConnection set get
```

# 23种 设计模式

* 架构师 思考 创建型 + 结构型

## 工厂模式

* 简单工厂模型 不是 23种的一种 是创建型模式
```
     Calendar 日历类 、 LoggerFactory 日志工厂 等

     只用传入标识，比较生成比较少的实体对象，内部业务不易发生改变

     Class<? extends ICouse> ， 反射 ， 各种直接判断

     具体产品的工厂
```

* 工厂方法模式                  创建型模式
```
     定义 生产对象（抽象） 的接口（规范标准），实现类决定 生产对象类，工厂方法让类的实例化推迟到子类中进行

     课程工厂 > 生产课程 > Java、Python等实现课，课程实例化由实现去做

     工厂的工厂
```

* 抽象工厂模式                   创建型模式
```
     工厂接口定义 一系列相关或者相互依赖对象，无须指定他们具体对的类。

     产品族(学院工厂) + 产品等级结构(接口定义:::直播、录播、笔记、课将)

     用接口还是抽象类 取决 调用定义方法前后 有(用接口) 无(用抽象类) 公共逻辑

     缺点: 接口顶层 一改 都要改

     复杂产品的工厂
```

* Spring 中的 抽象工厂
```
     AbastractFactory
     AnnotationApplicationContext
     ...
```

* SpringBoot 中无配置 默认Annotation + yml

## 还有 几个基础模式 没看

## 代理模式                                            结构型模式

* 为其他对象提供一种代理，以控制对这个对象的访问  ，中介作用                   结构型模式

* 静态代理
```
     显示声明被代理对象

     房屋中介 显示 房产 ，静态代理 房屋中介 不能 显示找 汽车
```

* 动态代理 ~ AOP         Spring 用了 JDK + CGlib（可强制）
```java
     CGlab
          通过继承，没有用到反射（效率高） 有Fast类，对目标类没有要求，但会忽略final修饰的方法
          引入Cglib第三方库
          Enhabcer setSuperclass(clazz)
                   setCallback(this)
                   create();
          implements MethodInterceptor
               intercept()
                    > before()
                    > mehtodProxy.invokeSuper()
                    > after();

     JDK动态代理
          通过实现 流程和CGLab一样 比CGlab低
          Proxy.newProxyInstance(...必须是接口（反射）...)
          implements InvocationHandler
               invocat()
                    > before();
                    > method.invoke()
                    > after();
```

**分析JDK动态代理**
```java
     ProxyCenerator.generateProxyClass(...)

     InvocationHandler{ invoke() }
     Proxy{ newProxyInstance() }
          > 生成新的字符串java类源码
          > 保存对应得源码类名文件.java
          > 编译.java 成 .class
          > 加载.class 进入 JVM
          > 返回新的代理对象
     ClassLoader extends ClassLoader{ findClass(){} }
          > 把java文件变成 Java内存认识的字节码数组 通过类加载器变成Class对象 > 
          > defineClass(...)
```

* 应用场景
```
     动态代理（架构师）
          系统监控
          日志监控
          动态数据源数据库切换
          分库分表的规则
          权限设置
```



## 装饰器模式                                结构型模式
~ 包装模式                         结构型模式

* 不改变原有对象的基础上，将功能附加到对象上，比继承(编码阶段)更有弹性（扩展原有对象的功能） 运行阶段  煎饼果子 透明将功能扩展

* 一层一层套 煎饼果子 + 鸡蛋 + 香肠 ......
```
     用继承 ，多个类型的煎饼类 一个一个继承 硬编码阶段

     用Decorator 装饰器模式
          抽象类 定义
          标配类 extends 抽象类
          抽象装饰器类 继承 抽象类
               > 构造方法 注入 抽象类 
               > 重写方法 直接调用 夫方法
          多个装饰器类 继承 抽象装饰器
               > 构造方法 调 抽象类定义
               > 内部重写改造
     
     主要体现在客户端，可以自定义调用多少次，一层一层套
     继承 要 new多个
     包装在原有上加一层一层
```

* 日志上的实际案例 装饰器          结合      工厂模式
```
     原来 日志输出 无规则 ， 包装成有规则JSON

     JSONLogger 具体组件 
          构造方法 注入到 父类Logger
     LoggrDecorattor 装饰器 实现 Logger
          构造方法 注入 Logger
```

* 装饰器在源码中的应用
```
     JDK
          InputSteam  有包装器 BufferedInputSteam(InputSteam)
          BufferedReader 是装饰器 可以套StringBuffere() 
     
     Spring
          Cache 有装饰器 LruCache()、FifoCache().......
```

* 装饰器是特殊的代理模式，更注重装饰器自身做决定


## 门面模式 ~ 外观模式                        结构型模式

* 定义一个高层接口，让子系统更容易使用

```
     整合资源，一个接口请求获得
     Service
```

* 源码中的应用
```
     Spring
          JdbcUtils
     Mybatis
          Configuration
     tomcat
          RequestFacade、ResponseFacade
```


* 门面模式 是 一种特殊静态代理模式
```
     门面模式 重点 封装
     代理模式 重点 增强
```

## 享元模式  ~ 轻量级模式                         结构型模式

* 现有资源 不断利用
```
     系统中增加类、对象
     类似线程池子

     一般用于底层架构思想


```

* 实现
```
     抽象享元角色
     具体享元角色
     享元工厂 ~ 一般结合工厂模式

     抢票环节
          票 抽象
          火车票 享元
          票工厂 工厂
     
     连接池
          Conncation
     
     String
          "" 常量池中的常量
          String s1 = "hello"; 编译阶段就创建常量有一个地址，然后运行阶段声明s1, 发现常量已经存在了，就直接赋值给了s1
          String s2 = "hello";
          String s3 = "he" + "llo"; 编译阶段就会把 he 和 llo 拼在一起，发现hello已经有地址了，所以也相等
          String s4 = "hel" + new String("lo");  3个内存地址了， hel常量池一个，new String 内存堆 一个，"lo" 常量池一个；  所以不与其他相等

          常量运算在编译期间做好了

          String s5 = new Strng("hello"); 也与 s1，s4 都不相等 应为 只是hello赋值给了new（指向）好的新地址；；；

          String s6 = s5.intern(); 与 s1 相等；； 拿的是内部的值的常量地址

          String s7 = "h";
          String s8 = "ello";
          String s9 = s7 + s8; 与 s1 不相等；；；s7的位置要是变量 就不会 + 的编译时候做优化，是常量才会。
     
     Integer
          拆箱 和 装箱
          Integer valueOf(); Cache 有缓存 就是有享元
          valueOf出来的值 只有是在， [-128, 127]之间才与 Integer i = ...相等
          只要涉及 new 出来的 ， 地址肯定不一样
          
     Long
          

```