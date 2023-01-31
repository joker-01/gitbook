---
title: Navigate连接错误2509
date: 2020-02-08 22:30:41
tags:
---
Mac中安装MySQL8.0.1之后，使用命令行非常不方便，故找一个客户端来方便对可视化对数据库进行管理。  
{% asset_img 1.png%}  
问题分析：
版本造成的影响
在MySQL 5.7中，默认的身份验证插件是 mysql_native_password；MySQL 5.8开始将caching_sha2_password作为默认的身份验证插件。

解决方法：
将新的加密插件caching_sha2_password更改为5.7之前的加密插件 mysql_native_password

mysql> ALTER USER 'root'@'localhost' IDENTIFIED BY 'password' PASSWORD EXPIRE NEVER;


mysql> ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '12345678';

