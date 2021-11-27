---
title: Python3中的编码
date: 2020-04-08 22:37:26
tags:
---


## 编码的几个概念
理论上,从一个字符到具体的编码,会经过以下几个概念:  
字符集(Abstract character repertoire)
>就算一堆抽象的字符，如所有中文。字符集的定义是抽象的，与计算机无关。  

编码字符集(Coded character set)  
>是一个从整数集子集到字符集抽象元素的映射。即给抽象的字符编上数字。如gb2312中的定义的字符，每个字符都有个整数和它对应。一个整数只对 来，则不一定是。这里所说的映射关系，是数学意义上的映射关系。编码字符集也是与计算机无关的。unicode字符集也在这一层。 

字符编码方式(Character encoding form)  
> 这个开始与计算机有关了。编码字符集的编码点在计算机里的具体表现形式。通俗的说，意思就是怎么样才能将字符所对应的整数的放进计算机内 于是，不同人有不同的实现方式，所谓的万码奔腾，就是指这个。gb2312，utf-8,utf-16,utf-32等都在这一层。 

字符编码方案(Character encoding scheme)  
> 这个更加与计算机密切相关。具体是与操作系统密切相关。主要是解决大小字节序的问题。对于UTF-16和UTF-32编码，Unicode都支持big-endian 和 little-endian两种编码方案。
 
 一般来说，我们所说的编码，都在第三层完成。具体到一个软件系统中，则很复杂。

## 乱码的原因


## Python3与Python2区别
v3中的str 等价于 v2中unicode,v3中的bytes相当于v2中str    
判断字符串是否是str
> isinstance(s,str)

## Python中decode(解码)与encode(编码)
#### Python2中

            decode         encode
[一种编码格式]---->[unicode]----->[新编码方式]

!若是一个字符串已经是unicode编码格式,再进行decode就会报错.

## 编码与解码
先了解两个概念:
字节:
字节流:,用“字节流”表示“字节”组成的串.
字符:又称为文本,比如英文字符“a”、“b”、“c”,中文字符“我你他”
**编码(动词)**:按照某种规则(这种规则称为:”编码(名词)“)将”文本”转为”字节流“.[Python2中unicode-->str]
**解码(动词)**:将“字节流”按照某种规则转为“文本”.[Python2中str---->unicode]

unicode定义了,一个'字符'和一个'数字'的对应

!实际上,任何东西在计算机中表示,都需要编码.例如:视频编码保存在文件中,播放时需要解码.

## 查看本机默认编码
```
import sys
print sys.getdefaultencode()
```
Python2中默认编码方式是ascii,Python是utf8

## 一些测试例子


只要存在数据交互,就有可能发生编码不一致情况.
例如:网络传输过程、数据库
二者通信传输数据需要先编码成utf8格式的Bytes类型,再传送;暨数据在网络是以二进制传输的.
服务器端进程
```
from socket import *
from time import ctime
 
Host=""#变量是空白的，表示可以使用任何可用的地址
port=21567
BUFSIZ=1024
ADDR=(Host,port)
tcpSerSock=socket(AF_INET,SOCK_STREAM) #分配了TCP套接字
tcpSerSock.bind(ADDR)
#将套接字绑定到服务器地址以及开启TCP监听器的调用
tcpSerSock.listen(5)
#连接被转接或者拒绝之前，传入请求的最大连接数
while True:
    #等待服务器的连接，如果消息是空白的，意味着客户端已经退出
    print("waiting for connection")
    tcpCliSock,addr=tcpSerSock.accept()
    print('connectin from:',addr)
    while True:
        data=tcpCliSock.recv(BUFSIZ).decode('utf-8')
        print("the client says: ",data)
        if not data:
            break
        tcpCliSock.send(('[%s] %s' % (ctime(),data).encode(encoding='utf-8'))
    tcpCliSock.close()
tcpSerSock.close()

```
客户端进程
```

from socket import *
 
HOST='localhost'#主机名
POST=21567#端口号，应该与服务端的端口号相同
BUFSIZ=1024
ADDR=(HOST,POST)
tcpCliSock=socket(AF_INET,SOCK_STREAM)#分配了套接字
tcpCliSock.connect(ADDR)
while True:
    data=input('>')
    if not data:
        break
 
    tcpCliSock.send(data.encode(encoding='utf-8'))
    data=tcpCliSock.recv(BUFSIZ)
    if not data:
        break
    print(data.decode('utf-8'))
tcpCliSock.close()
```

## 参考
https://blog.csdn.net/a921800467b/article/details/8579510