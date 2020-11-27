# 2020-11-24
Azure Cosmos DB Gremlin API
蔚蓝的  宇宙      小精灵(图形遍历语言)

Azure Cosmos DB Graph 引擎

Apache TinkerPop
       小淘气_流行

Neo4j Graph Platform
       图形  

Gremlin API 场景
    ```
    1：个性化体验，预测，相关人相连   跟踪喜好+数据
    2：零售 合并产品 用户互动 自定义的 推荐内容 原生图形弹性缩放
    3：地理空间 电信物流旅行规划 某个区域 兴趣点 最短/最佳距离 
    4：loT（物联网）多方通信 网络和连接建模 设备和资产 状态 相影响
    ```

图形数据库
    ```
    联系 重点 依赖存储层的持久关系 图形检索高效
    传统 单独实体 运行时关系 自身优点
    ```

属性图形对象
    ```
    顶点 边缘
        顶点/节点 人员/地点/事件/离散实体
        边缘/关系 顶点之间的关系
        属性 有关顶点 和 边的信息 任意多个
        标签 顶点或边缘的名称或标识符 组 顶点类型
    ```

Gremlin 控制台
Apache TinkerPop 交互式终端
使用Gremlin驱动程序操作

CRUD
g.addV('').property('','').property('','')
g.V('').addE('').to(g.V(''))
g.V().hasLabel('').order().by('',decr)
g.out('').out('').out('').group().by('name').by(count())

修改实体内部的属性，执行查询和遍历，删除实体 Graph 引擎 步骤规范（Gremlin） 

顶点 Vertices
    ```
    .V("id") .group()
    ```

边缘 Edges
    ```
    .addE("") .out('') .to()
    ```

属性 
    ```
    .property('','') .by()
    ```

标签
    ```
    .addV('') 
    ```

Gremlin 网格格式
id GUID
label
type 顶点与非图形文档区分
properties 
_partition * 顶点分区键
outE
    id
    label
    inV 一些列顶点 快速遍历 标签分组
    properties 
        value 每个属性可在一个数组中存储多个值

Gremlin 步骤
顶点
    ```
    addV    drop    has（hasLabel,hasId,hasNot,has）    
    tree    
    ```

边缘
    ```
    addE     drop   has（hasLabel,hasId,hasNot,has）
    ```

遍历 返回值
    ```
    and     coalesce    constant    count   dedup   group 
    inject  is  limit   local   optional    or  order   sample
    select  union   
    V（V，E,out,in,both,outE,inE,bothE,outE,inE,bothE,outV,inV,bothV,otherV）
    where(eq,neq,lt,lte,gt,gte,between)
    ```

输出 分配变量
    ```
    as  
    ```

配合 group order 步骤调制器
    ```
    by
    ```

创建 说明 返回路径
    ```
    executionProfile    path
    ```

充当计算结果聚合屏障 非阻塞聚合
    ```
    fold    store   
    ```

属性
    ```
    has（hasLabel,hasId,hasNot,has）    project     properties 

    ```

筛选器
    ```
    not     range    repeat     
    ```

迭代器
    ```
    unfold  
    ```

TextP 谓词 匹配
    ```
    TextP.startingWith()
    TextP.endingWith()
    TextP.containing()
    TextP.notStartingWith()
    TextP.notEndingWith()
    TextP.notContaining()
    ```

索引编制
    ```
    写入优化引擎 默认支持 自动对顶点 和 边缘 中的所有 属性 编制索引
    筛选器 范围查询 排序 聚合 对属性 查询 索引处理
    ```

行为差异
    ```
    Azure Cosmos DB Graph 引擎      广度优先 水平缩放系统中 更好性能
    ThinkerPop Gremlin              深度优先
    ```

限制 + 不支持的功能
    ```
    不支持
        Gremlin字节码 图遍历规范 
        match() 声明性查询功能
        顶点和边缘 不支持 对象属性
        oreder().by(<array property>)
        非基元JSON类型 | string number true/fals 不能为null
        不支持 GraphSONv3 连接配置中使用 GraphSONv2 Serializer
        Lambda 表达式 和 函数
        不支持 事务
    限制
        .V 第一个 才遍历 防止索引利用率 延迟 和 成本
    ```

# 2020-11-25
## 文献项目功能点Review
    ```
    1：知识图谱数据库建模
        实体 属性 导入数据 关键词查询
    2：从ECM API获取数据插入知识图谱
        全量 增量 定时任务
    3：管理后台输入问题查询
        搜索引擎案例  关键词入参 返回文本 返回图形格式
    4：和吾来的问答接口集成，根据输入问题返回结果
        提供接口   提取关键词  返回文本 返回图谱查询 优化关键词 专业词 普通词 同义词 提高理解准度
    5：系统安全性
        https token
    6：生产上线
        流水线部署 初始化数据
    ```

## Cosmos DB 使用
Azure Cosmos DB Emulator 本地模拟器
使用 MongoDB Gremlin/Graph Cassandra 还得装插件
模拟器  ！= 服务 订阅 差异
    ```
    插件安装
    一个账户 一个密钥
    25个 400RU/s
    ID 属性 254
    ```


## 36节知识看起
知识图谱 是什么
string 顶点 边缘  
实体
    真实世界对象
    抽象概念

领域类
    
公安 金融 对话
spark 算法 free

可是化 D3 Cytoscape.js 

* 基于模型 一些算法（图形挖掘） 怎么写 代码？ *
