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