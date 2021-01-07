# 动物 规则 识别（概率 匹配） 初议
Enum：{[规则，规则...], 结论, 是否结论可当作规则}
ForwordResult: [{规则, 结果， 匹配概率}, {规则, 结果， 匹配概率},...]
    ``` 输出 依据 匹配概率最大的 Result ```
ReverseResult：{规则，...}

Implements:
    // TODO 正向
    requestParams: [规则,......] 
        >>> 匹配Enum 用于确定 tempParams
    tempParams: [规则，......]
        >>> 匹配Enum 
            >>> 计算概率 
                >>> 输出 Result Array
    Result：[]
        >>> 最大概率 确定结果
    
    // TODO 逆向
    requestParams: '结论'
        >>> 匹配Enum 输出 isRequestByResultEnum (结论可当作规则)
    isRequestByResultEnum
        >>> 匹配Enum 
            >>> 输出 Result
    Result：{} 
        >>> 结果

*** 重点 *** 
```
    1：已知规则，不需要像网上案例，一个一个问地形式 逆向；
    2：正向是通过 不同随机 问题 计算概率 得出的  更接近 随机概率识别 而非 网上规定问题试识别
```
(1/12*2) * 
5 个动物 每个动物出现次数 1/5
    单个动物 2个                1/2 * 1/5   
    单个动物 4个                1/4 * 1/5  




# 2021-1-6
···
    医院看病预约应用
    交付物
    1：APP端（Android版）
        咨询模块 (咨询+查看)
        挂号模块 (科室>日程>医生>挂号提交病情)
        订单模块 (挂号记录)
        用户模块 (只面向患者 患者 注册 登陆)
    2：管理后台（Java Web）
        咨询管理，医生管理，患者用户管理，挂号记录管理
    3：API接口（Java）
        提供接口给APP端各模块调用
    4：数据库（SqlServer版）
        表结构数据


    问题
    1：咨询 + 详情查看
    2：订单 + 医生聊天
    3：支付 需要 什么支付`
···


# 2021-1-7
http://www.rainto.com.cn/portfolio/ 网站-制作
前后端
