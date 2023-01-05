### 这是整合 nacos 到自己微服务运行的核心模块，后续 alibaba 官方更新新的版本同样是主要更新此模块即可
### [参考个人博客](https://www.cnblogs.com/Alay/p/15116662.html)

### 使用说明
#### 1、下载代码，推荐将代码整块迁移到个人项目中使用

#### 2、创建数据库,执行 SQL 脚本,为nacos 持久化DB 做准备（MySQL 为例）
![img.png](images/sql.png)

#### 3、 修改配置文件/resource/application.yml 文件中配置
![img.png](images/配置文件修改.png)

### 整合说明
#### 1、下载 阿里巴巴  [官方源码](https://github.com/alibaba/nacos/tags)
##### 进入官方源码库

![img.png](images/nacos源码库.png)

##### 选择版本

![img_1.png](images/tag选择.png)

##### 选择源码压缩下载（.tar / .zip 二选一即可）
![img_2.png](images/下载源码.png)

##### 解压
![img.png](images/解压展示.png)

##### 整合和升级 nacos 源码，只需要将 console 模块拷贝到项目中即可