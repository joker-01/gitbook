--  
> mysqld: [ERROR] Found option without preceding group in config file E:\yxc\mysql
-8.0.22-winx64\mysql-8.0.22-winx64\my.ini at line 1.  
mysqld: [ERROR] Fatal error in defaults handling. Program aborted!

原因：my.ini文件格式是utf-8

解决办法，my.ini文件保存为ANSI格式文件

## 流程
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
bLI4FJ9?<_CI
初始化：mysqld  --initialize --console（不建议使用，在控制台生成一个随机的root密码）  

3.安装mysql
```
//安装mysql服务
mysqld install mysql

//卸载mysql服务
sc delete mysql(需要管理员权限)
 ne
//移除mysql服务（需要停止mysql）
mysqld -remove
```
4.开启Mysql服务  
net start mysql2

5.进入数据库修改密码
ALTER USER "root"@"localhost" IDENTIFIED  BY "你的新密码";

### 连接mysql出现‘mysql执行错误1251'的解决方法
https://blog.csdn.net/qq_40605167/article/details/81253976

重新使用
net start mysql即可
### 怎么解决mysql服务无法启动的问题
https://jingyan.baidu.com/article/b24f6c820a029b86bfe5da3c.html

Abcd@qwer1234
2-._a%h;Mjt#