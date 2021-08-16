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

 jmm层面（内存模型）
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