## Python 01 
## 2022-02-14
pip 和pip3区别
https://blog.csdn.net/qq_40584960/article/details/86082019

pip报failed to create process
https://blog.csdn.net/sinat_29957455/article/details/78926674
报这个错误的原因，是因为你改动了python的目录名称或位置。

Python安装与环境变量的配置
https://www.cnblogs.com/huangbiquan/p/7784533.html
在"Path"行，添加python安装路径即可(我的D:\Python27)

python 如何把pip加入环境变量
https://blog.csdn.net/reyyy/article/details/78940827
在环境变量的PATH里新建C:\Python27\Scripts，而不是C:\Python27\Lib\site-packages，因为pip程序在C:\Python27\Scripts。