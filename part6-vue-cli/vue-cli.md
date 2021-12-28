CLI,Command Line Interface

# 环境准备
1.安装nodejs
  验证 node -v
  node本身带来npm命令 npm，node package manager
  maven 管理Java后端依赖  远程仓库（中心仓库） 阿里云镜像
  npm   管理前段系统依赖  远程仓库（中心仓库） 淘宝镜像  本地仓库
  npm 

配置
npm  config set  registry https://registry.npm.taobao.org

查看
npm  config get  registry

NPM修改全局下载和缓存路径
查看本来的路径
E:\abc\vuecli1>npm config ls
```
; cli configs
metrics-registry = "https://registry.npm.taobao.org/"
scope = ""
user-agent = "npm/6.13.4 node/v12.16.1 win32 x64"

; userconfig C:\Users\THTF\.npmrc
registry = "https://registry.npm.taobao.org/"

; builtin config undefined
prefix = "C:\\Users\\THTF\\AppData\\Roaming\\npm"

; node bin location = C:\Program Files\nodejs\node.exe
; cwd = E:\abc\vuecli1
; HOME = C:\Users\THTF
; "npm config ls -l" to show all defaults.
```
E:\abc\vuecli1>npm config set cache "E:\abc\npmlib\cache"

E:\abc\vuecli1>npm config set prefix "E:\abc\npmlib\lib"

E:\abc\vuecli1>npm config ls
; cli configs
metrics-registry = "https://registry.npm.taobao.org/"
scope = ""
user-agent = "npm/6.13.4 node/v12.16.1 win32 x64"

; userconfig C:\Users\THTF\.npmrc
cache = "E:\\abc\\npmlib\\cache"
prefix = "E:\\abc\\npmlib\\lib"
registry = "https://registry.npm.taobao.org/"

; builtin config undefined

; node bin location = C:\Program Files\nodejs\node.exe
; cwd = E:\abc\vuecli1
; HOME = C:\Users\THTF
; "npm config ls -l" to show all defaults.

2.安装脚手架
npm install -g vue-cli
卸载cli3
npm uninstall -g @vue/cli

3.使用vue-cli创建第一个项目
vue init webpack 项目名

Q：E:\abc>vue init webpack hello 
   'vue' 不是内部或外部命令，也不是可运行的程序或批处理文件。
  将 prefix = "E:\\abc\\npmlib\\lib"的路径添加到Path中，
  参考：
  vue不是内部或外部命令，也不是可运行的程序 或批处理文件 解决方法
  https://www.cnblogs.com/pwindy/p/13292538.html
  项目目录：
    .babelrc
    .editorconfig
    .gitignore
    .postcssrc.js   css兼容控制
    build   用来使用webpack打包使用build依赖
    config   整个项目配置文件
    index.html  项目主页
    node_modules  管理项目依赖
    package-lock.json  package.json的加锁文件
    package.json  类似pom.xml依赖管理
    README.md
    src    
        src\assets  静态资源
        src\components
        src\router
        src\App.vue
        src\main.js
    static

启动：npm start  或者 npm run dev
访问：localhost：8080

开发方式：万物皆组件

axios
安装axios
npm install axios --save-dev
引入
import axios from 'axios'
将axios改为Vue的原型属性
Vue.prototype.$http=axios
使用
在需要发送异步请求的位置axios.get('url').then() 改为$http.get('url').then(){}
RAP2网站，生成接口chaos
ylxmn1234

VUE CLI项目的打包部署
有package。json目录下 vue run build
打包的项目必须在服务器上运行，放到服务上。
出现dist目录，就是项目的部署目录

Vue2.0 搭建Vue脚手架（vue-cli）  
https://segmentfault.com/a/1190000011275993