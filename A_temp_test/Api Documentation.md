# Api Documentation
[toc]
## 1	环境变量

### 默认环境1
| 参数名 | 字段值 |
| ------ | ------ |
|baseUrl|http://10.1.192.238:30010|


## 2	Api Documentation

##### 说明
> 



##### 联系方式
- **联系人：**
- **邮箱：**
- **网址：**//

##### 文档版本
```
1.0
```


## 3	文章模块接口

## 3.1	删除文章

> POST  /article/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||文章Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.2	文章详情

> POST  /article/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.3	文章上下架

> POST  /article/editStatus
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||文章id，以‘-’分隔|
|status||0：下架；1：上架|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.4	文章列表

> POST  /article/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥⇥ categoryId|string|栏目id|false|栏目id|
|⇥⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥⇥ city|string|成都|false|城市|
|⇥⇥ collectNum|int32|999|false|收藏数|
|⇥⇥ content|string|富文本|false|文章内容|
|⇥⇥ county|string|高新区|false|区县|
|⇥⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥⇥ id|string|1|false|id|
|⇥⇥ lookNum|int32|999|false|点击查看数|
|⇥⇥ province|string|四川|false|省份|
|⇥⇥ pushTime|string||false|发送时间|
|⇥⇥ shareNum|int32|999|false|分项数|
|⇥⇥ source|string|xxx|false|来源|
|⇥⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥⇥ title|string|xxxxxx|false|标题|
|⇥⇥ top|int32|1|false|是否置顶|
|⇥⇥ typeId|string|智慧招商|false|大类id|
|⇥⇥ typeName|string|智慧招商|false|大类名称|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥⇥ verifyUsername|string|zhangsan|false|审核人姓名|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.5	新增or修改文章

> POST  /article/saveOrEdit
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
| categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
| categoryId|string|栏目id|false|栏目id|
| categoryTitle|string|栏目名称|false|栏目名称|
| city|string|成都|false|城市|
| collectNum|int32|999|false|收藏数|
| content|string|富文本|false|文章内容|
| county|string|高新区|false|区县|
| coverImg|string|http://xxxxx|false|封面图|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| filePaths|array[string]|[]|false|上传文件列表|
| id|string|1|false|id|
| lookNum|int32|999|false|点击查看数|
| province|string|四川|false|省份|
| pushTime|string||false|发送时间|
| shareNum|int32|999|false|分项数|
| source|string|xxx|false|来源|
| sourceUrl|string|http://xxxx|false|源地址|
| status|string|1：上架，0：下架|false|上下架状态|
| title|string|xxxxxx|false|标题|
| top|int32|1|false|是否置顶|
| typeId|string|智慧招商|false|大类id|
| typeName|string|智慧招商|false|大类名称|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
| verifyRemark|string|审核建议|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna|false|审核人id|
| verifyUsername|string|zhangsan|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.6	文章审核

> POST  /article/verify
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章id|
|verifyPhoneNumber||审批人联系方式|
|verifyRemark||审批意见|
|verifyStatus||审核状态：1：通过，-1：不通过|
|verifyUsername||审批人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.7	取消收藏

> POST  /web/article/collect/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||文章Id，以-分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.8	文章收藏

> POST  /web/article/collect/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id，目前不确定userId是否需要传|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.9	收藏文章列表

> POST  /web/article/collectList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ code|string|1|false|编号|
|⇥⇥ content|string|富文本|false|回答内容|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ status|string|1|false|状态：0：下架，1：上架|
|⇥⇥ title|string|xxxxxx？|false|问题|
|⇥⇥ top|int32|1|false|是否置顶：0：否；1：是|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.10	文章详情

> POST  /web/article/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.11	文章列表

> POST  /web/article/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥⇥ categoryId|string|栏目id|false|栏目id|
|⇥⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥⇥ city|string|成都|false|城市|
|⇥⇥ collectNum|int32|999|false|收藏数|
|⇥⇥ content|string|富文本|false|文章内容|
|⇥⇥ county|string|高新区|false|区县|
|⇥⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥⇥ id|string|1|false|id|
|⇥⇥ lookNum|int32|999|false|点击查看数|
|⇥⇥ province|string|四川|false|省份|
|⇥⇥ pushTime|string||false|发送时间|
|⇥⇥ shareNum|int32|999|false|分项数|
|⇥⇥ source|string|xxx|false|来源|
|⇥⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥⇥ title|string|xxxxxx|false|标题|
|⇥⇥ top|int32|1|false|是否置顶|
|⇥⇥ typeId|string|智慧招商|false|大类id|
|⇥⇥ typeName|string|智慧招商|false|大类名称|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥⇥ verifyUsername|string|zhangsan|false|审核人姓名|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 3.12	文章分享

> POST  /web/article/share/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id，目前不确定userId是否需要传|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4	双创成果

## 4.1	删除成果

> POST  /innovate/achievement/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||成果Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4.2	根据id查询双创成果详情

> GET  /innovate/achievement/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询双创成果详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|双创成果|
|⇥ achievementDate|string||false|成果时间|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string||false||
|⇥ introduction|string|成果内容及描述64kb|false|成果内容及描述|
|⇥ linkman|string|联系人(长度10)|false|联系人(长度10)|
|⇥ path|string|图片(长度300)|false|图片|
|⇥ pushTime|string||false|上架发布时间|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ techField|string|技术领域名称(长度200)|false|技术领域名称(长度200)|
|⇥ techFieldType|string|技术领域名称数据字典标识(长度300)|false|技术领域名称数据字典标识(长度300)|
|⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥ title|string|成果标题(长度50)|false|成果标题(长度50)|
|⇥ type|string|成果类型(数据字典id长度50)|false|成果类型(数据字典id长度50)|
|⇥ typeName|string|成果类型(数据字典名称长度50)|false|成果类型(数据字典名称长度50)|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4.3	成果上下架

> POST  /innovate/achievement/editStatus
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||成果id，以‘-’分隔|
|status||0：下架；1：上架|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4.4	双创成果列表

> POST  /innovate/achievement/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ achievementDate|string||false|成果时间|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string||false||
|⇥⇥ introduction|string|成果内容及描述64kb|false|成果内容及描述|
|⇥⇥ linkman|string|联系人(长度10)|false|联系人(长度10)|
|⇥⇥ path|string|图片(长度300)|false|图片|
|⇥⇥ pushTime|string||false|上架发布时间|
|⇥⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥⇥ techField|string|技术领域名称(长度200)|false|技术领域名称(长度200)|
|⇥⇥ techFieldType|string|技术领域名称数据字典标识(长度300)|false|技术领域名称数据字典标识(长度300)|
|⇥⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥⇥ title|string|成果标题(长度50)|false|成果标题(长度50)|
|⇥⇥ type|string|成果类型(数据字典id长度50)|false|成果类型(数据字典id长度50)|
|⇥⇥ typeName|string|成果类型(数据字典名称长度50)|false|成果类型(数据字典名称长度50)|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4.5	新增

> POST  /innovate/achievement/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| achievementDate|string||false|成果时间|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| id|string||false||
| introduction|string|成果内容及描述64kb|false|成果内容及描述|
| linkman|string|联系人(长度10)|false|联系人(长度10)|
| path|string|图片(长度300)|false|图片|
| pushTime|string||false|上架发布时间|
| status|string|1：上架，0：下架|false|上下架状态|
| techField|string|技术领域名称(长度200)|false|技术领域名称(长度200)|
| techFieldType|string|技术领域名称数据字典标识(长度300)|false|技术领域名称数据字典标识(长度300)|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| title|string|成果标题(长度50)|false|成果标题(长度50)|
| type|string|成果类型(数据字典id长度50)|false|成果类型(数据字典id长度50)|
| typeName|string|成果类型(数据字典名称长度50)|false|成果类型(数据字典名称长度50)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4.6	修改

> POST  /innovate/achievement/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| achievementDate|string||false|成果时间|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| id|string||false||
| introduction|string|成果内容及描述64kb|false|成果内容及描述|
| linkman|string|联系人(长度10)|false|联系人(长度10)|
| path|string|图片(长度300)|false|图片|
| pushTime|string||false|上架发布时间|
| status|string|1：上架，0：下架|false|上下架状态|
| techField|string|技术领域名称(长度200)|false|技术领域名称(长度200)|
| techFieldType|string|技术领域名称数据字典标识(长度300)|false|技术领域名称数据字典标识(长度300)|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| title|string|成果标题(长度50)|false|成果标题(长度50)|
| type|string|成果类型(数据字典id长度50)|false|成果类型(数据字典id长度50)|
| typeName|string|成果类型(数据字典名称长度50)|false|成果类型(数据字典名称长度50)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 4.7	成果审核

> POST  /innovate/achievement/verify
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||成果id|
|verifyPhoneNumber||审批人联系方式|
|verifyRemark||审批意见|
|verifyStatus||审核状态：1：通过，-1：不通过|
|verifyUsername||审批人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 5	企业画像-企业预警

## 5.1	企业预警-折线图

> POST  /enterprise/warn/getWarn
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||creditCode|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 5.2	企业预警-预警态势

> POST  /enterprise/warn/getWarnState
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||creditCode|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6	双创资源

## 6.1	删除资源

> POST  /innovate/resource/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||资源Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6.2	根据id查询双创资源详情

> GET  /innovate/resource/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询双创资源详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|&&资源|
|⇥ address|string|资源位置(长度50)|false|资源位置(长度50)|
|⇥ content|string|描述(长度500)|false|描述(长度500)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string||false||
|⇥ latitude|string|纬度(长度30)|false|纬度(长度30)|
|⇥ level|string|等级(长度50数据字典ID)|false|等级(长度50数据字典ID)|
|⇥ levelName|string|等级名称(长度50,数据字典名称)|false|等级名称(长度50,数据字典名称)|
|⇥ linkman|string|联系人(长度10)|false|联系人(长度10)|
|⇥ longitude|string|经度(长度30)|false|经度(长度30)|
|⇥ name|string|资源名称(长度50)|false|资源名称(长度50)|
|⇥ path|string|图片(长度300)|false|图片|
|⇥ pushTime|string||false|上架发布时间|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥ type|string|资源类别(长度50数据字典ID)|false|资源类别(长度50数据字典ID)|
|⇥ typeName|string|类别名称(长度50,数据字典名称)|false|类别名称(长度50,数据字典名称)|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6.3	资源上下架

> POST  /innovate/resource/editStatus
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||资源id，以‘-’分隔|
|status||0：下架；1：上架|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6.4	双创资源列表

> POST  /innovate/resource/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|资源位置(长度50)|false|资源位置(长度50)|
|⇥⇥ content|string|描述(长度500)|false|描述(长度500)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string||false||
|⇥⇥ latitude|string|纬度(长度30)|false|纬度(长度30)|
|⇥⇥ level|string|等级(长度50数据字典ID)|false|等级(长度50数据字典ID)|
|⇥⇥ levelName|string|等级名称(长度50,数据字典名称)|false|等级名称(长度50,数据字典名称)|
|⇥⇥ linkman|string|联系人(长度10)|false|联系人(长度10)|
|⇥⇥ longitude|string|经度(长度30)|false|经度(长度30)|
|⇥⇥ name|string|资源名称(长度50)|false|资源名称(长度50)|
|⇥⇥ path|string|图片(长度300)|false|图片|
|⇥⇥ pushTime|string||false|上架发布时间|
|⇥⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥⇥ type|string|资源类别(长度50数据字典ID)|false|资源类别(长度50数据字典ID)|
|⇥⇥ typeName|string|类别名称(长度50,数据字典名称)|false|类别名称(长度50,数据字典名称)|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6.5	新增

> POST  /innovate/resource/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| address|string|资源位置(长度50)|false|资源位置(长度50)|
| content|string|描述(长度500)|false|描述(长度500)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| id|string||false||
| latitude|string|纬度(长度30)|false|纬度(长度30)|
| level|string|等级(长度50数据字典ID)|false|等级(长度50数据字典ID)|
| levelName|string|等级名称(长度50,数据字典名称)|false|等级名称(长度50,数据字典名称)|
| linkman|string|联系人(长度10)|false|联系人(长度10)|
| longitude|string|经度(长度30)|false|经度(长度30)|
| name|string|资源名称(长度50)|false|资源名称(长度50)|
| path|string|图片(长度300)|false|图片|
| pushTime|string||false|上架发布时间|
| status|string|1：上架，0：下架|false|上下架状态|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| type|string|资源类别(长度50数据字典ID)|false|资源类别(长度50数据字典ID)|
| typeName|string|类别名称(长度50,数据字典名称)|false|类别名称(长度50,数据字典名称)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6.6	修改

> POST  /innovate/resource/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| address|string|资源位置(长度50)|false|资源位置(长度50)|
| content|string|描述(长度500)|false|描述(长度500)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| id|string||false||
| latitude|string|纬度(长度30)|false|纬度(长度30)|
| level|string|等级(长度50数据字典ID)|false|等级(长度50数据字典ID)|
| levelName|string|等级名称(长度50,数据字典名称)|false|等级名称(长度50,数据字典名称)|
| linkman|string|联系人(长度10)|false|联系人(长度10)|
| longitude|string|经度(长度30)|false|经度(长度30)|
| name|string|资源名称(长度50)|false|资源名称(长度50)|
| path|string|图片(长度300)|false|图片|
| pushTime|string||false|上架发布时间|
| status|string|1：上架，0：下架|false|上下架状态|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| type|string|资源类别(长度50数据字典ID)|false|资源类别(长度50数据字典ID)|
| typeName|string|类别名称(长度50,数据字典名称)|false|类别名称(长度50,数据字典名称)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 6.7	资源审核

> POST  /innovate/resource/verify
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||资源id|
|verifyPhoneNumber||审批人联系方式|
|verifyRemark||审批意见|
|verifyStatus||审核状态：1：通过，-1：不通过|
|verifyUsername||审批人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 7	用户信息登录注册

## 7.1	获取临时票据

> GET  /auth/getCode
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 7.2	获取用户信息

> GET  /auth/getUserInfo
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|username||username|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| information|object||false||
|⇥ abbrName|string||false||
|⇥ account|string||false||
|⇥ accountStatus|string||false||
|⇥ address|string||false||
|⇥ avatarImg|string||false||
|⇥ creatTime|string||false||
|⇥ createId|string||false||
|⇥ createMan|string||false||
|⇥ deleteTime|string||false||
|⇥ description|string||false||
|⇥ dutyLevel|string||false||
|⇥ email|string||false||
|⇥ emergentPhone|string||false||
|⇥ ext1|string||false||
|⇥ ext2|string||false||
|⇥ ext3|string||false||
|⇥ ext4|string||false||
|⇥ ext5|string||false||
|⇥ ext6|string||false||
|⇥ globalOrder|int32||false||
|⇥ ipRange|string||false||
|⇥ machineCode|string||false||
|⇥ mobile|string||false||
|⇥ name|string||false||
|⇥ nameFullPy|string||false||
|⇥ namePy|string||false||
|⇥ phone|string||false||
|⇥ place|string||false||
|⇥ rank|int32||false||
|⇥ rankOrder|int32||false||
|⇥ recflag|string||false||
|⇥ sex|string||false||
|⇥ stCa|string||false||
|⇥ stExtHrPeopleInfoId|string||false||
|⇥ stExtPeopleWorkNum|string||false||
|⇥ teamId|string||false||
|⇥ teamName|string||false||
|⇥ title|string||false||
|⇥ updateTime|string||false||
|⇥ userId|string||false||
|⇥ userType|string||false||
| menu|array[object]||false||
|⇥ appId|string||false||
|⇥ children|array||false||
|⇥ css|string||false||
|⇥ ext1|string||false||
|⇥ ext2|string||false||
|⇥ ext3|string||false||
|⇥ icon|string||false||
|⇥ id|string||false||
|⇥ isPublic|string||false||
|⇥ jsEvent|string||false||
|⇥ name|string||false||
|⇥ order|int32||false||
|⇥ pId|string||false||
|⇥ picPath|string||false||
|⇥ popPosition|string||false||
|⇥ remark|string||false||
|⇥ status|string||false||
|⇥ type|string||false||
|⇥ url|string||false||

##### 接口描述
> 




## 7.3	登录

> POST  /auth/login
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|password||password|
|username||username|
|verifyCode||verifyCode|
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 7.4	退出登录

> GET  /auth/loginOut
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 7.5	模拟用户登录

> GET  /auth/testLogin
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||userId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 8	企业画像-运营分析

## 8.1	营业收入统计

> POST  /count/income/getCountIncome
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 8.2	增值统计

> POST  /count/increment/getCountIncrement
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 8.3	产值统计

> POST  /count/output/getCountOutPut
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 8.4	员工学历统计

> POST  /count/staff/getCountStaffEducation
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9	企业服务接口

## 9.1	批量删除或单删除

> DELETE  /enterprise/user/delete
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.2	批量取消服务收藏

> POST  /enterprise/user/deleteCollect
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.3	服务收藏列表

> POST  /enterprise/user/getCollectList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ collectTime|string|收藏时间|false|收藏时间|
|⇥⇥ companyName|string|政策1|false|主体名称(卖家)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ declareTime|string||false|截至日期|
|⇥⇥ id|string||false||
|⇥⇥ serviceName|string|服务名称|false|服务名称|
|⇥⇥ type|string|创业扶持|false|服务类别(大类)|
|⇥⇥ userId|string|123456|false|用户Id|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.4	条件查询所有用户

