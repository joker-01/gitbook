
# 使用流程
1.解压 

2.新建my.ini 文件

```
[mysql]
# 设置mysql客户端默认字符集
default-character-set=utf8
 
[mysqld]
# 设置3306端口
port = 3306
# 设置mysql的安装目录!
!!!!!!!!!!!!!!!!!!!!!!!!这个目录放置你解压的路径
basedir=E:\yxc\mysql-8.0.22-winx64\mysql-8.0.22-winx64
# 设置 mysql数据库的数据的存放目录，MySQL 8+ 不需要以下配置，系统自己生成即可，否则有可能报错
# datadir=C:\\Mysql\\mysql-8.0.17-winx64\\data
# 允许最大连接数
max_connections=20
# 服务端使用的字符集默认为8比特编码的latin1字符集
character-set-server=utf8
# 创建新表时将使用的默认存储引擎
default-storage-engine=INNODB
```
初始化：mysqld  --initialize --console（不建议使用，在控制台生成一个随机的root密码），对于5.7以上版本需要使用该命令；或者使用mysqld --initialize-insecure（不生成密码）

3.安装mysql

+ mysqld install mysql  //安装mysql服务  
```
E:\abc\mysql-8.0.25-winx64\bin>mysqld install  mysql
Service successfully installed.
```

+ sc delete mysql(需要管理员权限) //卸载mysql服务,在windows管理->服务中也可以看到删除  
+ net stop mysql //停止mysql服务    
+ mysqld -remove  //移除mysql服务（需要停止mysql）

4.开启Mysql服务  
net start mysql

5.进入数据库修改密码
ALTER USER "root"@"localhost" IDENTIFIED  BY "你的新密码";root


# 参考资料
### 连接mysql出现‘mysql执行错误1251'的解决方法
https://blog.csdn.net/qq_40605167/article/details/81253976

### 怎么解决mysql服务无法启动的问题
https://jingyan.baidu.com/article/b24f6c820a029b86bfe5da3c.html
重新使用net start mysql即可

### 删除windows7的服务
https://jingyan.baidu.com/article/020278115af0bc1bcc9ce5d6.html
> sc delete [服务名]  

# 其他杂谈
mysqld是用来启动mysql数据库的命令，mysql是打开并执行sql语句的命令。


# 问题及参考解决方案
### 1.启动时报错
```
E:\abc\mysql-8.0.25-winx64\bin>net start mysql
mysql 服务正在启动 .
mysql 服务无法启动。
服务没有报告任何错误。
```
https://jingyan.baidu.com/article/da1091fb1a46a6027849d6a8.html  
mysql5.7以上版本中默认没有一个data目录，即没有初始化服务。需要先初始化mysql才可以启动服务  

- 在mysql的bin目录下执行mysqld  --initialize-insecure  
若是还有问题，检查my.ini文件内容

---
```
mysqld: [ERROR] Found option without preceding group in config file E:\yxc\mysql
-8.0.22-winx64\mysql-8.0.22-winx64\my.ini at line 1.  
mysqld: [ERROR] Fatal error in defaults handling. Program aborted!
```
原因：my.ini文件格式是utf-8  
解决办法，my.ini文件保存为ANSI格式文件

---
