---
title: Mac上安装Java环境及IDE（IntelliJ）
date: 2020-02-22 09:40:49
tags:
---

## 环境准备

- jdk-8u212-macosx-x64.dmg
- ideaIU-2019.2.4.dmg

## 安装过程

一路next

## 环境配置

1. 找到用户目录（～）下的./bash_profile [^./bash_profile与profile的区别]
2. 添加环境变量
> export JAVA_HOME=/Library/Java/本机安装jdk位置路径
> export CLASSPAHT=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
> export PATH=$JAVA_HOME/bin:$PATH
3. source ./bash_profile 生效

## IntelliJ IDE 破解
参考：https://www.jianshu.com/p/3c87487e7121（https://www.jianshu.com/p/3c87487e7121ß）


## 备注
[^./bash_profile与profile的区别] ./bash_profile 用户登陆系统时被读取，里面所有命令会被bash执行；profile位于/etc目录下，是系统级（全局）的配置文件，当在用户主目录下找不到.bash_profile 时，就会读取这个文件；二者关系类似windows中用户变量与系统系统变量。

**bash** ： 进入子程序   
**profile** ： 配置

#### 出现问题,看详细日志信息
/Users//Library/Logs/IntelliJIdea2019.2/idea.log





