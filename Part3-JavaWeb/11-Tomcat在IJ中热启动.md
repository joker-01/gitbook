2.点击Deployment查看Deploy at the server startup 中tomcat运行的包是 xxxx:war 还是其他,如果是xxx:war包,请更换.点击旁边绿色加号,选择 xxx:war exploded ,然后将 xxx:war 点击红色删除掉



3.然后在Server中 将 "On Update action"、"On frame deactivation" 都选择 update classes and resources



4.点击 Apply -> OK ，每次改完代码编译完就不要重启tomcat了

运行的时候采用debug模式
每次重新刷新页面时，后台会自动编译。
————————————————
版权声明：本文为CSDN博主「qinxu0611」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qinxu0611/article/details/86146099


https://www.cnblogs.com/c2g5201314/p/12275243.html