> POST  /enterprise/user/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ chargeMode|string|免费|false|收费模式|
|⇥⇥ chargeModeCode|string|AA|false|收费模式Code|
|⇥⇥ classify|string|国家一号|false|具体类别(子类)|
|⇥⇥ classifyCode|string|aaa|false|具体类别Code|
|⇥⇥ collectNum|int32|11|false|收藏数|
|⇥⇥ companyId|string|123456|false|主体id|
|⇥⇥ companyName|string|政策1|false|主体名称(卖家)|
|⇥⇥ content|string|中国人民共和国|false|内容详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareTime|string||false|申报截至日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ icon|string|http://1234412.com|false|服务图标|
|⇥⇥ id|string||false||
|⇥⇥ lookNum|int32|88|false|查看数|
|⇥⇥ needDeclare|int32|0|false|是否申报|
|⇥⇥ organMode|string|群体|false|机构模式|
|⇥⇥ organModeCode|string|aaa|false|机构模式Code|
|⇥⇥ serviceName|string|服务名称|false|服务名称|
|⇥⇥ serviceObject|string|对象|false|服务对象|
|⇥⇥ serviceObjectCode|string|aaa|false|服务对象Code|
|⇥⇥ serviceOrganName|string|服务机构名称1|false|服务机构名称|
|⇥⇥ serviceOrganPerson|string|张三|false|服务机构联系人|
|⇥⇥ serviceOrganPhone|string|11111111|false|服务机构电话|
|⇥⇥ shareNum|string|11|false|分享数|
|⇥⇥ status|string|上下架状态(0:下架：1:上架)|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|创业扶持|false|服务类别(大类)|
|⇥⇥ typeCode|string|aaa|false|服务类别Code|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态(0:待审核:1:通过:-1:不通过)|false|审核状态(0:待审核:1:通过:-1:不通过)|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.5	查询某一个服务详情

> POST  /enterprise/user/query
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||服务id|
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false||
|⇥ chargeMode|string|免费|false|收费模式|
|⇥ chargeModeCode|string|AA|false|收费模式Code|
|⇥ classify|string|国家一号|false|具体类别(子类)|
|⇥ classifyCode|string|aaa|false|具体类别Code|
|⇥ collectNum|int32|11|false|收藏数|
|⇥ collectStatus|string|是否收藏(0 未收藏,1 已收藏)|false|是否收藏|
|⇥ collectTime|string||false|收藏时间|
|⇥ companyId|string|123456|false|主体id|
|⇥ companyName|string|政策1|false|主体名称(卖家)|
|⇥ content|string|中国人民共和国|false|内容详情|
|⇥ createTime|string||false|申报截至日期|
|⇥ declareTime|string||false|申报截至日期|
|⇥ fileVo|array[object]|文件对象|false|文件接受对象数组|
|⇥⇥ fileName|string|文件名称|false|文件名称|
|⇥⇥ filePath|string|文件地址|false|文件地址|
|⇥ icon|string|http://1234412.com|false|服务图标|
|⇥ id|string||false||
|⇥ lookNum|int32|88|false|查看数|
|⇥ needDeclare|int32|0|false|是否申报|
|⇥ organMode|string|群体|false|机构模式|
|⇥ organModeCode|string|aaa|false|机构模式Code|
|⇥ serviceName|string|服务名称|false|服务名称|
|⇥ serviceObject|string|对象|false|服务对象|
|⇥ serviceObjectCode|string|aaa|false|服务对象Code|
|⇥ shareNum|string|11|false|分享数|
|⇥ status|string|上下架状态(0:下架：1:上架)|false|上下架状态|
|⇥ summary|string|摘要|false|摘要|
|⇥ type|string|创业扶持|false|服务类别(大类)|
|⇥ typeCode|string|aaa|false|服务类别Code|
|⇥ verifyStatus|string|审核状态(0:待审核:1:通过:-1:不通过)|false|审核状态(0:待审核:1:通过:-1:不通过)|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|审核人|false|审核人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.6	批量上下架发布

> POST  /enterprise/user/release
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|status||status|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.7	收藏服务

> POST  /enterprise/user/saveCollect
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|serviceId||服务id|
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.8	新增或修改

> POST  /enterprise/user/saveOrUpdate
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| chargeMode|string|免费|false|收费模式|
| chargeModeCode|string|aaa|false|收费模式Code|
| classify|string|国家一号|false|具体类别|
| classifyCode|string|aaa|false|具体类别Code|
| companyName|string|政策1|false|主体名称(卖家)|
| content|string|中国人民共和国|false|内容详情|
| declareTime|string||false|申报截至日期|
| fileDto|array[object]|文件对象|false|文件接受对象数组|
|⇥ fileName|string|文件名称|false|文件名称|
|⇥ filePath|string|文件地址|false|文件地址|
| icon|string|http://1234412.com|false|服务图标|
| id|string|服务id|false|服务id|
| needDeclare|int32|0|false|是否申报|
| organMode|string|群体|false|机构模式|
| organModeCode|string|aaa|false|机构模式Code|
| serviceName|string|服务名称|false|服务名称|
| serviceObject|string|对象|false|服务对象|
| serviceObjectCode|string|aaa|false|服务对象Code|
| type|string|创业扶持|false|服务类别|
| typeCode|string|aaa|false|服务类别Code|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 9.9	条件查询所有用户

> POST  /web/enterprise/user/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ chargeMode|string|免费|false|收费模式|
|⇥⇥ chargeModeCode|string|AA|false|收费模式Code|
|⇥⇥ classify|string|国家一号|false|具体类别(子类)|
|⇥⇥ classifyCode|string|aaa|false|具体类别Code|
|⇥⇥ collectNum|int32|11|false|收藏数|
|⇥⇥ companyId|string|123456|false|主体id|
|⇥⇥ companyName|string|政策1|false|主体名称(卖家)|
|⇥⇥ content|string|中国人民共和国|false|内容详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareTime|string||false|申报截至日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ icon|string|http://1234412.com|false|服务图标|
|⇥⇥ id|string||false||
|⇥⇥ lookNum|int32|88|false|查看数|
|⇥⇥ needDeclare|int32|0|false|是否申报|
|⇥⇥ organMode|string|群体|false|机构模式|
|⇥⇥ organModeCode|string|aaa|false|机构模式Code|
|⇥⇥ serviceName|string|服务名称|false|服务名称|
|⇥⇥ serviceObject|string|对象|false|服务对象|
|⇥⇥ serviceObjectCode|string|aaa|false|服务对象Code|
|⇥⇥ serviceOrganName|string|服务机构名称1|false|服务机构名称|
|⇥⇥ serviceOrganPerson|string|张三|false|服务机构联系人|
|⇥⇥ serviceOrganPhone|string|11111111|false|服务机构电话|
|⇥⇥ shareNum|string|11|false|分享数|
|⇥⇥ status|string|上下架状态(0:下架：1:上架)|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|创业扶持|false|服务类别(大类)|
|⇥⇥ typeCode|string|aaa|false|服务类别Code|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态(0:待审核:1:通过:-1:不通过)|false|审核状态(0:待审核:1:通过:-1:不通过)|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 10	产业链云图

## 10.1	产业链全景图

