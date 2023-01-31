---
layout: sublime
title: Text3新手使用的一点经验
date: 2020-03-04 18:09:45
tags:
---

####
强烈推荐的网站：http://www.sublimetext.cn

首先说明一点，Sublime有很多种应用场景，每种场景需要安装的插件并不相同。

我主要是作为**前端开发**工具使用的，所以安装的插件有：

# 常用插件

Package Control (管理插件的包)
Emmet
PyV8（安装Emmet的准备包）
SiderBarTools
docBlockr
SiderBarEnhancements
AdvanceNewFile
LocalHistory
LESS CSS专用


插件的安装方式
1.在线安装，有时候比较卡，不推荐
2.离线安装，因为有好多包在github上都有，所以可以直接从上面下载，放在指定位置即可
注意，有些插件离线安装和在线安装是不一样，离线安装有时需要更改文件夹名称。例如PyV8
{}


    由于packagecontrol.io容易被墙，访问不稳定，所以需要将Sublime Text安装插件的地址改为中文镜像的地址：
	1、打开Package Control配置文件
	Package Settings > Package Control>Setting-User
	2、修改或新增channels地址
	{ "channels": [ "http://packagecontrol.cn/channel_v3.json" ] }




Sublime Text3 快捷键（Mac版）

option+command+1（2，3，4，5） 分栏

control+·   调出下方命令行

参考：Sublime中文镜像http://packagecontrol.cn/installation

------------------------------------
参考网站：
http://www.sublimetext.cn



分栏快捷键：option+command+1，2，3

第一步，安装Package Control
control + `
import urllib.request,os,hashlib; h = '6f4c264a24d933ce70df5dedcf1dcaee' + 'ebe013ee18cced0ef93d5f746d80ef60'; pf = 'Package Control.sublime-package'; ipp = sublime.installed_packages_path(); urllib.request.install_opener( urllib.request.build_opener( urllib.request.ProxyHandler()) ); by = urllib.request.urlopen( 'http://packagecontrol.cn/' + pf.replace(' ', '%20')).read(); dh = hashlib.sha256(by).hexdigest(); print('Error validating download (got %s instead of %s), please try manual install' % (dh, h)) if dh != h else open(os.path.join( ipp, pf), 'wb' ).write(by)

第二部，新增channels地址，因为这个很容易被墙
{ "channels": [ "http://packagecontrol.cn/channel_v3.json" ] }


安装插件：
一种是借助Package Control在线安装
第二种：下载某个插件包，解压
其中有些包需要将文件重名名，例如PyV8，放在sublime Text3>installed Package下。

# 设置html文件浏览器打开快捷方式

{% asset_img 浏览器预览快捷键设置.png%}