> GET  /chain/cloud/cloud/{dictId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|dictId||dictId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false||
|⇥ children|array|子节点|false|子节点|
|⇥ flag|boolean|false|false|是否存在区内企业标志|
|⇥ id|string|字典标识|false|字典标识|
|⇥ inner|array[object]|区内企业|false|区内企业|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ establishTime|int32||false|成立年限|
|⇥⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ isFollow|boolean|false|false|是否关注|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ position|string|职位(10)|false|职位(10)|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
|⇥ name|string|字典名称|false|字典名称|
|⇥ outter|array[object]|区外企业|false|区外企业|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ establishTime|int32||false|成立年限|
|⇥⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ isFollow|boolean|false|false|是否关注|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ position|string|职位(10)|false|职位(10)|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
| msg|string||false|提示信息|

##### 接口描述
> 




## 10.2	功能区集成电路行业现状

> GET  /chain/cloud/dustryStat/{dictId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|dictId||dictId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 10.3	功能区产业营收、利润

> GET  /chain/cloud/income/{dictId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|dictId||dictId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 10.4	功能区产业发展态势

> GET  /chain/cloud/situation/{dictId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|dictId||dictId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 10.5	国内产业分布

> GET  /chain/cloud/spread/{dictId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|dictId||dictId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11	火炬指标

## 11.1	删除火炬指标

> POST  /enterprise/torch/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||火炬指标Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.2	根据id查询火炬指标详情

> GET  /enterprise/torch/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询火炬指标详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|实体父类|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string|企业信用代码(20)|false|企业信用代码(20)|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ enterpriseId|string|企业id(50)|false|企业id(50)|
|⇥ id|string||false||
|⇥ importDate|string||false|导入时间|
|⇥ info|object||false||
|⇥ name|string|统计名称(50)|false|统计名称(50)|
|⇥ statBatch|string|统计批次(50)|false|统计批次(50)|
|⇥ statDate|string|yyyy-MM-dd|false|统计数据期间|
|⇥ unitName|string|公司名称(50)|false|公司名称(50)|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.3	导入火炬指标excel

> POST  /enterprise/torch/importEnterpriseTorchExcel
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|name||统计名称|
|statBatch||统计批次|
|statDate||统计数据期间|
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| file|string||false|上传文件|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.4	判断某年火炬指标数据是否存在

> POST  /enterprise/torch/isExist/{statDate}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|statDate||statDate|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.5	火炬指标列表

> POST  /enterprise/torch/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码(20)|false|企业信用代码(20)|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ enterpriseId|string|企业id(50)|false|企业id(50)|
|⇥⇥ id|string||false||
|⇥⇥ importDate|string||false|导入时间|
|⇥⇥ info|object||false||
|⇥⇥ name|string|统计名称(50)|false|统计名称(50)|
|⇥⇥ statBatch|string|统计批次(50)|false|统计批次(50)|
|⇥⇥ statDate|string|yyyy-MM-dd|false|统计数据期间|
|⇥⇥ unitName|string|公司名称(50)|false|公司名称(50)|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.6	修改火炬信息

> POST  /enterprise/torch/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| creditCode|string|企业信用代码(20)|false|企业信用代码(20)|
| deleteFlag|int32|0|false|删除标记|
| enterpriseId|string|企业id(50)|false|企业id(50)|
| id|string||false||
| importDate|string||false|导入时间|
| info|object||false||
| name|string|统计名称(50)|false|统计名称(50)|
| statBatch|string|统计批次(50)|false|统计批次(50)|
| statDate|string|yyyy-MM-dd|false|统计数据期间|
| unitName|string|公司名称(50)|false|公司名称(50)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.7	修改主要经济指标

> POST  /enterprise/torch/updateEconomic/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.8	修改头部

> POST  /enterprise/torch/updateHeader/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.9	修改基本信息

> POST  /enterprise/torch/updateInfo/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.10	修改知识产权

> POST  /enterprise/torch/updateProperty/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 11.11	修改员工学历结构

> POST  /enterprise/torch/updateStaff/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 12	统计高新技术企业等数据

## 12.1	统计高新技术企业等数据

> POST  /count/enterprises/countEnterprises
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13	预告活动

## 13.1	删除预告活动

> POST  /innovate/activity/notice/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||预告活动Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13.2	根据id查询预告活动详情

> GET  /innovate/activity/notice/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询预告活动详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|活动预告|
|⇥ beginTime|string||false|开始日期|
|⇥ content|string|活动内容64kb|false|活动内容64kb|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ endTime|string||false|结束日期|
|⇥ expiryDate|string|yyyy-MM-dd|false|更新时间|
|⇥ id|string||false||
|⇥ linkman|string|联系人(长度10)|false|联系人(长度10)|
|⇥ name|string|活动名称(长度50)|false|活动名称(长度50)|
|⇥ path|string|图片(长度300)|false|图片|
|⇥ pushTime|string||false|上架发布时间|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13.3	预告活动上下架

> POST  /innovate/activity/notice/editStatus
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||预告活动id，以‘-’分隔|
|status||0：下架；1：上架|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13.4	预告活动列表

> POST  /innovate/activity/notice/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ beginTime|string||false|开始日期|
|⇥⇥ content|string|活动内容64kb|false|活动内容64kb|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ endTime|string||false|结束日期|
|⇥⇥ expiryDate|string|yyyy-MM-dd|false|更新时间|
|⇥⇥ id|string||false||
|⇥⇥ linkman|string|联系人(长度10)|false|联系人(长度10)|
|⇥⇥ name|string|活动名称(长度50)|false|活动名称(长度50)|
|⇥⇥ path|string|图片(长度300)|false|图片|
|⇥⇥ pushTime|string||false|上架发布时间|
|⇥⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13.5	新增

> POST  /innovate/activity/notice/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| beginTime|string||false|开始日期|
| content|string|活动内容64kb|false|活动内容64kb|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| endTime|string||false|结束日期|
| expiryDate|string|yyyy-MM-dd|false|更新时间|
| id|string||false||
| linkman|string|联系人(长度10)|false|联系人(长度10)|
| name|string|活动名称(长度50)|false|活动名称(长度50)|
| path|string|图片(长度300)|false|图片|
| pushTime|string||false|上架发布时间|
| status|string|1：上架，0：下架|false|上下架状态|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13.6	修改

> POST  /innovate/activity/notice/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| beginTime|string||false|开始日期|
| content|string|活动内容64kb|false|活动内容64kb|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| endTime|string||false|结束日期|
| expiryDate|string|yyyy-MM-dd|false|更新时间|
| id|string||false||
| linkman|string|联系人(长度10)|false|联系人(长度10)|
| name|string|活动名称(长度50)|false|活动名称(长度50)|
| path|string|图片(长度300)|false|图片|
| pushTime|string||false|上架发布时间|
| status|string|1：上架，0：下架|false|上下架状态|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 13.7	预告活动审核

> POST  /innovate/activity/notice/verify
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||预告活动id|
|verifyPhoneNumber||审批人联系方式|
|verifyRemark||审批意见|
|verifyStatus||审核状态：1：通过，-1：不通过|
|verifyUsername||审批人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 14	优惠政策接口

## 14.1	地区列表

> POST  /perferentialPolicy/areaList
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|parentId||上级地区id，不传为0，默认为0|
|parentName||parentName|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ id|int32|1|false|id|
|⇥ level|int32||false||
|⇥ name|string||false||
|⇥ parentId|int32||false||
|⇥ parentName|string||false||
| msg|string||false|提示信息|

##### 接口描述
> 




## 14.2	政策详情

> POST  /perferentialPolicy/detail
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|优惠政策实体类|
|⇥ category|string|电子产业|false|产业类型|
|⇥ city|string|成都市|false|城市|
|⇥ content|string|富文本|false|内容|
|⇥ contentDescribe|string|内容描述|false|描述|
|⇥ county|string|高新区|false|地区|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string|1|false|id|
|⇥ imgUrl|string|http://|false|封面图片|
|⇥ industry|string|高新技术|false|产业集群|
|⇥ informationTime|string||false|政策时间|
|⇥ product|string|所属园区|false|所属园区|
|⇥ productInfo|string|开发区|false|园区类型|
|⇥ province|string|四川|false|省份|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|https://123|false|源地址|
|⇥ title|string|标题|false|标题|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 14.3	文章列表

> POST  /perferentialPolicy/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ category|string|电子产业|false|产业类型|
|⇥⇥ city|string|成都市|false|城市|
|⇥⇥ content|string|富文本|false|内容|
|⇥⇥ contentDescribe|string|内容描述|false|描述|
|⇥⇥ county|string|高新区|false|地区|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ imgUrl|string|http://|false|封面图片|
|⇥⇥ industry|string|高新技术|false|产业集群|
|⇥⇥ informationTime|string||false|政策时间|
|⇥⇥ product|string|所属园区|false|所属园区|
|⇥⇥ productInfo|string|开发区|false|园区类型|
|⇥⇥ province|string|四川|false|省份|
|⇥⇥ source|string|xxx|false|来源|
|⇥⇥ sourceUrl|string|https://123|false|源地址|
|⇥⇥ title|string|标题|false|标题|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 15	政策审核

## 15.1	政策申报列表

> POST  /examine/admin/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥⇥ applyUser|string|申请人|false|申请人|
|⇥⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥⇥ classifyName|string|政策分类|false|政策分类|
|⇥⇥ collectNum|int32||false|查看数|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥⇥ id|string||false||
|⇥⇥ isFollow|boolean|false|false|是否收藏|
|⇥⇥ lookNum|int32||false|阅读数|
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥⇥ remarks|string|备注|false|备注|
|⇥⇥ service|string|服务对象|false|服务对象|
|⇥⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥⇥ shareNum|int32||false|收藏数|
|⇥⇥ source|string|数据来源|false|数据来源|
|⇥⇥ status|string|上下架状态|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|政策展示类型|false|政策展示类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 15.2	政策申报详情

> GET  /examine/admin/query/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||政策id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 15.3	修改政策申报状态

> POST  /examine/admin/update
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|verifyStatus||状态|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 16	企业招商漏斗

## 16.1	企业塞选列表查询

> POST  /investment/funnel/getList
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||userId|
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 16.2	企业塞选列表查询

> POST  /investment/funnel/list
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||userId|
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 17	企业画像-企业体检

## 17.1	根据taskId查询企业体检详情

> GET  /enterprise/medically/detail/{taskId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|taskId||根据taskId查询企业体检详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|企业画像-企业体检实体类|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string|信用社代码|false|信用社代码|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ grade|string|评级|false|评级|
|⇥ id|string||false||
|⇥ info|object||false||
|⇥ name|string|企业名称|false|企业名称|
|⇥ score|number||false|评分|
|⇥ time|string||false|创建时间|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 17.2	生成企业体检末班数据

> POST  /enterprise/medically/getSaveResultData/{taskId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|taskId||taskId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 17.3	企业体检列表

> POST  /enterprise/medically/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|信用社代码|false|信用社代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ info|object||false||
|⇥⇥ name|string|企业名称|false|企业名称|
|⇥⇥ score|number||false|评分|
|⇥⇥ time|string||false|创建时间|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18	用户接口

## 18.1	用户详情

> GET  /account/detail
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|用户|
|⇥ account|string|账号|false|账号|
|⇥ createTime|string||false|创建时间|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|邮箱|false|邮箱|
|⇥ gender|string|性别|false|性别|
|⇥ id|string||false||
|⇥ name|string|昵称|false|昵称|
|⇥ password|string|密码|false|密码|
|⇥ path|string|头像地址|false|头像地址|
|⇥ status|string|用户状态 0-正常  1-禁用|false|用户状态 0-正常  1-禁用|
|⇥ statusName|string|状态名称|false|状态名称|
|⇥ telephone|string|手机|false|手机|
|⇥ unitCode|string|企业统一信用代码|false|企业统一信用代码|
|⇥ unitLicensePath|string|营业执照图片地址|false|营业执照图片地址|
|⇥ unitName|string|公司名称|false|公司名称|
|⇥ updateTime|string||false|更新时间|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.2	修改密码

> POST  /account/editPwd
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| mobilePhone|string|手机号|false|手机号|
| newPwd|string|新密码|false|新密码|
| oldPwd|string|旧密码|false|旧密码|
| smsCode|string|手机验证码|false|手机验证码|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.3	获取账户信息

> POST  /account/getInfo
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|用户|
|⇥ account|string|账号|false|账号|
|⇥ createTime|string||false|创建时间|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|邮箱|false|邮箱|
|⇥ gender|string|性别|false|性别|
|⇥ id|string||false||
|⇥ name|string|昵称|false|昵称|
|⇥ password|string|密码|false|密码|
|⇥ path|string|头像地址|false|头像地址|
|⇥ status|string|用户状态 0-正常  1-禁用|false|用户状态 0-正常  1-禁用|
|⇥ statusName|string|状态名称|false|状态名称|
|⇥ telephone|string|手机|false|手机|
|⇥ unitCode|string|企业统一信用代码|false|企业统一信用代码|
|⇥ unitLicensePath|string|营业执照图片地址|false|营业执照图片地址|
|⇥ unitName|string|公司名称|false|公司名称|
|⇥ updateTime|string||false|更新时间|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.4	用户登录

> POST  /account/login
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|account||account|
|password||password|
|smsCode||smsCode|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|用户|
|⇥ account|string|账号|false|账号|
|⇥ createTime|string||false|创建时间|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|邮箱|false|邮箱|
|⇥ gender|string|性别|false|性别|
|⇥ id|string||false||
|⇥ name|string|昵称|false|昵称|
|⇥ password|string|密码|false|密码|
|⇥ path|string|头像地址|false|头像地址|
|⇥ status|string|用户状态 0-正常  1-禁用|false|用户状态 0-正常  1-禁用|
|⇥ statusName|string|状态名称|false|状态名称|
|⇥ telephone|string|手机|false|手机|
|⇥ unitCode|string|企业统一信用代码|false|企业统一信用代码|
|⇥ unitLicensePath|string|营业执照图片地址|false|营业执照图片地址|
|⇥ unitName|string|公司名称|false|公司名称|
|⇥ updateTime|string||false|更新时间|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.5	注销登录

> GET  /account/logout
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.6	用户注册

> POST  /account/register
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| account|string|用户名|false|用户名|
| businessLicenseImg|string|营业执照图片|false|营业执照图片|
| companyName|string|公司名称|false|公司名称|
| creditCode|string|统一信用代码|false|统一信用代码|
| password|string|密码（md5）加密|false|密码（md5加密）|
| smsCode|string|短信验证码|false|短信验证码|
| telephone|string|手机号(非必填，默认与账号相同）|false|手机号(非必填，默认与账号相同）|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.7	修改用户

> POST  /account/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| account|string|账号|false|账号|
| createTime|string||false|创建时间|
| deleteFlag|int32|0|false|删除标记|
| email|string|邮箱|false|邮箱|
| gender|string|性别|false|性别|
| id|string||false||
| name|string|昵称|false|昵称|
| password|string|密码|false|密码|
| path|string|头像地址|false|头像地址|
| status|string|用户状态 0-正常  1-禁用|false|用户状态 0-正常  1-禁用|
| statusName|string|状态名称|false|状态名称|
| telephone|string|手机|false|手机|
| unitCode|string|企业统一信用代码|false|企业统一信用代码|
| unitLicensePath|string|营业执照图片地址|false|营业执照图片地址|
| unitName|string|公司名称|false|公司名称|
| updateTime|string||false|更新时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 18.8	更换手机号

> POST  /account/updateMobilePhone
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| newMobilePhone|string|新手机号|false|新手机号|
| newSmsCode|string|新手机短信验证码|false|新手机短信验证码|
| oldMobilePhone|string|原手机号|false|原手机号|
| oldSmsCode|string|原手机短信验证码|false|原手机短信验证码|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19	区内企业

## 19.1	根据id查询企业详情

> GET  /enterprise/inner/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询企业详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|企业|
|⇥ address|string|地址(200)|false|地址(200)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥ establishDate|string||false|成立日期|
|⇥ establishTime|int32||false|成立年限|
|⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥ grade|string|评级|false|评级|
|⇥ id|string||false||
|⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥ industryType|string|产业类型|false|产业类型|
|⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥ intelligence|int32||false|情报|
|⇥ isFollow|boolean|false|false|是否关注|
|⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥ longitude|string|经度(20)|false|经度(20)|
|⇥ name|string|公司名称|false|公司名称|
|⇥ otherChoice|string|其他选择|false|其他选择|
|⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥ position|string|职位(10)|false|职位(10)|
|⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥ province|string|省份|false|省份|
|⇥ ranking|int32||false|排名|
|⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥ revenue|int32||false|营收 (万元)|
|⇥ score|number||false|评分|
|⇥ staffNum|int32||false|员工数量|
|⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥ taxRevenue|int32||false|税收(万元)|
|⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥ type|int32||false|是否区内|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.2	根据信用代码查询企业详情

> GET  /enterprise/inner/detailByCreditCode/{creditCode}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||根据信用代码查询企业详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|企业|
|⇥ address|string|地址(200)|false|地址(200)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥ establishDate|string||false|成立日期|
|⇥ establishTime|int32||false|成立年限|
|⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥ grade|string|评级|false|评级|
|⇥ id|string||false||
|⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥ industryType|string|产业类型|false|产业类型|
|⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥ intelligence|int32||false|情报|
|⇥ isFollow|boolean|false|false|是否关注|
|⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥ longitude|string|经度(20)|false|经度(20)|
|⇥ name|string|公司名称|false|公司名称|
|⇥ otherChoice|string|其他选择|false|其他选择|
|⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥ position|string|职位(10)|false|职位(10)|
|⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥ province|string|省份|false|省份|
|⇥ ranking|int32||false|排名|
|⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥ revenue|int32||false|营收 (万元)|
|⇥ score|number||false|评分|
|⇥ staffNum|int32||false|员工数量|
|⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥ taxRevenue|int32||false|税收(万元)|
|⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥ type|int32||false|是否区内|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.3	导入区内企业excel

> POST  /enterprise/inner/importEnterpriseInnerExcel
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| file|string||false|上传文件|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.4	区内企业列表

> POST  /enterprise/inner/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ establishTime|int32||false|成立年限|
|⇥⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ isFollow|boolean|false|false|是否关注|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ position|string|职位(10)|false|职位(10)|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.5	根据id查询企业标签

> GET  /enterprise/inner/listTags/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询企业标签|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ address|string|地址(200)|false|地址(200)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥ establishDate|string||false|成立日期|
|⇥ establishTime|int32||false|成立年限|
|⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥ grade|string|评级|false|评级|
|⇥ id|string||false||
|⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥ industryType|string|产业类型|false|产业类型|
|⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥ intelligence|int32||false|情报|
|⇥ isFollow|boolean|false|false|是否关注|
|⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥ longitude|string|经度(20)|false|经度(20)|
|⇥ name|string|公司名称|false|公司名称|
|⇥ otherChoice|string|其他选择|false|其他选择|
|⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥ position|string|职位(10)|false|职位(10)|
|⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥ province|string|省份|false|省份|
|⇥ ranking|int32||false|排名|
|⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥ revenue|int32||false|营收 (万元)|
|⇥ score|number||false|评分|
|⇥ staffNum|int32||false|员工数量|
|⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥ taxRevenue|int32||false|税收(万元)|
|⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥ type|int32||false|是否区内|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.6	修改企业联系人信息

> POST  /enterprise/inner/updateLinkMan
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||企业id|
|linkMan||联系人|
|position||职位|
|telephone||联系电话|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.7	企业打标签绑定

> POST  /enterprise/inner/updateTags
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| dictId|string|政策Id|false|Id|
| enterpriseId|string|企业Id|false|企业Id|
| id|string||false||
| tagName|string|企业标签名称|false|企业标签名称|
| type|string|标签类型 0-excel导入时默认标签  1-自定义打标签|false|标签类型 0-excel导入时默认标签  1-自定义打标签|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 19.8	修改白名单

> POST  /enterprise/inner/whiteList
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||企业id|
|whiteList||是否白名单  0-是 1-否|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 20	经济运行简报接口

## 20.1	详情

> POST  /briefing/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|经济运行简报|
|⇥ caliber|int32||false|统计口径|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ fileUrl|string||false|pdf文件地址|
|⇥ id|string|1|false|id|
|⇥ pushTime|string||false|发布时间|
|⇥ title|string||false|标题|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 20.2	数据列表

> POST  /briefing/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ caliber|int32||false|统计口径|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ fileUrl|string||false|pdf文件地址|
|⇥⇥ id|string|1|false|id|
|⇥⇥ pushTime|string||false|发布时间|
|⇥⇥ title|string||false|标题|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21	企业政策门户web接口

## 21.1	批量取消政策收藏

> POST  /enterprise/web/deleteCollect
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21.2	我的政策收藏列表

> POST  /enterprise/web/getCollectList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ collectTime|string|收藏时间|false|收藏时间|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ id|string||false||
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ userId|string|用户id|false|用户id|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21.3	企业服务门户

> POST  /enterprise/web/getList
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||userId|
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥⇥ applyUser|string|申请人|false|申请人|
|⇥⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥⇥ classifyName|string|政策分类|false|政策分类|
|⇥⇥ collectNum|int32||false|查看数|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥⇥ id|string||false||
|⇥⇥ isFollow|boolean|false|false|是否收藏|
|⇥⇥ lookNum|int32||false|阅读数|
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥⇥ remarks|string|备注|false|备注|
|⇥⇥ service|string|服务对象|false|服务对象|
|⇥⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥⇥ shareNum|int32||false|收藏数|
|⇥⇥ source|string|数据来源|false|数据来源|
|⇥⇥ status|string|上下架状态|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|政策展示类型|false|政策展示类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21.4	热门政策列表

> POST  /enterprise/web/hot/getList
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|type||type|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥ applyUser|string|申请人|false|申请人|
|⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥ classifyName|string|政策分类|false|政策分类|
|⇥ collectNum|int32||false|查看数|
|⇥ content|string|政策详情|false|政策详情|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ declareDate|string||false|申报截止日期|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥ id|string||false||
|⇥ isFollow|boolean|false|false|是否收藏|
|⇥ lookNum|int32||false|阅读数|
|⇥ name|string|政策名称|false|政策名称|
|⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥ remarks|string|备注|false|备注|
|⇥ service|string|服务对象|false|服务对象|
|⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥ shareNum|int32||false|收藏数|
|⇥ source|string|数据来源|false|数据来源|
|⇥ status|string|上下架状态|false|上下架状态|
|⇥ summary|string|摘要|false|摘要|
|⇥ type|string|政策展示类型|false|政策展示类型|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|审核人|false|审核人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21.5	企业服务门户检索

> POST  /enterprise/web/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥⇥ applyUser|string|申请人|false|申请人|
|⇥⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥⇥ classifyName|string|政策分类|false|政策分类|
|⇥⇥ collectNum|int32||false|查看数|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥⇥ id|string||false||
|⇥⇥ lookNum|int32||false|阅读数|
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥⇥ remarks|string|备注|false|备注|
|⇥⇥ service|string|服务对象|false|服务对象|
|⇥⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥⇥ shareNum|int32||false|收藏数|
|⇥⇥ source|string|数据来源|false|数据来源|
|⇥⇥ status|string|上下架状态|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ type|string|政策展示类型|false|政策展示类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21.6	查询政策服务详情

> POST  /enterprise/web/query
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||政策id|
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false||
|⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥ classifyName|string|政策分类|false|政策分类|
|⇥ collectionTime|string||false|收藏时间|
|⇥ content|string|政策详情|false|政策详情|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ declareDate|string||false|申报截止日期|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ fileVo|array[object]|文件对象|false|文件接受对象数组|
|⇥⇥ fileName|string|文件名称|false|文件名称|
|⇥⇥ filePath|string|文件地址|false|文件地址|
|⇥ id|string||false||
|⇥ isFollow|boolean|false|false|是否收藏|
|⇥ name|string|政策名称|false|政策名称|
|⇥ needDeclare|string|是否需要申报|false|是否需要申报|
|⇥ service|string|服务对象|false|服务对象|
|⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥ source|string|数据来源|false|数据来源|
|⇥ status|string|上下架状态|false|上下架状态|
|⇥ summary|string|摘要|false|摘要|
|⇥ tags|array[object]|政策标签|false|政策标签|
|⇥⇥ dictId|string|字典标识|false|字典标识|
|⇥⇥ id|string||false||
|⇥⇥ policyId|string|政策Id|false|政策Id|
|⇥⇥ tagName|string|政策标签名称|false|政策标签名称|
|⇥ type|string|政策展示位置(0:全部 1:招商 2:企业 3:双创)|false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 21.7	收藏政策

> POST  /enterprise/web/saveCollect
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|policyId||政策id|
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 22	企业政策门户接口

## 22.1	批量删除或单删除

> DELETE  /enterprise/admin/delete
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 22.2	企业服务首页信息维护政策发布

> POST  /enterprise/admin/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥⇥ applyUser|string|申请人|false|申请人|
|⇥⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥⇥ classifyName|string|政策分类|false|政策分类|
|⇥⇥ collectNum|int32||false|查看数|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥⇥ id|string||false||
|⇥⇥ isFollow|boolean|false|false|是否收藏|
|⇥⇥ lookNum|int32||false|阅读数|
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥⇥ remarks|string|备注|false|备注|
|⇥⇥ service|string|服务对象|false|服务对象|
|⇥⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥⇥ shareNum|int32||false|收藏数|
|⇥⇥ source|string|数据来源|false|数据来源|
|⇥⇥ status|string|上下架状态|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|政策展示类型|false|政策展示类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 22.3	政策匹配

> POST  /enterprise/admin/policyMatch
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| imgCode|string||false||
| pageNumber|int32||false||
| pageSize|int32||false||
| unitCode|string||false||
| unitName|string||false||
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥⇥ applyUser|string|申请人|false|申请人|
|⇥⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥⇥ classifyName|string|政策分类|false|政策分类|
|⇥⇥ collectNum|int32||false|查看数|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥⇥ id|string||false||
|⇥⇥ isFollow|boolean|false|false|是否收藏|
|⇥⇥ lookNum|int32||false|阅读数|
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥⇥ remarks|string|备注|false|备注|
|⇥⇥ service|string|服务对象|false|服务对象|
|⇥⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥⇥ shareNum|int32||false|收藏数|
|⇥⇥ source|string|数据来源|false|数据来源|
|⇥⇥ status|string|上下架状态|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|政策展示类型|false|政策展示类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 22.4	查询政策服务详情

> POST  /enterprise/admin/query
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||政策id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false||
|⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥ classifyName|string|政策分类|false|政策分类|
|⇥ collectionTime|string||false|收藏时间|
|⇥ content|string|政策详情|false|政策详情|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ declareDate|string||false|申报截止日期|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ fileVo|array[object]|文件对象|false|文件接受对象数组|
|⇥⇥ fileName|string|文件名称|false|文件名称|
|⇥⇥ filePath|string|文件地址|false|文件地址|
|⇥ id|string||false||
|⇥ isFollow|boolean|false|false|是否收藏|
|⇥ name|string|政策名称|false|政策名称|
|⇥ needDeclare|string|是否需要申报|false|是否需要申报|
|⇥ service|string|服务对象|false|服务对象|
|⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥ source|string|数据来源|false|数据来源|
|⇥ status|string|上下架状态|false|上下架状态|
|⇥ summary|string|摘要|false|摘要|
|⇥ tags|array[object]|政策标签|false|政策标签|
|⇥⇥ dictId|string|字典标识|false|字典标识|
|⇥⇥ id|string||false||
|⇥⇥ policyId|string|政策Id|false|政策Id|
|⇥⇥ tagName|string|政策标签名称|false|政策标签名称|
|⇥ type|string|政策展示位置(0:全部 1:招商 2:企业 3:双创)|false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 22.5	批量上下架发布

> POST  /enterprise/admin/release
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| id|string|政策id|false|政策id|
| status|string|请传0和1|false|状态|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 22.6	政策新增或修改

> POST  /enterprise/admin/saveOrUpdate
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| classifyCode|string|政策分类code|false|政策分类code|
| classifyName|string|政策分类|false|政策分类|
| content|string|政策详情|false|政策详情|
| createUser|string|ZhangSan|false|创建人|
| declareDate|string||false|申报截止日期|
| displayLocation|array[int32]|多个数组|false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
| fileDto|array[object]|文件对象|false|文件接受对象数组|
|⇥ fileName|string|文件名称|false|文件名称|
|⇥ filePath|string|文件地址|false|文件地址|
| id|string|政策id|false|政策id|
| name|string|政策名称|false|政策名称|
| needDeclare|int32||false|是否需要申报|
| service|string|服务对象|false|服务对象|
| serviceCode|string|服务对象code|false|服务对象code|
| source|string|数据来源|false|数据来源|
| summary|string|摘要|false|摘要|
| tags|array[object]|政策详情|false|政策详情|
|⇥ dictId|string|字典标识|false|字典标识|
|⇥ id|string||false||
|⇥ policyId|string|政策Id|false|政策Id|
|⇥ tagName|string|政策标签名称|false|政策标签名称|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23	双创载体

## 23.1	删除双创载体

> POST  /innovate/carrier/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||双创载体Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23.2	根据id查询双创载体详情

> GET  /innovate/carrier/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询双创载体详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|双创载体|
|⇥ address|string|具体位置(100)|false|具体位置(100)|
|⇥ bulidArea|string|建筑面积（平方米）(长度10)|false|建筑面积（平方米）(长度10)|
|⇥ content|string|载体简介(长度500)|false|载体简介(长度500)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ discount|string|载体配套优惠(长度500)|false|载体配套优惠(长度500)|
|⇥ domain|string|所属领域(长度50,数据字典ID)|false|所属领域(长度50,数据字典ID)|
|⇥ domainName|string|所属领域名称(长度50,数据字典名称)|false|所属领域名称(长度50,数据字典名称)|
|⇥ id|string||false||
|⇥ level|string|载体级别(长度50数据字典ID)|false|载体级别(长度50数据字典ID)|
|⇥ levelName|string|载体级别名称(长度50,数据字典名称)|false|载体级别名称(长度50,数据字典名称)|
|⇥ name|string|载体名称(长度50)|false|载体名称(长度50)|
|⇥ occupiedArea|string|已入驻面积（平方米）(长度10)|false|已入驻面积（平方米）(长度10)|
|⇥ path|string|图片(长度300)|false|图片|
|⇥ publicArea|string|公共服务场地面积（平方米）(长度10)|false|公共服务场地面积（平方米）(长度10)|
|⇥ pushTime|string||false|上架发布时间|
|⇥ recruit|string|招募对象(长度500)|false|招募对象(长度500)|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥ totalFund|number||false|企业自有孵化基金总额（万元）|
|⇥ type|string|载体类型(长度50数据字典ID)|false|载体类型(长度50数据字典ID)|
|⇥ typeName|string|载体类型名称(长度50,数据字典名称)|false|载体类型名称(长度50,数据字典名称)|
|⇥ unitNature|string|单位性质(长度50数据字典ID)|false|单位性质(长度50数据字典ID)|
|⇥ unitNatureName|string|单位性质名称(长度50,数据字典名称)|false|单位性质名称(长度50,数据字典名称)|
|⇥ unsetArea|string|待入驻面积（平方米）|false|待入驻面积（平方米）|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23.3	双创载体上下架

> POST  /innovate/carrier/editStatus
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||双创载体id，以‘-’分隔|
|status||0：下架；1：上架|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23.4	双创载体列表

> POST  /innovate/carrier/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|具体位置(100)|false|具体位置(100)|
|⇥⇥ bulidArea|string|建筑面积（平方米）(长度10)|false|建筑面积（平方米）(长度10)|
|⇥⇥ content|string|载体简介(长度500)|false|载体简介(长度500)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ discount|string|载体配套优惠(长度500)|false|载体配套优惠(长度500)|
|⇥⇥ domain|string|所属领域(长度50,数据字典ID)|false|所属领域(长度50,数据字典ID)|
|⇥⇥ domainName|string|所属领域名称(长度50,数据字典名称)|false|所属领域名称(长度50,数据字典名称)|
|⇥⇥ id|string||false||
|⇥⇥ level|string|载体级别(长度50数据字典ID)|false|载体级别(长度50数据字典ID)|
|⇥⇥ levelName|string|载体级别名称(长度50,数据字典名称)|false|载体级别名称(长度50,数据字典名称)|
|⇥⇥ name|string|载体名称(长度50)|false|载体名称(长度50)|
|⇥⇥ occupiedArea|string|已入驻面积（平方米）(长度10)|false|已入驻面积（平方米）(长度10)|
|⇥⇥ path|string|图片(长度300)|false|图片|
|⇥⇥ publicArea|string|公共服务场地面积（平方米）(长度10)|false|公共服务场地面积（平方米）(长度10)|
|⇥⇥ pushTime|string||false|上架发布时间|
|⇥⇥ recruit|string|招募对象(长度500)|false|招募对象(长度500)|
|⇥⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥⇥ telephone|string|联系方式(长度20)|false|联系方式(长度20)|
|⇥⇥ totalFund|number||false|企业自有孵化基金总额（万元）|
|⇥⇥ type|string|载体类型(长度50数据字典ID)|false|载体类型(长度50数据字典ID)|
|⇥⇥ typeName|string|载体类型名称(长度50,数据字典名称)|false|载体类型名称(长度50,数据字典名称)|
|⇥⇥ unitNature|string|单位性质(长度50数据字典ID)|false|单位性质(长度50数据字典ID)|
|⇥⇥ unitNatureName|string|单位性质名称(长度50,数据字典名称)|false|单位性质名称(长度50,数据字典名称)|
|⇥⇥ unsetArea|string|待入驻面积（平方米）|false|待入驻面积（平方米）|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
|⇥⇥ verifyRemark|string|审核建议长度(500)|false|审核建议|
|⇥⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|zhangsna(36)|false|审核人id|
|⇥⇥ verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23.5	新增

> POST  /innovate/carrier/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| address|string|具体位置(100)|false|具体位置(100)|
| bulidArea|string|建筑面积（平方米）(长度10)|false|建筑面积（平方米）(长度10)|
| content|string|载体简介(长度500)|false|载体简介(长度500)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| discount|string|载体配套优惠(长度500)|false|载体配套优惠(长度500)|
| domain|string|所属领域(长度50,数据字典ID)|false|所属领域(长度50,数据字典ID)|
| domainName|string|所属领域名称(长度50,数据字典名称)|false|所属领域名称(长度50,数据字典名称)|
| id|string||false||
| level|string|载体级别(长度50数据字典ID)|false|载体级别(长度50数据字典ID)|
| levelName|string|载体级别名称(长度50,数据字典名称)|false|载体级别名称(长度50,数据字典名称)|
| name|string|载体名称(长度50)|false|载体名称(长度50)|
| occupiedArea|string|已入驻面积（平方米）(长度10)|false|已入驻面积（平方米）(长度10)|
| path|string|图片(长度300)|false|图片|
| publicArea|string|公共服务场地面积（平方米）(长度10)|false|公共服务场地面积（平方米）(长度10)|
| pushTime|string||false|上架发布时间|
| recruit|string|招募对象(长度500)|false|招募对象(长度500)|
| status|string|1：上架，0：下架|false|上下架状态|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| totalFund|number||false|企业自有孵化基金总额（万元）|
| type|string|载体类型(长度50数据字典ID)|false|载体类型(长度50数据字典ID)|
| typeName|string|载体类型名称(长度50,数据字典名称)|false|载体类型名称(长度50,数据字典名称)|
| unitNature|string|单位性质(长度50数据字典ID)|false|单位性质(长度50数据字典ID)|
| unitNatureName|string|单位性质名称(长度50,数据字典名称)|false|单位性质名称(长度50,数据字典名称)|
| unsetArea|string|待入驻面积（平方米）|false|待入驻面积（平方米）|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23.6	修改

> POST  /innovate/carrier/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| address|string|具体位置(100)|false|具体位置(100)|
| bulidArea|string|建筑面积（平方米）(长度10)|false|建筑面积（平方米）(长度10)|
| content|string|载体简介(长度500)|false|载体简介(长度500)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| discount|string|载体配套优惠(长度500)|false|载体配套优惠(长度500)|
| domain|string|所属领域(长度50,数据字典ID)|false|所属领域(长度50,数据字典ID)|
| domainName|string|所属领域名称(长度50,数据字典名称)|false|所属领域名称(长度50,数据字典名称)|
| id|string||false||
| level|string|载体级别(长度50数据字典ID)|false|载体级别(长度50数据字典ID)|
| levelName|string|载体级别名称(长度50,数据字典名称)|false|载体级别名称(长度50,数据字典名称)|
| name|string|载体名称(长度50)|false|载体名称(长度50)|
| occupiedArea|string|已入驻面积（平方米）(长度10)|false|已入驻面积（平方米）(长度10)|
| path|string|图片(长度300)|false|图片|
| publicArea|string|公共服务场地面积（平方米）(长度10)|false|公共服务场地面积（平方米）(长度10)|
| pushTime|string||false|上架发布时间|
| recruit|string|招募对象(长度500)|false|招募对象(长度500)|
| status|string|1：上架，0：下架|false|上下架状态|
| telephone|string|联系方式(长度20)|false|联系方式(长度20)|
| totalFund|number||false|企业自有孵化基金总额（万元）|
| type|string|载体类型(长度50数据字典ID)|false|载体类型(长度50数据字典ID)|
| typeName|string|载体类型名称(长度50,数据字典名称)|false|载体类型名称(长度50,数据字典名称)|
| unitNature|string|单位性质(长度50数据字典ID)|false|单位性质(长度50数据字典ID)|
| unitNatureName|string|单位性质名称(长度50,数据字典名称)|false|单位性质名称(长度50,数据字典名称)|
| unsetArea|string|待入驻面积（平方米）|false|待入驻面积（平方米）|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| verifyPhoneNumber|string|1300xxxxxxxx(长度50)|false|审核人联系方式|
| verifyRemark|string|审核建议长度(500)|false|审核建议|
| verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核状态|
| verifyTime|string||false|审核时间|
| verifyUser|string|zhangsna(36)|false|审核人id|
| verifyUsername|string|zhangsan(长度50)|false|审核人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 23.7	双创载体审核

> POST  /innovate/carrier/verify
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||双创载体id|
|verifyPhoneNumber||审批人联系方式|
|verifyRemark||审批意见|
|verifyStatus||审核状态：1：通过，-1：不通过|
|verifyUsername||审批人姓名|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 24	企业招商图鉴

## 24.1	本月获融资企业列表

> GET  /investment/research/listFinancing/{finanDate}/{pageNo}/{pageSize}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|finanDate||finanDate||pageNo||pageNo||pageSize||pageSize|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 24.2	智慧招商统计图鉴

> GET  /investment/research/statChart
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 24.3	招商评估模型等级分布

> GET  /investment/research/statLevel
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ grade|string|评级|false|评级|
|⇥ num|string|单位数量|false|单位数量|
|⇥ percentage|string|百分率|false|百分率|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25	诉求反馈接口

## 25.1	删除

> POST  /appeal/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|诉求类|
|⇥ classify|string|Xxxx|false|分类|
|⇥ code|string|q1|false|编码|
|⇥ content|string|诉求内容|false|诉求内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|1@q.com|false|邮箱地址|
|⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥ evaluateScore|int32|100|false|评价分数|
|⇥ id|string|1|false|id|
|⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥ nickname|string|张三|false|用户名称|
|⇥ replyContent|string|1|false|回复内容|
|⇥ replyStatus|string|1|false|回复状态|
|⇥ replyTime|string||false|回复时间|
|⇥ replyUserId|string|1|false|回复人id|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|1|false|用户id|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.2	详情

> POST  /appeal/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|诉求类|
|⇥ classify|string|Xxxx|false|分类|
|⇥ code|string|q1|false|编码|
|⇥ content|string|诉求内容|false|诉求内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|1@q.com|false|邮箱地址|
|⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥ evaluateScore|int32|100|false|评价分数|
|⇥ id|string|1|false|id|
|⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥ nickname|string|张三|false|用户名称|
|⇥ replyContent|string|1|false|回复内容|
|⇥ replyStatus|string|1|false|回复状态|
|⇥ replyTime|string||false|回复时间|
|⇥ replyUserId|string|1|false|回复人id|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|1|false|用户id|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.3	列表

> POST  /appeal/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ classify|string|Xxxx|false|分类|
|⇥⇥ code|string|q1|false|编码|
|⇥⇥ content|string|诉求内容|false|诉求内容|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ email|string|1@q.com|false|邮箱地址|
|⇥⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥⇥ evaluateScore|int32|100|false|评价分数|
|⇥⇥ id|string|1|false|id|
|⇥⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥⇥ nickname|string|张三|false|用户名称|
|⇥⇥ replyContent|string|1|false|回复内容|
|⇥⇥ replyStatus|string|1|false|回复状态|
|⇥⇥ replyTime|string||false|回复时间|
|⇥⇥ replyUserId|string|1|false|回复人id|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ userId|string|1|false|用户id|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.4	诉求回复

> POST  /appeal/reply
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||诉求id|
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|replyContent||回复内容|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.5	删除

> POST  /web/appeal/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|诉求类|
|⇥ classify|string|Xxxx|false|分类|
|⇥ code|string|q1|false|编码|
|⇥ content|string|诉求内容|false|诉求内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|1@q.com|false|邮箱地址|
|⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥ evaluateScore|int32|100|false|评价分数|
|⇥ id|string|1|false|id|
|⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥ nickname|string|张三|false|用户名称|
|⇥ replyContent|string|1|false|回复内容|
|⇥ replyStatus|string|1|false|回复状态|
|⇥ replyTime|string||false|回复时间|
|⇥ replyUserId|string|1|false|回复人id|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|1|false|用户id|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.6	详情

> POST  /web/appeal/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|诉求类|
|⇥ classify|string|Xxxx|false|分类|
|⇥ code|string|q1|false|编码|
|⇥ content|string|诉求内容|false|诉求内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|1@q.com|false|邮箱地址|
|⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥ evaluateScore|int32|100|false|评价分数|
|⇥ id|string|1|false|id|
|⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥ nickname|string|张三|false|用户名称|
|⇥ replyContent|string|1|false|回复内容|
|⇥ replyStatus|string|1|false|回复状态|
|⇥ replyTime|string||false|回复时间|
|⇥ replyUserId|string|1|false|回复人id|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|1|false|用户id|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.7	修改诉求

> POST  /web/appeal/edit
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| classify|string|Xxxx|false|分类|
| code|string|q1|false|编码|
| content|string|诉求内容|false|诉求内容|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| email|string|1@q.com|false|邮箱地址|
| evaluateContent|string|xxxxx|false|评价内容|
| evaluateScore|int32|100|false|评价分数|
| id|string|1|false|id|
| mobilephone|string|130xxxxxxxxx|false|联系电话|
| nickname|string|张三|false|用户名称|
| replyContent|string|1|false|回复内容|
| replyStatus|string|1|false|回复状态|
| replyTime|string||false|回复时间|
| replyUserId|string|1|false|回复人id|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| userId|string|1|false|用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|诉求类|
|⇥ classify|string|Xxxx|false|分类|
|⇥ code|string|q1|false|编码|
|⇥ content|string|诉求内容|false|诉求内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|1@q.com|false|邮箱地址|
|⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥ evaluateScore|int32|100|false|评价分数|
|⇥ id|string|1|false|id|
|⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥ nickname|string|张三|false|用户名称|
|⇥ replyContent|string|1|false|回复内容|
|⇥ replyStatus|string|1|false|回复状态|
|⇥ replyTime|string||false|回复时间|
|⇥ replyUserId|string|1|false|回复人id|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|1|false|用户id|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.8	列表

> POST  /web/appeal/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ classify|string|Xxxx|false|分类|
|⇥⇥ code|string|q1|false|编码|
|⇥⇥ content|string|诉求内容|false|诉求内容|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ email|string|1@q.com|false|邮箱地址|
|⇥⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥⇥ evaluateScore|int32|100|false|评价分数|
|⇥⇥ id|string|1|false|id|
|⇥⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥⇥ nickname|string|张三|false|用户名称|
|⇥⇥ replyContent|string|1|false|回复内容|
|⇥⇥ replyStatus|string|1|false|回复状态|
|⇥⇥ replyTime|string||false|回复时间|
|⇥⇥ replyUserId|string|1|false|回复人id|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ userId|string|1|false|用户id|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.9	撤销

> POST  /web/appeal/revoke/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 25.10	提交诉求

> POST  /web/appeal/submit
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|content||content|
|email||email|
|mobilephone||mobilephone|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|诉求类|
|⇥ classify|string|Xxxx|false|分类|
|⇥ code|string|q1|false|编码|
|⇥ content|string|诉求内容|false|诉求内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ email|string|1@q.com|false|邮箱地址|
|⇥ evaluateContent|string|xxxxx|false|评价内容|
|⇥ evaluateScore|int32|100|false|评价分数|
|⇥ id|string|1|false|id|
|⇥ mobilephone|string|130xxxxxxxxx|false|联系电话|
|⇥ nickname|string|张三|false|用户名称|
|⇥ replyContent|string|1|false|回复内容|
|⇥ replyStatus|string|1|false|回复状态|
|⇥ replyTime|string||false|回复时间|
|⇥ replyUserId|string|1|false|回复人id|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|1|false|用户id|
| msg|string||false|提示信息|

##### 接口描述
> 




## 26	企业画像-企业对比

## 26.1	企业对比

> POST  /enterprise/comparison/getEnterpriseComparison
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCodeList|array[string]|123456789|false|企业信用代码|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27	招商项目

## 27.1	管理员招商管理保存

> POST  /investment/adminSave
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| advancePlan|string|项目内容及推进计划(年度)|false|项目内容及推进计划(年度)|
| advice|string|项目引进单位评估建议|false|项目引进单位评估建议|
| appointmentTime|string||false|预约时间|
| articleId|string|文章id|false|文章id|
| articleName|string|洽谈方向、招商类型(文章名称)|false|洽谈方向、招商类型(文章名称)|
| category|string|行业|false|行业|
| companyInfo|string|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|false|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|
| companyName|string|企业名称|false|企业名称|
| conclusion|string|管委会审定结论|false|管委会审定结论|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| duty|string|职务|false|职务|
| earlyDevelopment|string|项目前期开展情况|false|项目前期开展情况|
| economic|string|项目经济效益及社会效益预测|false|项目经济效益及社会效益预测|
| email|string|邮箱|false|邮箱|
| emissionIndex|string|项目排放指标|false|项目排放指标|
| fillTime|string||false|填表时间|
| fixedAssets|number||false|固定资产投资(万元)|
| flowAmount|number||false|流动资金(万元)|
| gas|number||false|天然气(立方米/日)|
| govNeed|string|政策需求|false|政策需求|
| id|string||false||
| imgCode|string|图形验证码|false|图形验证码|
| investmentLevel|string|投资强度|false|投资强度|
| investmentTotal|number||false|计划总投资(万元)|
| investor|string|投资方|false|投资方|
| linkman|string|联系人|false|联系人|
| mainBusiness|string|主要经营|false|主要经营|
| number|string|编号|false|编号|
| orderType|int32||false|0:关闭 1:待预约 2:已预约|
| power|number||false|电力(Kva)|
| projectManager|string|项目经理|false|项目经理|
| projectManagerMobile|string|项目经理联系电话|false|项目经理联系电话|
| projectName|string|项目名称|false|项目名称|
| radInvestment|number||false|研发投资(万元)|
| recentFinance|string|近期财务状况(包括营业收入及纳税等)|false|近期财务状况(包括营业收入及纳税等)|
| siteScheme|string|意向选址、用地/使用载体情况 (选址方案)|false|意向选址、用地/使用载体情况 (选址方案)|
| smsCode|string|手机验证码|false|手机验证码|
| status|string|项目状态|false|项目状态|
| telephone|string|手机|false|手机|
| unitCode|string|统一社会信用代码|false|统一社会信用代码|
| unitLegal|string|法人代表|false|法人代表|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| userId|string|预约用户id|false|预约用户id|
| userName|string|预约用户名称|false|预约用户名称|
| user_phone|string|创建人联系电话|false|创建人联系电话|
| water|number||false|用水(立方米/日)|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.2	批量删除或单删除

> DELETE  /investment/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|rowkeys||招商项目id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.3	根据id查询预约项目详情

> GET  /investment/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询预约项目详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|招商对接|
|⇥ advancePlan|string|项目内容及推进计划(年度)|false|项目内容及推进计划(年度)|
|⇥ advice|string|项目引进单位评估建议|false|项目引进单位评估建议|
|⇥ appointmentTime|string||false|预约时间|
|⇥ articleId|string|文章id|false|文章id|
|⇥ articleName|string|洽谈方向、招商类型(文章名称)|false|洽谈方向、招商类型(文章名称)|
|⇥ category|string|行业|false|行业|
|⇥ companyInfo|string|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|false|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|
|⇥ companyName|string|企业名称|false|企业名称|
|⇥ conclusion|string|管委会审定结论|false|管委会审定结论|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ duty|string|职务|false|职务|
|⇥ earlyDevelopment|string|项目前期开展情况|false|项目前期开展情况|
|⇥ economic|string|项目经济效益及社会效益预测|false|项目经济效益及社会效益预测|
|⇥ email|string|邮箱|false|邮箱|
|⇥ emissionIndex|string|项目排放指标|false|项目排放指标|
|⇥ fillTime|string||false|填表时间|
|⇥ fixedAssets|number||false|固定资产投资(万元)|
|⇥ flowAmount|number||false|流动资金(万元)|
|⇥ gas|number||false|天然气(立方米/日)|
|⇥ govNeed|string|政策需求|false|政策需求|
|⇥ id|string||false||
|⇥ imgCode|string|图形验证码|false|图形验证码|
|⇥ investmentLevel|string|投资强度|false|投资强度|
|⇥ investmentTotal|number||false|计划总投资(万元)|
|⇥ investor|string|投资方|false|投资方|
|⇥ linkman|string|联系人|false|联系人|
|⇥ mainBusiness|string|主要经营|false|主要经营|
|⇥ number|string|编号|false|编号|
|⇥ orderType|int32||false|0:关闭 1:待预约 2:已预约|
|⇥ power|number||false|电力(Kva)|
|⇥ projectManager|string|项目经理|false|项目经理|
|⇥ projectManagerMobile|string|项目经理联系电话|false|项目经理联系电话|
|⇥ projectName|string|项目名称|false|项目名称|
|⇥ radInvestment|number||false|研发投资(万元)|
|⇥ recentFinance|string|近期财务状况(包括营业收入及纳税等)|false|近期财务状况(包括营业收入及纳税等)|
|⇥ siteScheme|string|意向选址、用地/使用载体情况 (选址方案)|false|意向选址、用地/使用载体情况 (选址方案)|
|⇥ smsCode|string|手机验证码|false|手机验证码|
|⇥ status|string|项目状态|false|项目状态|
|⇥ telephone|string|手机|false|手机|
|⇥ unitCode|string|统一社会信用代码|false|统一社会信用代码|
|⇥ unitLegal|string|法人代表|false|法人代表|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ userId|string|预约用户id|false|预约用户id|
|⇥ userName|string|预约用户名称|false|预约用户名称|
|⇥ user_phone|string|创建人联系电话|false|创建人联系电话|
|⇥ water|number||false|用水(立方米/日)|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.4	统计招商项目数量

> GET  /investment/getInvestmentProjectStatusCount
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.5	获取项目经理

> GET  /investment/getUsersByTeam
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ abbrName|string||false||
|⇥ account|string||false||
|⇥ accountStatus|string||false||
|⇥ address|string||false||
|⇥ avatarImg|string||false||
|⇥ creatTime|string||false||
|⇥ createId|string||false||
|⇥ createMan|string||false||
|⇥ deleteTime|string||false||
|⇥ description|string||false||
|⇥ dutyLevel|string||false||
|⇥ email|string||false||
|⇥ emergentPhone|string||false||
|⇥ ext1|string||false||
|⇥ ext2|string||false||
|⇥ ext3|string||false||
|⇥ ext4|string||false||
|⇥ ext5|string||false||
|⇥ ext6|string||false||
|⇥ globalOrder|int32||false||
|⇥ ipRange|string||false||
|⇥ machineCode|string||false||
|⇥ mobile|string||false||
|⇥ name|string||false||
|⇥ nameFullPy|string||false||
|⇥ namePy|string||false||
|⇥ phone|string||false||
|⇥ place|string||false||
|⇥ rank|int32||false||
|⇥ rankOrder|int32||false||
|⇥ recflag|string||false||
|⇥ sex|string||false||
|⇥ stCa|string||false||
|⇥ stExtHrPeopleInfoId|string||false||
|⇥ stExtPeopleWorkNum|string||false||
|⇥ teamId|string||false||
|⇥ teamName|string||false||
|⇥ title|string||false||
|⇥ updateTime|string||false||
|⇥ userId|string||false||
|⇥ userType|string||false||
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.6	预约项目列表

> POST  /investment/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ advancePlan|string|项目内容及推进计划(年度)|false|项目内容及推进计划(年度)|
|⇥⇥ advice|string|项目引进单位评估建议|false|项目引进单位评估建议|
|⇥⇥ appointmentTime|string||false|预约时间|
|⇥⇥ articleId|string|文章id|false|文章id|
|⇥⇥ articleName|string|洽谈方向、招商类型(文章名称)|false|洽谈方向、招商类型(文章名称)|
|⇥⇥ category|string|行业|false|行业|
|⇥⇥ companyInfo|string|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|false|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|
|⇥⇥ companyName|string|企业名称|false|企业名称|
|⇥⇥ conclusion|string|管委会审定结论|false|管委会审定结论|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ duty|string|职务|false|职务|
|⇥⇥ earlyDevelopment|string|项目前期开展情况|false|项目前期开展情况|
|⇥⇥ economic|string|项目经济效益及社会效益预测|false|项目经济效益及社会效益预测|
|⇥⇥ email|string|邮箱|false|邮箱|
|⇥⇥ emissionIndex|string|项目排放指标|false|项目排放指标|
|⇥⇥ fillTime|string||false|填表时间|
|⇥⇥ fixedAssets|number||false|固定资产投资(万元)|
|⇥⇥ flowAmount|number||false|流动资金(万元)|
|⇥⇥ gas|number||false|天然气(立方米/日)|
|⇥⇥ govNeed|string|政策需求|false|政策需求|
|⇥⇥ id|string||false||
|⇥⇥ imgCode|string|图形验证码|false|图形验证码|
|⇥⇥ investmentLevel|string|投资强度|false|投资强度|
|⇥⇥ investmentTotal|number||false|计划总投资(万元)|
|⇥⇥ investor|string|投资方|false|投资方|
|⇥⇥ linkman|string|联系人|false|联系人|
|⇥⇥ mainBusiness|string|主要经营|false|主要经营|
|⇥⇥ number|string|编号|false|编号|
|⇥⇥ orderType|int32||false|0:关闭 1:待预约 2:已预约|
|⇥⇥ power|number||false|电力(Kva)|
|⇥⇥ projectManager|string|项目经理|false|项目经理|
|⇥⇥ projectManagerMobile|string|项目经理联系电话|false|项目经理联系电话|
|⇥⇥ projectName|string|项目名称|false|项目名称|
|⇥⇥ radInvestment|number||false|研发投资(万元)|
|⇥⇥ recentFinance|string|近期财务状况(包括营业收入及纳税等)|false|近期财务状况(包括营业收入及纳税等)|
|⇥⇥ siteScheme|string|意向选址、用地/使用载体情况 (选址方案)|false|意向选址、用地/使用载体情况 (选址方案)|
|⇥⇥ smsCode|string|手机验证码|false|手机验证码|
|⇥⇥ status|string|项目状态|false|项目状态|
|⇥⇥ telephone|string|手机|false|手机|
|⇥⇥ unitCode|string|统一社会信用代码|false|统一社会信用代码|
|⇥⇥ unitLegal|string|法人代表|false|法人代表|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ userId|string|预约用户id|false|预约用户id|
|⇥⇥ userName|string|预约用户名称|false|预约用户名称|
|⇥⇥ user_phone|string|创建人联系电话|false|创建人联系电话|
|⇥⇥ water|number||false|用水(立方米/日)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.7	我的招商对接列表

> POST  /investment/mylist
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ advancePlan|string|项目内容及推进计划(年度)|false|项目内容及推进计划(年度)|
|⇥⇥ advice|string|项目引进单位评估建议|false|项目引进单位评估建议|
|⇥⇥ appointmentTime|string||false|预约时间|
|⇥⇥ articleId|string|文章id|false|文章id|
|⇥⇥ articleName|string|洽谈方向、招商类型(文章名称)|false|洽谈方向、招商类型(文章名称)|
|⇥⇥ category|string|行业|false|行业|
|⇥⇥ companyInfo|string|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|false|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|
|⇥⇥ companyName|string|企业名称|false|企业名称|
|⇥⇥ conclusion|string|管委会审定结论|false|管委会审定结论|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ duty|string|职务|false|职务|
|⇥⇥ earlyDevelopment|string|项目前期开展情况|false|项目前期开展情况|
|⇥⇥ economic|string|项目经济效益及社会效益预测|false|项目经济效益及社会效益预测|
|⇥⇥ email|string|邮箱|false|邮箱|
|⇥⇥ emissionIndex|string|项目排放指标|false|项目排放指标|
|⇥⇥ fillTime|string||false|填表时间|
|⇥⇥ fixedAssets|number||false|固定资产投资(万元)|
|⇥⇥ flowAmount|number||false|流动资金(万元)|
|⇥⇥ gas|number||false|天然气(立方米/日)|
|⇥⇥ govNeed|string|政策需求|false|政策需求|
|⇥⇥ id|string||false||
|⇥⇥ imgCode|string|图形验证码|false|图形验证码|
|⇥⇥ investmentLevel|string|投资强度|false|投资强度|
|⇥⇥ investmentTotal|number||false|计划总投资(万元)|
|⇥⇥ investor|string|投资方|false|投资方|
|⇥⇥ linkman|string|联系人|false|联系人|
|⇥⇥ mainBusiness|string|主要经营|false|主要经营|
|⇥⇥ number|string|编号|false|编号|
|⇥⇥ orderType|int32||false|0:关闭 1:待预约 2:已预约|
|⇥⇥ power|number||false|电力(Kva)|
|⇥⇥ projectManager|string|项目经理|false|项目经理|
|⇥⇥ projectManagerMobile|string|项目经理联系电话|false|项目经理联系电话|
|⇥⇥ projectName|string|项目名称|false|项目名称|
|⇥⇥ radInvestment|number||false|研发投资(万元)|
|⇥⇥ recentFinance|string|近期财务状况(包括营业收入及纳税等)|false|近期财务状况(包括营业收入及纳税等)|
|⇥⇥ siteScheme|string|意向选址、用地/使用载体情况 (选址方案)|false|意向选址、用地/使用载体情况 (选址方案)|
|⇥⇥ smsCode|string|手机验证码|false|手机验证码|
|⇥⇥ status|string|项目状态|false|项目状态|
|⇥⇥ telephone|string|手机|false|手机|
|⇥⇥ unitCode|string|统一社会信用代码|false|统一社会信用代码|
|⇥⇥ unitLegal|string|法人代表|false|法人代表|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ userId|string|预约用户id|false|预约用户id|
|⇥⇥ userName|string|预约用户名称|false|预约用户名称|
|⇥⇥ user_phone|string|创建人联系电话|false|创建人联系电话|
|⇥⇥ water|number||false|用水(立方米/日)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.8	撤销预约

> GET  /investment/revoke/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||撤销预约|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.9	修改预约对接

> POST  /investment/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| advancePlan|string|项目内容及推进计划(年度)|false|项目内容及推进计划(年度)|
| advice|string|项目引进单位评估建议|false|项目引进单位评估建议|
| appointmentTime|string||false|预约时间|
| articleId|string|文章id|false|文章id|
| articleName|string|洽谈方向、招商类型(文章名称)|false|洽谈方向、招商类型(文章名称)|
| category|string|行业|false|行业|
| companyInfo|string|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|false|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|
| companyName|string|企业名称|false|企业名称|
| conclusion|string|管委会审定结论|false|管委会审定结论|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| duty|string|职务|false|职务|
| earlyDevelopment|string|项目前期开展情况|false|项目前期开展情况|
| economic|string|项目经济效益及社会效益预测|false|项目经济效益及社会效益预测|
| email|string|邮箱|false|邮箱|
| emissionIndex|string|项目排放指标|false|项目排放指标|
| fillTime|string||false|填表时间|
| fixedAssets|number||false|固定资产投资(万元)|
| flowAmount|number||false|流动资金(万元)|
| gas|number||false|天然气(立方米/日)|
| govNeed|string|政策需求|false|政策需求|
| id|string||false||
| imgCode|string|图形验证码|false|图形验证码|
| investmentLevel|string|投资强度|false|投资强度|
| investmentTotal|number||false|计划总投资(万元)|
| investor|string|投资方|false|投资方|
| linkman|string|联系人|false|联系人|
| mainBusiness|string|主要经营|false|主要经营|
| number|string|编号|false|编号|
| orderType|int32||false|0:关闭 1:待预约 2:已预约|
| power|number||false|电力(Kva)|
| projectManager|string|项目经理|false|项目经理|
| projectManagerMobile|string|项目经理联系电话|false|项目经理联系电话|
| projectName|string|项目名称|false|项目名称|
| radInvestment|number||false|研发投资(万元)|
| recentFinance|string|近期财务状况(包括营业收入及纳税等)|false|近期财务状况(包括营业收入及纳税等)|
| siteScheme|string|意向选址、用地/使用载体情况 (选址方案)|false|意向选址、用地/使用载体情况 (选址方案)|
| smsCode|string|手机验证码|false|手机验证码|
| status|string|项目状态|false|项目状态|
| telephone|string|手机|false|手机|
| unitCode|string|统一社会信用代码|false|统一社会信用代码|
| unitLegal|string|法人代表|false|法人代表|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| userId|string|预约用户id|false|预约用户id|
| userName|string|预约用户名称|false|预约用户名称|
| user_phone|string|创建人联系电话|false|创建人联系电话|
| water|number||false|用水(立方米/日)|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 27.10	用户保存预约对接

> POST  /investment/userSave
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| advancePlan|string|项目内容及推进计划(年度)|false|项目内容及推进计划(年度)|
| advice|string|项目引进单位评估建议|false|项目引进单位评估建议|
| appointmentTime|string||false|预约时间|
| articleId|string|文章id|false|文章id|
| articleName|string|洽谈方向、招商类型(文章名称)|false|洽谈方向、招商类型(文章名称)|
| category|string|行业|false|行业|
| companyInfo|string|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|false|注册情况、经营情况、行业排名、技术水平、知识产权和管理团队等|
| companyName|string|企业名称|false|企业名称|
| conclusion|string|管委会审定结论|false|管委会审定结论|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| duty|string|职务|false|职务|
| earlyDevelopment|string|项目前期开展情况|false|项目前期开展情况|
| economic|string|项目经济效益及社会效益预测|false|项目经济效益及社会效益预测|
| email|string|邮箱|false|邮箱|
| emissionIndex|string|项目排放指标|false|项目排放指标|
| fillTime|string||false|填表时间|
| fixedAssets|number||false|固定资产投资(万元)|
| flowAmount|number||false|流动资金(万元)|
| gas|number||false|天然气(立方米/日)|
| govNeed|string|政策需求|false|政策需求|
| id|string||false||
| imgCode|string|图形验证码|false|图形验证码|
| investmentLevel|string|投资强度|false|投资强度|
| investmentTotal|number||false|计划总投资(万元)|
| investor|string|投资方|false|投资方|
| linkman|string|联系人|false|联系人|
| mainBusiness|string|主要经营|false|主要经营|
| number|string|编号|false|编号|
| orderType|int32||false|0:关闭 1:待预约 2:已预约|
| power|number||false|电力(Kva)|
| projectManager|string|项目经理|false|项目经理|
| projectManagerMobile|string|项目经理联系电话|false|项目经理联系电话|
| projectName|string|项目名称|false|项目名称|
| radInvestment|number||false|研发投资(万元)|
| recentFinance|string|近期财务状况(包括营业收入及纳税等)|false|近期财务状况(包括营业收入及纳税等)|
| siteScheme|string|意向选址、用地/使用载体情况 (选址方案)|false|意向选址、用地/使用载体情况 (选址方案)|
| smsCode|string|手机验证码|false|手机验证码|
| status|string|项目状态|false|项目状态|
| telephone|string|手机|false|手机|
| unitCode|string|统一社会信用代码|false|统一社会信用代码|
| unitLegal|string|法人代表|false|法人代表|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| userId|string|预约用户id|false|预约用户id|
| userName|string|预约用户名称|false|预约用户名称|
| user_phone|string|创建人联系电话|false|创建人联系电话|
| water|number||false|用水(立方米/日)|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 28	数据字典接口

## 28.1	获取数据字典列表

> POST  /sys/dict/list
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|dict||dict|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ appId|string||false||
|⇥ children|array||false||
|⇥ code|string||false||
|⇥ desc|string||false||
|⇥ dictId|string||false||
|⇥ falg|string||false||
|⇥ name|string||false||
|⇥ orderNum|int32||false||
|⇥ pid|string||false||
|⇥ version|string||false||
| msg|string||false|提示信息|

##### 接口描述
> 




## 29	企业服务我的消息

## 29.1	检查用户

> POST  /information/check
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[string]||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.2	消息列表

> POST  /information/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ characterId|string|人物id|false|人物id|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string||false||
|⇥⇥ informationSource|string|消息来源|false|消息来源|
|⇥⇥ linkAddress|string|链接地址|false|链接地址|
|⇥⇥ linkText|string|链接文字|false|链接文字|
|⇥⇥ pushType|int32||false|推送类型(0:代办通知 1:普通公告2:管理员可看)|
|⇥⇥ text|string|内容|false|内容|
|⇥⇥ title|string|标题|false|标题|
|⇥⇥ type|string|消息类型|false|消息类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.3	用户列表

> POST  /information/listUser
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ account|string|账号|false|账号|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ email|string|邮箱|false|邮箱|
|⇥⇥ gender|string|性别|false|性别|
|⇥⇥ id|string||false||
|⇥⇥ name|string|昵称|false|昵称|
|⇥⇥ password|string|密码|false|密码|
|⇥⇥ path|string|头像地址|false|头像地址|
|⇥⇥ status|string|用户状态 0-正常  1-禁用|false|用户状态 0-正常  1-禁用|
|⇥⇥ statusName|string|状态名称|false|状态名称|
|⇥⇥ telephone|string|手机|false|手机|
|⇥⇥ unitCode|string|企业统一信用代码|false|企业统一信用代码|
|⇥⇥ unitLicensePath|string|营业执照图片地址|false|营业执照图片地址|
|⇥⇥ unitName|string|公司名称|false|公司名称|
|⇥⇥ updateTime|string||false|更新时间|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.4	选择所有企业用户

> GET  /information/query/allUser
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.5	根据id查询详情

> GET  /information/query/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|我的消息视图表|
|⇥ characterId|string|人物id|false|人物id|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string||false||
|⇥ informationSource|string|消息来源|false|消息来源|
|⇥ linkAddress|string|链接地址|false|链接地址|
|⇥ linkText|string|链接文字|false|链接文字|
|⇥ pushType|int32||false|推送类型(0:代办通知 1:普通公告2:管理员可看)|
|⇥ text|string|内容|false|内容|
|⇥ title|string|标题|false|标题|
|⇥ type|string|消息类型|false|消息类型|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.6	推送消息

> POST  /information/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| id|string|消息id|false|消息id|
| informationSource|string|登录后获取的teamName|false|登录后获取的teamName|
| linkAddress|string|链接地址|false|链接地址|
| linkText|string|链接文字|false|链接文字|
| pushType|int32||false|推送类型|
| text|string|内容|false|内容|
| title|string|标题|false|标题|
| userIdList|array[string]|用户id数组|false|用户id数组|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.7	消息未读数

> GET  /information/unread
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|int32||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 29.8	修改用户是否查看过|updateTime不为空表示已查看

> POST  /information/update
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 30	Basic Error Cont

## 30.1	error

> GET  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 30.2	error

> POST  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 30.3	error

> DELETE  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 30.4	error

> PUT  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 30.5	error

> PATCH  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 30.6	error

> OPTIONS  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 30.7	error

> HEAD  /error
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 31	资源载体

## 31.1	资源载体状态统计数量

> GET  /resource/countStatus
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 31.2	资源载体类别统计数量

> GET  /resource/countType
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 31.3	删除资源载体

> POST  /resource/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||资源载体Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章实体类|
|⇥ articleDescribe|string|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|false|文章描述|
|⇥ categoryFullTitle|string|首页/选址推荐/企业发展自测|false|栏目全名称|
|⇥ categoryId|string|栏目id|false|栏目id|
|⇥ categoryTitle|string|栏目名称|false|栏目名称|
|⇥ city|string|成都|false|城市|
|⇥ collectNum|int32|999|false|收藏数|
|⇥ content|string|富文本|false|文章内容|
|⇥ county|string|高新区|false|区县|
|⇥ coverImg|string|http://xxxxx|false|封面图|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ filePaths|array[string]|[]|false|上传文件列表|
|⇥ id|string|1|false|id|
|⇥ lookNum|int32|999|false|点击查看数|
|⇥ province|string|四川|false|省份|
|⇥ pushTime|string||false|发送时间|
|⇥ shareNum|int32|999|false|分项数|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|http://xxxx|false|源地址|
|⇥ status|string|1：上架，0：下架|false|上下架状态|
|⇥ title|string|xxxxxx|false|标题|
|⇥ top|int32|1|false|是否置顶|
|⇥ typeId|string|智慧招商|false|大类id|
|⇥ typeName|string|智慧招商|false|大类名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ verifyPhoneNumber|string|1300xxxxxxxx|false|审核人联系方式|
|⇥ verifyRemark|string|审核建议|false|审核建议|
|⇥ verifyStatus|string|0：待审核；1：通过；-1：不通过|false|审核时间|
|⇥ verifyTime|string||false|审核时间|
|⇥ verifyUser|string|zhangsna|false|审核人id|
|⇥ verifyUsername|string|zhangsan|false|审核人姓名|
| msg|string||false|提示信息|

##### 接口描述
> 




## 31.4	根据id查询资源载体详情

> GET  /resource/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询资源载体详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|载体资源|
|⇥ addValue|number||false|地均增加值(元)(保留2位)|
|⇥ address|string|载体位置(50)|false|载体位置(50)|
|⇥ area|string|载体所在区划(50)|false|载体所在区划(50)|
|⇥ contractPrice|number||false|合同总地价/合同成交价(元)(保留2位)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ entrants|string|入驻商家(50)|false|入驻商家(50)|
|⇥ floorSpace|string|占地面积(20)|false|占地面积(20)|
|⇥ floorYear|string|建筑年份(10)|false|建筑年份(10)|
|⇥ floorage|string|建筑面积(20)|false|建筑面积(20)|
|⇥ id|string||false||
|⇥ industryType|string|产业类型|false|产业类型|
|⇥ industryTypeCode|string|产业类型code(50)|false|产业类型code(50)|
|⇥ landArea|string|土地面积(20)|false|土地面积(20)|
|⇥ landUse|string|土地用途(300)|false|土地用途(300)|
|⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥ longitude|string|经度(20)|false|经度(20)|
|⇥ name|string|载体名称(长度50)|false|载体名称(长度50)|
|⇥ outputValue|number||false|地均产值(元)(保留2位)|
|⇥ parcelNo|string|宗地号(50)|false|宗地号(50)|
|⇥ receivable|number||false|地均应收(元）(保留2位)|
|⇥ remark|string|备注(500)|false|备注(500)|
|⇥ status|string|载体状态(数据字典标识)|false|载体状态(数据字典标识)|
|⇥ statusName|string|载体状态名称(数据字典标识)|false|载体状态名称(数据字典标识名称)|
|⇥ taxRevenue|number||false|地均税收(元)(保留2位)|
|⇥ transferMode|string|出让方式(50)|false|出让方式(50)|
|⇥ type|string|载体类别 0-厂房 1-办公  2-土地|false|载体类别 0-厂房 1-办公  2-土地|
|⇥ typeName|string|载体类别名称(10)|false|载体类别名称|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 31.5	资源载体列表

> POST  /resource/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ addValue|number||false|地均增加值(元)(保留2位)|
|⇥⇥ address|string|载体位置(50)|false|载体位置(50)|
|⇥⇥ area|string|载体所在区划(50)|false|载体所在区划(50)|
|⇥⇥ contractPrice|number||false|合同总地价/合同成交价(元)(保留2位)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ entrants|string|入驻商家(50)|false|入驻商家(50)|
|⇥⇥ floorSpace|string|占地面积(20)|false|占地面积(20)|
|⇥⇥ floorYear|string|建筑年份(10)|false|建筑年份(10)|
|⇥⇥ floorage|string|建筑面积(20)|false|建筑面积(20)|
|⇥⇥ id|string||false||
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code(50)|false|产业类型code(50)|
|⇥⇥ landArea|string|土地面积(20)|false|土地面积(20)|
|⇥⇥ landUse|string|土地用途(300)|false|土地用途(300)|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|载体名称(长度50)|false|载体名称(长度50)|
|⇥⇥ outputValue|number||false|地均产值(元)(保留2位)|
|⇥⇥ parcelNo|string|宗地号(50)|false|宗地号(50)|
|⇥⇥ receivable|number||false|地均应收(元）(保留2位)|
|⇥⇥ remark|string|备注(500)|false|备注(500)|
|⇥⇥ status|string|载体状态(数据字典标识)|false|载体状态(数据字典标识)|
|⇥⇥ statusName|string|载体状态名称(数据字典标识)|false|载体状态名称(数据字典标识名称)|
|⇥⇥ taxRevenue|number||false|地均税收(元)(保留2位)|
|⇥⇥ transferMode|string|出让方式(50)|false|出让方式(50)|
|⇥⇥ type|string|载体类别 0-厂房 1-办公  2-土地|false|载体类别 0-厂房 1-办公  2-土地|
|⇥⇥ typeName|string|载体类别名称(10)|false|载体类别名称|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 31.6	新增

> POST  /resource/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| addValue|number||false|地均增加值(元)(保留2位)|
| address|string|载体位置(50)|false|载体位置(50)|
| area|string|载体所在区划(50)|false|载体所在区划(50)|
| contractPrice|number||false|合同总地价/合同成交价(元)(保留2位)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| entrants|string|入驻商家(50)|false|入驻商家(50)|
| floorSpace|string|占地面积(20)|false|占地面积(20)|
| floorYear|string|建筑年份(10)|false|建筑年份(10)|
| floorage|string|建筑面积(20)|false|建筑面积(20)|
| id|string||false||
| industryType|string|产业类型|false|产业类型|
| industryTypeCode|string|产业类型code(50)|false|产业类型code(50)|
| landArea|string|土地面积(20)|false|土地面积(20)|
| landUse|string|土地用途(300)|false|土地用途(300)|
| latitude|string|纬度(20)|false|纬度(20)|
| longitude|string|经度(20)|false|经度(20)|
| name|string|载体名称(长度50)|false|载体名称(长度50)|
| outputValue|number||false|地均产值(元)(保留2位)|
| parcelNo|string|宗地号(50)|false|宗地号(50)|
| receivable|number||false|地均应收(元）(保留2位)|
| remark|string|备注(500)|false|备注(500)|
| status|string|载体状态(数据字典标识)|false|载体状态(数据字典标识)|
| statusName|string|载体状态名称(数据字典标识)|false|载体状态名称(数据字典标识名称)|
| taxRevenue|number||false|地均税收(元)(保留2位)|
| transferMode|string|出让方式(50)|false|出让方式(50)|
| type|string|载体类别 0-厂房 1-办公  2-土地|false|载体类别 0-厂房 1-办公  2-土地|
| typeName|string|载体类别名称(10)|false|载体类别名称|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 31.7	修改

> POST  /resource/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| addValue|number||false|地均增加值(元)(保留2位)|
| address|string|载体位置(50)|false|载体位置(50)|
| area|string|载体所在区划(50)|false|载体所在区划(50)|
| contractPrice|number||false|合同总地价/合同成交价(元)(保留2位)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| entrants|string|入驻商家(50)|false|入驻商家(50)|
| floorSpace|string|占地面积(20)|false|占地面积(20)|
| floorYear|string|建筑年份(10)|false|建筑年份(10)|
| floorage|string|建筑面积(20)|false|建筑面积(20)|
| id|string||false||
| industryType|string|产业类型|false|产业类型|
| industryTypeCode|string|产业类型code(50)|false|产业类型code(50)|
| landArea|string|土地面积(20)|false|土地面积(20)|
| landUse|string|土地用途(300)|false|土地用途(300)|
| latitude|string|纬度(20)|false|纬度(20)|
| longitude|string|经度(20)|false|经度(20)|
| name|string|载体名称(长度50)|false|载体名称(长度50)|
| outputValue|number||false|地均产值(元)(保留2位)|
| parcelNo|string|宗地号(50)|false|宗地号(50)|
| receivable|number||false|地均应收(元）(保留2位)|
| remark|string|备注(500)|false|备注(500)|
| status|string|载体状态(数据字典标识)|false|载体状态(数据字典标识)|
| statusName|string|载体状态名称(数据字典标识)|false|载体状态名称(数据字典标识名称)|
| taxRevenue|number||false|地均税收(元)(保留2位)|
| transferMode|string|出让方式(50)|false|出让方式(50)|
| type|string|载体类别 0-厂房 1-办公  2-土地|false|载体类别 0-厂房 1-办公  2-土地|
| typeName|string|载体类别名称(10)|false|载体类别名称|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 32	通用菜单信息

## 32.1	查询菜单列表

> POST  /menu/list
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 32.2	根据用户id查询菜单列表

> POST  /menu/query
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 33	企业查询企查查数据接口

## 33.1	获取企业详细信息

> POST  /company/api/getInfo
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||creditCode|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 33.2	获取企业详细信息

> POST  /company/api/getResultData
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|taskId||taskId|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 33.3	导入招商企业excel

> POST  /company/api/importEnterpriseConcernExcel
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| file|string||false|上传文件|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 33.4	初始化企业信息到企查查

> GET  /company/api/initEnterprise/{pageNo}/{pageSize}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|pageNo||pageNo||pageSize||pageSize|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ establishTime|int32||false|成立年限|
|⇥⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ isFollow|boolean|false|false|是否关注|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ position|string|职位(10)|false|职位(10)|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 33.5	产值趋势

> POST  /company/api/outputTrend
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||企业信用代码|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 33.6	大数据智能推荐Top10企业接口

> POST  /company/api/top10
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ address|string|地址(200)|false|地址(200)|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥ establishDate|string||false|成立日期|
|⇥ establishTime|int32||false|成立年限|
|⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥ grade|string|评级|false|评级|
|⇥ id|string||false||
|⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥ industryType|string|产业类型|false|产业类型|
|⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥ intelligence|int32||false|情报|
|⇥ isFollow|boolean|false|false|是否关注|
|⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥ longitude|string|经度(20)|false|经度(20)|
|⇥ name|string|公司名称|false|公司名称|
|⇥ otherChoice|string|其他选择|false|其他选择|
|⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥ position|string|职位(10)|false|职位(10)|
|⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥ province|string|省份|false|省份|
|⇥ ranking|int32||false|排名|
|⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥ revenue|int32||false|营收 (万元)|
|⇥ score|number||false|评分|
|⇥ staffNum|int32||false|员工数量|
|⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥ taxRevenue|int32||false|税收(万元)|
|⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥ type|int32||false|是否区内|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
| msg|string||false|提示信息|

##### 接口描述
> 




## 34	我关注的企业

## 34.1	取消/添加关注

> POST  /investment/follow/cancelOrAdd
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|follow||状态/0:关注1:取消关注|
|id||企业id|
|userId||用户id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 34.2	我关注的企业列表

> POST  /investment/follow/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ establishTime|int32||false|成立年限|
|⇥⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ isFollow|boolean|false|false|是否关注|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ position|string|职位(10)|false|职位(10)|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 34.3	查询情报

> GET  /investment/follow/information/{creditCode}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||信用代码|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 34.4	企业列表

> POST  /investment/follow/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
|⇥⇥ enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ establishTime|int32||false|成立年限|
|⇥⇥ financing|string|融资情况10)|false|融资情况(10)|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ isFollow|boolean|false|false|是否关注|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ linkMan|string|联系人(10)|false|联系人(10)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ position|string|职位(10)|false|职位(10)|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ telephone|string|联系电话(20)|false|联系电话(20)|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 34.5	查询详情

> GET  /investment/follow/query/{creditCode}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||社会信用代码|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 34.6	新增

> POST  /investment/follow/save
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| address|string|地址(200)|false|地址(200)|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| creditCode|string|企业信用代码|false|企业信用代码|
| deleteFlag|int32|0|false|删除标记|
| dictId|string|多个数据字典标识以逗号分割|false|多个数据字典标识以逗号分割|
| enterpriseDirectory|string|企业名录50)|false|企业名录(50)|
| enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
| enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
| enterpriseTypeName|string|企业类型20)|false|企业类型(20)|
| establishDate|string||false|成立日期|
| establishTime|int32||false|成立年限|
| financing|string|融资情况10)|false|融资情况(10)|
| grade|string|评级|false|评级|
| id|string||false||
| industrialChainStage|string|产业链阶段|false|产业链阶段|
| industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
| industryType|string|产业类型|false|产业类型|
| industryTypeCode|string|产业类型code|false|产业类型code|
| institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
| institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
| intelligence|int32||false|情报|
| isFollow|boolean|false|false|是否关注|
| latitude|string|纬度(20)|false|纬度(20)|
| linkMan|string|联系人(10)|false|联系人(10)|
| longitude|string|经度(20)|false|经度(20)|
| name|string|公司名称|false|公司名称|
| otherChoice|string|其他选择|false|其他选择|
| otherChoiceCode|string|其他选择code|false|其他选择code|
| position|string|职位(10)|false|职位(10)|
| processStage|string|产业链工艺阶段|false|产业链工艺阶段|
| processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
| productType|string|产品类型(100)|false|产品类型(100)|
| province|string|省份|false|省份|
| ranking|int32||false|排名|
| recommend|string|是否智能推荐 0-否  1-是|false|是否智能推荐 0-否  1-是|
| revenue|int32||false|营收 (万元)|
| score|number||false|评分|
| staffNum|int32||false|员工数量|
| tagName|string|多个数据字名称识以逗号分割|false|多个数据字名称识以逗号分割|
| taxRevenue|int32||false|税收(万元)|
| telephone|string|联系电话(20)|false|联系电话(20)|
| type|int32||false|是否区内|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
| whiteList|string|是否白名单(1)|false|是否白名单(1)|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 35	园区动态接口

## 35.1	地区列表

> POST  /newThings/areaList
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|parentId||上级地区id，不传为0，默认为0|
|parentName||parentName|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ id|int32|1|false|id|
|⇥ level|int32||false||
|⇥ name|string||false||
|⇥ parentId|int32||false||
|⇥ parentName|string||false||
| msg|string||false|提示信息|

##### 接口描述
> 




## 35.2	动态详情

> POST  /newThings/detail
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|园区动态实体类|
|⇥ category|string|电子产业|false|产业类型|
|⇥ city|string|成都市|false|城市|
|⇥ content|string|富文本|false|内容|
|⇥ contentDescribe|string|内容描述|false|描述|
|⇥ county|string|高新区|false|地区|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string|1|false|id|
|⇥ imgUrl|string|http://|false|封面图片|
|⇥ industry|string|高新技术|false|产业集群|
|⇥ informationTime|string||false|动态时间|
|⇥ product|string|所属园区|false|所属园区|
|⇥ productInfo|string|开发区|false|园区类型|
|⇥ province|string|四川|false|省份|
|⇥ source|string|xxx|false|来源|
|⇥ sourceUrl|string|https://123|false|源地址|
|⇥ title|string|标题|false|标题|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 35.3	文章列表

> POST  /newThings/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ category|string|电子产业|false|产业类型|
|⇥⇥ city|string|成都市|false|城市|
|⇥⇥ content|string|富文本|false|内容|
|⇥⇥ contentDescribe|string|内容描述|false|描述|
|⇥⇥ county|string|高新区|false|地区|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ imgUrl|string|http://|false|封面图片|
|⇥⇥ industry|string|高新技术|false|产业集群|
|⇥⇥ informationTime|string||false|动态时间|
|⇥⇥ product|string|所属园区|false|所属园区|
|⇥⇥ productInfo|string|开发区|false|园区类型|
|⇥⇥ province|string|四川|false|省份|
|⇥⇥ source|string|xxx|false|来源|
|⇥⇥ sourceUrl|string|https://123|false|源地址|
|⇥⇥ title|string|标题|false|标题|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36	运行监测接口

## 36.1	企业纳税金额排名

> POST  /monitoring/addedTaxRank
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.2	企业分布列表

> POST  /monitoring/distribution/{order}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|order||order|
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ addedTax|number||false|应交增值税|
|⇥⇥ address|string|地址(200)|false|地址(200)|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string|企业信用代码|false|企业信用代码|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ enterpriseLabel|string|区内龙头企业上下游标签|false|区内龙头企业上下游标签|
|⇥⇥ enterpriseLabelCode|string|区内龙头企业上下游标签code|false|区内龙头企业上下游标签code|
|⇥⇥ establishDate|string||false|成立日期|
|⇥⇥ grade|string|评级|false|评级|
|⇥⇥ id|string||false||
|⇥⇥ income|number||false|营业收入|
|⇥⇥ industrialChainStage|string|产业链阶段|false|产业链阶段|
|⇥⇥ industrialChainStageCode|string|产业链阶段code|false|产业链阶段code|
|⇥⇥ industryType|string|产业类型|false|产业类型|
|⇥⇥ industryTypeCode|string|产业类型code|false|产业类型code|
|⇥⇥ institutionalInvestment|string|获得投资机构投资|false|获得投资机构投资|
|⇥⇥ institutionalInvestmentCode|string|获得投资机构投资code|false|获得投资机构投资code|
|⇥⇥ intelligence|int32||false|情报|
|⇥⇥ latitude|string|纬度(20)|false|纬度(20)|
|⇥⇥ longitude|string|经度(20)|false|经度(20)|
|⇥⇥ name|string|公司名称|false|公司名称|
|⇥⇥ otherChoice|string|其他选择|false|其他选择|
|⇥⇥ otherChoiceCode|string|其他选择code|false|其他选择code|
|⇥⇥ processStage|string|产业链工艺阶段|false|产业链工艺阶段|
|⇥⇥ processStageCode|string|产业链工艺阶段code|false|产业链工艺阶段code|
|⇥⇥ productType|string|产品类型(100)|false|产品类型(100)|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ ranking|int32||false|排名|
|⇥⇥ revenue|int32||false|营收 (万元)|
|⇥⇥ score|number||false|评分|
|⇥⇥ staffNum|int32||false|员工数量|
|⇥⇥ taxRevenue|int32||false|税收(万元)|
|⇥⇥ totalOutputValue|number||false|累积产值|
|⇥⇥ type|int32||false|是否区内|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ whiteList|string|是否白名单(1)|false|是否白名单(1)|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.3	获取最新一期的时间

> GET  /monitoring/getLastTime
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.4	营业收入分布

> POST  /monitoring/incomeValueDist
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ name|string|电子信息|false|名称|
|⇥ value|object|[]|false|分类值|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.5	工业总产值分布

> POST  /monitoring/outputValueDist
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|array[object]||false|返回结果|
|⇥ name|string|电子信息|false|名称|
|⇥ value|object|[]|false|分类值|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.6	企业总产值排名

> POST  /monitoring/outputValueRank
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.7	工业总产值态势

> POST  /monitoring/outputValueSituatio
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 36.8	数据概览

> POST  /monitoring/overview
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| caliber|int32||false|统计口径|
| creditCode|string|123456789|false|企业信用代码|
| endTime|string|2021-02|false|范围结束时间|
| sort|int32||false|排序方式|
| startTime|string|2021-01|false|范围开始时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 37	企业服务常见问题模块接口

## 37.1	删除FAQ

> POST  /faq/delete
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||文章Id，以‘-’分隔|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章收藏类|
|⇥ code|string|1|false|编号|
|⇥ content|string|富文本|false|回答内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string|1|false|id|
|⇥ status|string|1|false|状态：0：下架，1：上架|
|⇥ title|string|xxxxxx？|false|问题|
|⇥ top|int32|1|false|是否置顶：0：否；1：是|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 37.2	问题详情

> POST  /faq/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||文章Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|文章收藏类|
|⇥ code|string|1|false|编号|
|⇥ content|string|富文本|false|回答内容|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string|1|false|id|
|⇥ status|string|1|false|状态：0：下架，1：上架|
|⇥ title|string|xxxxxx？|false|问题|
|⇥ top|int32|1|false|是否置顶：0：否；1：是|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 37.3	FAQ上下架

> POST  /faq/editStatus
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|ids||文章id，以‘-’分隔|
|status||0：下架；1：上架|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 37.4	FAQ列表

> POST  /faq/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ code|string|1|false|编号|
|⇥⇥ content|string|富文本|false|回答内容|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ status|string|1|false|状态：0：下架，1：上架|
|⇥⇥ title|string|xxxxxx？|false|问题|
|⇥⇥ top|int32|1|false|是否置顶：0：否；1：是|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 37.5	新增or修改文章

> POST  /faq/saveOrEdit
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string|1|false|编号|
| content|string|富文本|false|回答内容|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| deleteFlag|int32|0|false|删除标记|
| id|string|1|false|id|
| status|string|1|false|状态：0：下架，1：上架|
| title|string|xxxxxx？|false|问题|
| top|int32|1|false|是否置顶：0：否；1：是|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 37.6	FAQ列表

> POST  /web/faq/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ code|string|1|false|编号|
|⇥⇥ content|string|富文本|false|回答内容|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ status|string|1|false|状态：0：下架，1：上架|
|⇥⇥ title|string|xxxxxx？|false|问题|
|⇥⇥ top|int32|1|false|是否置顶：0：否；1：是|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 38	用户政策申报

## 38.1	政策申报列表

> POST  /examine/web/getList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ applyEmail|string|申请人邮箱|false|申请人邮箱|
|⇥⇥ applyPhone|string|申请人电话|false|申请人电话|
|⇥⇥ applyUser|string|申请人|false|申请人|
|⇥⇥ classifyCode|string|政策分类code|false|政策分类code|
|⇥⇥ classifyName|string|政策分类|false|政策分类|
|⇥⇥ collectNum|int32||false|查看数|
|⇥⇥ content|string|政策详情|false|政策详情|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ declareDate|string||false|申报截止日期|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ displayLocation|int32||false|政策展示位置(0:全部 1:招商 2:企业 3:双创)|
|⇥⇥ id|string||false||
|⇥⇥ isFollow|boolean|false|false|是否收藏|
|⇥⇥ lookNum|int32||false|阅读数|
|⇥⇥ name|string|政策名称|false|政策名称|
|⇥⇥ needDeclare|int32||false|是否需要申报(0:是1:否)|
|⇥⇥ newsSources|string|新闻来源|false|新闻来源|
|⇥⇥ numberInstitutions|string|机构规模人数|false|机构规模人数|
|⇥⇥ remarks|string|备注|false|备注|
|⇥⇥ service|string|服务对象|false|服务对象|
|⇥⇥ serviceCode|string|服务对象code|false|服务对象code|
|⇥⇥ shareNum|int32||false|收藏数|
|⇥⇥ source|string|数据来源|false|数据来源|
|⇥⇥ status|string|上下架状态|false|上下架状态|
|⇥⇥ summary|string|摘要|false|摘要|
|⇥⇥ type|string|政策展示类型|false|政策展示类型|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥⇥ verifyStatus|string|审核状态|false|审核状态|
|⇥⇥ verifyTime|string||false|审核时间|
|⇥⇥ verifyUser|string|审核人|false|审核人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 38.2	用户政策申报详情

> GET  /examine/web/query/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||政策id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 38.3	用户政策申报撤销

> POST  /examine/web/revoke
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||政策id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 38.4	用户政策申报修改

> POST  /examine/web/update
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| applyEmail|string|申请人邮箱|false|申请人邮箱|
| applyPhone|string|申请人电话|false|申请人电话|
| applyUser|string|申请人|false|申请人|
| id|string||false||
| name|string|政策名称|false|政策名称|
| remarks|string|备注|false|备注|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 39	部门模块接口

## 39.1	删除用户

> DELETE  /example/delete/{stId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|stId||用户Id|
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 39.2	查询一个用户详细信息

> GET  /example/getDetail/{stId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|stId||用户Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| createTime|string||false|创建时间|
| creatorId|string|qwewqewqeqwe|false|创建人id|
| creatorName|string|LiSi|false|创建人名称|
| stAddress|string|上海市|false|用户地址|
| stId|string|qwertyuio|false|用户id|
| stIdCard|string|123456|false|用户身份证号|
| stName|string|ZhangSan|false|用户名|
| status|int32|1|false|状态 0 表示删除, 1表示可操作|
| updateTime|string||false|更新时间，默认是当前时间|

##### 接口描述
> 




## 39.3	查询所有用户

> GET  /example/getList
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 39.4	新增or修改一个用户

> POST  /example/saveOrEdit/{stId}/{stName}/{stIdCard}/{stAddress}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|stAddress||用户地址||stId||用户id||stIdCard||用户身份证号码||stName||用户名|
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 39.5	模拟用户登录

> DELETE  /example/testLogin/{userId}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|userId||用户Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40	企业洞察-经济运行简报（月报）

## 40.1	根据id统计应交增值税

> GET  /insight/month/addedTax/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id统计应交增值税|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.2	根据id查询经济运行简报详情

> GET  /insight/month/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id查询经济运行简报详情|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|企业洞察-经济运行简报实体类（月报）|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string||false||
|⇥ info|object||false||
|⇥ name|string|简报名称|false|简报名称|
|⇥ time|string||false|创建时间|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.3	生成对应的简报

> POST  /insight/month/getData
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|time||时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.4	近12个月产值，产值同比增长率统计图

> POST  /insight/month/getTwelveOutputData/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.5	近12个月增加值，增加值同比增长率统计图

> POST  /insight/month/getTwelveOutputValueAddValueData/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.6	产值TOP10企业

> POST  /insight/month/groupByOutputValue/list/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.7	应交增值税TOP10企业

> POST  /insight/month/groupByaddedTax/list/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.8	营业利润TOP10企业

> POST  /insight/month/groupByprofitList/list/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.9	根据id统计营业收入

> GET  /insight/month/income/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id统计营业收入|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.10	经济运行简报列表

> POST  /insight/month/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string||false||
|⇥⇥ info|object||false||
|⇥⇥ name|string|简报名称|false|简报名称|
|⇥⇥ time|string||false|创建时间|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.11	根据id统计产值

> GET  /insight/month/outputValue/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id统计产值|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.12	根据id统计产值增加值

> GET  /insight/month/outputValueAdd/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id统计产值增加值|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.13	根据id统计平均从业人数

> GET  /insight/month/peopleNumCount/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id统计平均从业人数|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 40.14	根据id统计利润

> GET  /insight/month/profit/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||根据id统计利润|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41	企业统计数据接口

## 41.1	删除

> POST  /torchIndex/delete/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.2	详情

> POST  /torchIndex/detail/{id}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|id||Id|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|企业火炬指标|
|⇥ addedTax|number||false|应交增值税|
|⇥ addedTaxSame|number||false|应交增值税同期|
|⇥ address|string||false|地址|
|⇥ batch|string||false|统计批次|
|⇥ caliber|int32||false|统计口径|
|⇥ companyName|string||false|企业名称|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string||false|企业信用代码|
|⇥ cumulativePriceIndex|number||false|累积价格指数|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string|1|false|id|
|⇥ importTime|string||false|导入时间|
|⇥ income|number||false|营业收入|
|⇥ incomeSame|number||false|营业收入同期|
|⇥ incomeSameAddValue|number||false|营业同期增幅|
|⇥ industrialFunZone|string||false|产业功能区|
|⇥ industryAddedRate|number||false|行业增长率|
|⇥ industryCode|string||false|行业代码|
|⇥ industryTypeName|string||false|产业类型名称|
|⇥ middleClassCode|string||false|中类代码|
|⇥ name|string||false|统计名称|
|⇥ outputValue|number||false|当期产值|
|⇥ outputValueAdd|number||false|当月产值增幅|
|⇥ outputValueAddGrowth|number||false|当月增加值增幅|
|⇥ outputValueAddValue|number||false|当月产值增加值|
|⇥ outputValueSame|number||false|当月产值同期|
|⇥ outputValueSameAddValue|number||false|当月同期增加值|
|⇥ peopleNum|int32||false|平均从业人数|
|⇥ peopleNumSame|int32||false|平均从业人数同期|
|⇥ productType|string||false|产品类型|
|⇥ profit|number||false|利润总额|
|⇥ profitSame|number||false|利润同期|
|⇥ responsible|string||false|责任部门|
|⇥ staDate|string||false|统计时间|
|⇥ totalOutputValue|number||false|累积产值|
|⇥ totalOutputValueAdd|number||false|累积产值增幅|
|⇥ totalOutputValueAddGrowth|number||false|累积增加值增幅|
|⇥ totalOutputValueAddReduce|number||false|累积产值下滑|
|⇥ totalOutputValueAddValue|number||false|累积产值增加值|
|⇥ totalOutputValueSame|number||false|累积产值同期|
|⇥ totalOutputValueSameAddValue|number||false|累积同期增加值|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.3	详情

> POST  /torchIndex/findByCreditCode/{creditCode}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|creditCode||creditCode|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|企业火炬指标|
|⇥ addedTax|number||false|应交增值税|
|⇥ addedTaxSame|number||false|应交增值税同期|
|⇥ address|string||false|地址|
|⇥ batch|string||false|统计批次|
|⇥ caliber|int32||false|统计口径|
|⇥ companyName|string||false|企业名称|
|⇥ createTime|string||false|创建时间|
|⇥ createUser|string|ZhangSan|false|创建人|
|⇥ creditCode|string||false|企业信用代码|
|⇥ cumulativePriceIndex|number||false|累积价格指数|
|⇥ deleteFlag|int32|0|false|删除标记|
|⇥ id|string|1|false|id|
|⇥ importTime|string||false|导入时间|
|⇥ income|number||false|营业收入|
|⇥ incomeSame|number||false|营业收入同期|
|⇥ incomeSameAddValue|number||false|营业同期增幅|
|⇥ industrialFunZone|string||false|产业功能区|
|⇥ industryAddedRate|number||false|行业增长率|
|⇥ industryCode|string||false|行业代码|
|⇥ industryTypeName|string||false|产业类型名称|
|⇥ middleClassCode|string||false|中类代码|
|⇥ name|string||false|统计名称|
|⇥ outputValue|number||false|当期产值|
|⇥ outputValueAdd|number||false|当月产值增幅|
|⇥ outputValueAddGrowth|number||false|当月增加值增幅|
|⇥ outputValueAddValue|number||false|当月产值增加值|
|⇥ outputValueSame|number||false|当月产值同期|
|⇥ outputValueSameAddValue|number||false|当月同期增加值|
|⇥ peopleNum|int32||false|平均从业人数|
|⇥ peopleNumSame|int32||false|平均从业人数同期|
|⇥ productType|string||false|产品类型|
|⇥ profit|number||false|利润总额|
|⇥ profitSame|number||false|利润同期|
|⇥ responsible|string||false|责任部门|
|⇥ staDate|string||false|统计时间|
|⇥ totalOutputValue|number||false|累积产值|
|⇥ totalOutputValueAdd|number||false|累积产值增幅|
|⇥ totalOutputValueAddGrowth|number||false|累积增加值增幅|
|⇥ totalOutputValueAddReduce|number||false|累积产值下滑|
|⇥ totalOutputValueAddValue|number||false|累积产值增加值|
|⇥ totalOutputValueSame|number||false|累积产值同期|
|⇥ totalOutputValueSameAddValue|number||false|累积同期增加值|
|⇥ updateTime|string||false|更新时间|
|⇥ updateUser|string|ZhangSan|false|更新人|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.4	excel导入

> POST  /torchIndex/importData
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|name||统计名称|
|statBatch||统计批次|
|statDate||统计数据期间|
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| file|string||false|上传文件|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.5	判断某个月经济运行简报是否存在

> POST  /torchIndex/isExist/{staDate}
### 地址参数（Path Variable）
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|staDate||staDate|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.6	数据列表

> POST  /torchIndex/list
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ addedTax|number||false|应交增值税|
|⇥⇥ addedTaxSame|number||false|应交增值税同期|
|⇥⇥ address|string||false|地址|
|⇥⇥ batch|string||false|统计批次|
|⇥⇥ caliber|int32||false|统计口径|
|⇥⇥ companyName|string||false|企业名称|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string||false|企业信用代码|
|⇥⇥ cumulativePriceIndex|number||false|累积价格指数|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ importTime|string||false|导入时间|
|⇥⇥ income|number||false|营业收入|
|⇥⇥ incomeSame|number||false|营业收入同期|
|⇥⇥ incomeSameAddValue|number||false|营业同期增幅|
|⇥⇥ industrialFunZone|string||false|产业功能区|
|⇥⇥ industryAddedRate|number||false|行业增长率|
|⇥⇥ industryCode|string||false|行业代码|
|⇥⇥ industryTypeName|string||false|产业类型名称|
|⇥⇥ middleClassCode|string||false|中类代码|
|⇥⇥ name|string||false|统计名称|
|⇥⇥ outputValue|number||false|当期产值|
|⇥⇥ outputValueAdd|number||false|当月产值增幅|
|⇥⇥ outputValueAddGrowth|number||false|当月增加值增幅|
|⇥⇥ outputValueAddValue|number||false|当月产值增加值|
|⇥⇥ outputValueSame|number||false|当月产值同期|
|⇥⇥ outputValueSameAddValue|number||false|当月同期增加值|
|⇥⇥ peopleNum|int32||false|平均从业人数|
|⇥⇥ peopleNumSame|int32||false|平均从业人数同期|
|⇥⇥ productType|string||false|产品类型|
|⇥⇥ profit|number||false|利润总额|
|⇥⇥ profitSame|number||false|利润同期|
|⇥⇥ responsible|string||false|责任部门|
|⇥⇥ staDate|string||false|统计时间|
|⇥⇥ totalOutputValue|number||false|累积产值|
|⇥⇥ totalOutputValueAdd|number||false|累积产值增幅|
|⇥⇥ totalOutputValueAddGrowth|number||false|累积增加值增幅|
|⇥⇥ totalOutputValueAddReduce|number||false|累积产值下滑|
|⇥⇥ totalOutputValueAddValue|number||false|累积产值增加值|
|⇥⇥ totalOutputValueSame|number||false|累积产值同期|
|⇥⇥ totalOutputValueSameAddValue|number||false|累积同期增加值|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.7	数据列表

> POST  /torchIndex/list_new
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| companyName|string|企业名称|false|企业名称|
| name|string|统计名称|false|统计名称|
| pageNo|int32||false|页码|
| pageSize|int32||false|条数|
| staDate|string|统计时间|false|统计时间|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ addedTax|number||false|应交增值税|
|⇥⇥ addedTaxSame|number||false|应交增值税同期|
|⇥⇥ address|string||false|地址|
|⇥⇥ batch|string||false|统计批次|
|⇥⇥ caliber|int32||false|统计口径|
|⇥⇥ companyName|string||false|企业名称|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ creditCode|string||false|企业信用代码|
|⇥⇥ cumulativePriceIndex|number||false|累积价格指数|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ id|string|1|false|id|
|⇥⇥ importTime|string||false|导入时间|
|⇥⇥ income|number||false|营业收入|
|⇥⇥ incomeSame|number||false|营业收入同期|
|⇥⇥ incomeSameAddValue|number||false|营业同期增幅|
|⇥⇥ industrialFunZone|string||false|产业功能区|
|⇥⇥ industryAddedRate|number||false|行业增长率|
|⇥⇥ industryCode|string||false|行业代码|
|⇥⇥ industryTypeName|string||false|产业类型名称|
|⇥⇥ middleClassCode|string||false|中类代码|
|⇥⇥ name|string||false|统计名称|
|⇥⇥ outputValue|number||false|当期产值|
|⇥⇥ outputValueAdd|number||false|当月产值增幅|
|⇥⇥ outputValueAddGrowth|number||false|当月增加值增幅|
|⇥⇥ outputValueAddValue|number||false|当月产值增加值|
|⇥⇥ outputValueSame|number||false|当月产值同期|
|⇥⇥ outputValueSameAddValue|number||false|当月同期增加值|
|⇥⇥ peopleNum|int32||false|平均从业人数|
|⇥⇥ peopleNumSame|int32||false|平均从业人数同期|
|⇥⇥ productType|string||false|产品类型|
|⇥⇥ profit|number||false|利润总额|
|⇥⇥ profitSame|number||false|利润同期|
|⇥⇥ responsible|string||false|责任部门|
|⇥⇥ staDate|string||false|统计时间|
|⇥⇥ totalOutputValue|number||false|累积产值|
|⇥⇥ totalOutputValueAdd|number||false|累积产值增幅|
|⇥⇥ totalOutputValueAddGrowth|number||false|累积增加值增幅|
|⇥⇥ totalOutputValueAddReduce|number||false|累积产值下滑|
|⇥⇥ totalOutputValueAddValue|number||false|累积产值增加值|
|⇥⇥ totalOutputValueSame|number||false|累积产值同期|
|⇥⇥ totalOutputValueSameAddValue|number||false|累积同期增加值|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 41.8	新增or修改

> POST  /torchIndex/saveOrEdit
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| addedTax|number||false|应交增值税|
| addedTaxSame|number||false|应交增值税同期|
| address|string||false|地址|
| batch|string||false|统计批次|
| caliber|int32||false|统计口径|
| companyName|string||false|企业名称|
| createTime|string||false|创建时间|
| createUser|string|ZhangSan|false|创建人|
| creditCode|string||false|企业信用代码|
| cumulativePriceIndex|number||false|累积价格指数|
| deleteFlag|int32|0|false|删除标记|
| id|string|1|false|id|
| importTime|string||false|导入时间|
| income|number||false|营业收入|
| incomeSame|number||false|营业收入同期|
| incomeSameAddValue|number||false|营业同期增幅|
| industrialFunZone|string||false|产业功能区|
| industryAddedRate|number||false|行业增长率|
| industryCode|string||false|行业代码|
| industryTypeName|string||false|产业类型名称|
| middleClassCode|string||false|中类代码|
| name|string||false|统计名称|
| outputValue|number||false|当期产值|
| outputValueAdd|number||false|当月产值增幅|
| outputValueAddGrowth|number||false|当月增加值增幅|
| outputValueAddValue|number||false|当月产值增加值|
| outputValueSame|number||false|当月产值同期|
| outputValueSameAddValue|number||false|当月同期增加值|
| peopleNum|int32||false|平均从业人数|
| peopleNumSame|int32||false|平均从业人数同期|
| productType|string||false|产品类型|
| profit|number||false|利润总额|
| profitSame|number||false|利润同期|
| responsible|string||false|责任部门|
| staDate|string||false|统计时间|
| totalOutputValue|number||false|累积产值|
| totalOutputValueAdd|number||false|累积产值增幅|
| totalOutputValueAddGrowth|number||false|累积增加值增幅|
| totalOutputValueAddReduce|number||false|累积产值下滑|
| totalOutputValueAddValue|number||false|累积产值增加值|
| totalOutputValueSame|number||false|累积产值同期|
| totalOutputValueSameAddValue|number||false|累积同期增加值|
| updateTime|string||false|更新时间|
| updateUser|string|ZhangSan|false|更新人|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 42	operation-handler

## 42.1	handle

> GET  /actuator/archaius
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.2	handle

> GET  /actuator/auditevents
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.3	handle

> GET  /actuator/beans
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.4	handle

> GET  /actuator/caches
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.5	handle

> DELETE  /actuator/caches
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.6	handle

> GET  /actuator/caches/{cache}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.7	handle

> DELETE  /actuator/caches/{cache}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.8	handle

> GET  /actuator/conditions
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.9	handle

> GET  /actuator/configprops
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.10	handle

> GET  /actuator/env
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.11	handle

> POST  /actuator/env
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.12	handle

> DELETE  /actuator/env
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.13	handle

> GET  /actuator/env/{toMatch}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.14	handle

> GET  /actuator/features
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.15	handle

> GET  /actuator/filters
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.16	handle

> GET  /actuator/health
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.17	handle

> GET  /actuator/health/{component}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.18	handle

> GET  /actuator/health/{component}/{instance}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.19	handle

> GET  /actuator/heapdump
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.20	handle

> GET  /actuator/httptrace
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.21	handle

> GET  /actuator/info
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.22	handle

> GET  /actuator/loggers
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.23	handle

> GET  /actuator/loggers/{name}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.24	handle

> POST  /actuator/loggers/{name}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.25	handle

> GET  /actuator/mappings
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.26	handle

> GET  /actuator/metrics
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.27	handle

> GET  /actuator/metrics/{requiredMetricName}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.28	handle

> GET  /actuator/nacos-config
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.29	handle

> GET  /actuator/nacos-discovery
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.30	handle

> POST  /actuator/refresh
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.31	handle

> GET  /actuator/routes
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.32	handle

> POST  /actuator/routes
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.33	handle

> GET  /actuator/routes/{format}
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.34	handle

> GET  /actuator/scheduledtasks
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.35	handle

> GET  /actuator/service-registry
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.36	handle

> POST  /actuator/service-registry
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 42.37	handle

> GET  /actuator/threaddump
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 43	web-mvc-links-handler

## 43.1	links

> GET  /actuator
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 44	双创态势

## 44.1	双创态势科技成果统计

> GET  /innovate/situation/achievementStat
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 44.2	双创态势统计环形(除折线图)

> GET  /innovate/situation/annularStat
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 44.3	双创态势重点产业统计

> GET  /innovate/situation/industryStat
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 44.4	双创态势双创趋势统计

> GET  /innovate/situation/trendStat
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 45	文件上传

## 45.1	文件上传

> POST  /file/upload
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| multipartFiles|array||false|文件上传file|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 46	企业园区

## 46.1	根据id查询数据

> POST  /investment/park/getByIdLists
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 46.2	园区列表

> POST  /investment/park/getInvestmentParkList
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| filterGroup|array[object]||false||
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterGroups|array[object]||false|过滤器容器|
|⇥ filterGroups|array||false|容器列表|
|⇥ filterItems|array[object]||false|塞选器列表|
|⇥⇥ anotherValue|object|[]|false|另一个字段值|
|⇥⇥ field|string|id|false|过滤字段|
|⇥⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥⇥ value|object|[]|false|字段值|
|⇥ op|string|AND,OR|false|塞选条件|
| filterItems|array[object]||false|塞选器列表|
|⇥ anotherValue|object|[]|false|另一个字段值|
|⇥ field|string|id|false|过滤字段|
|⇥ op|string|EQUAL,<br>    LIKE,<br>    LEFTLIKE,<br>    RIGHTLIKE,<br>    GT,<br>    GE,<br>    LT,<br>    LE,<br>    BETWEEN,<br>    ISNULL,<br>    ISNOTNULL,<br>    NOTEQUAL,<br>    NOTLIKE,<br>    IN|false|塞选条件|
|⇥ value|object|[]|false|字段值|
| pageNumber|int32|1|false|页码，不能小于1|
| pageSize|int32|10|false|每页数量|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|分页返回类|
|⇥ data|array[object]||false|返回列表|
|⇥⇥ address|string|详细地址|false|详细地址|
|⇥⇥ area|string|面积（亩）|false|面积（亩）|
|⇥⇥ buildArea|string|建筑面积（亩）|false|建筑面积（亩）|
|⇥⇥ buildYear|string|建成年份|false|建成年份|
|⇥⇥ city|string|城市|false|城市|
|⇥⇥ createTime|string||false|创建时间|
|⇥⇥ createUser|string|ZhangSan|false|创建人|
|⇥⇥ deleteFlag|int32|0|false|删除标记|
|⇥⇥ downtownArea|string|距市中心距离(公里)|false|距市中心距离(公里)|
|⇥⇥ enterprisesNum|int32||false|企业数|
|⇥⇥ estate|string|产业|false|产业|
|⇥⇥ id|string||false||
|⇥⇥ name|string|园区名称|false|园区名称|
|⇥⇥ operationMode|string|运营方式|false|运营方式|
|⇥⇥ operationUnit|string|运营单位|false|运营单位|
|⇥⇥ province|string|省份|false|省份|
|⇥⇥ region|string|地区|false|地区|
|⇥⇥ updateTime|string||false|更新时间|
|⇥⇥ updateUser|string|ZhangSan|false|更新人|
|⇥ pageNo|int32|1|false|当前页数|
|⇥ pageSize|int32|10|false|当前每页条数|
|⇥ totalCount|int32|10|false|总条数|
|⇥ totalPage|int32|1|false|总页数|
| msg|string||false|提示信息|

##### 接口描述
> 




## 46.3	导入招商企业excel

> POST  /investment/park/importEnterpriseConcernExcel
### 请求体(Request Body)
| 参数名称 | 数据类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| file|string||false|上传文件|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 47	公用方法接口

## 47.1	获取验证信息

> GET  /public/getAuth
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|object||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 47.2	获取图形验证码

> GET  /public/getCodeImg
### 响应体
● 200 响应数据格式：JSON

##### 接口描述
> 




## 47.3	获取短信验证码

> POST  /public/getSmsCode
### 请求参数(Query Param)
| 参数名称 | 默认值 | 描述 |
| ------ | ------ | ------ |
|checkCode||图形验证码|
|mobilePhone||手机号|
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 




## 47.4	获取wegov2地址

> GET  /public/getWegov2Url
### 响应体
● 200 响应数据格式：JSON
| 参数名称 | 类型 | 默认值 | 不为空 | 描述 |
| ------ | ------ | ------ | ------ | ------ |
| code|string||false|结果编码|
| data|string||false|返回结果|
| msg|string||false|提示信息|

##### 接口描述
> 



