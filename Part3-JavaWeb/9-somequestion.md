
##
### Question1
```
IDEA：There is no configured running web-servers found! Please, run any web-configuration and hit the
```

原来IDEA要这么做，需要先把服务容器启动起来，工具栏中选中Run,

### Question2
点击项目中的html预览时，报出下面错误
```
idea报错：Please, configure Web Facet first!
```

点击Facets项->点击+号->添加Web模块：

->Artifacts->+号->WebApplication:Exploded->From Modules..

选择你的项目->OK

点击Web Resource Directory下的路径对Web Resource进行修改。  
idea默认的目录是web（如：D:\ideaspace\ideadome\fistweb\web），web项目是WebRoot，可以运行web目录下的jsp页面，若是想运行其他目录下的jsp页面，就选择其他目录  
————————————————
版权声明：本文为CSDN博主「1988我想和这个世界谈谈」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/malz_zh/article/details/85098356


### Question3

 > spring mvc访问html页面404报错解决
 ```
<servlet>
  <servlet-name>context</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
      <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath*:/spring-mvc.xml</param-value>
      </init-param>
      <load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
  <servlet-name>context</servlet-name>
  <url-pattern>/</url-pattern>
</servlet-mapping>
```
相比大家都对url-pattern 路径/和/*都有所困扰。  
网上说，/不对（.jsp,.html等）进行拦截。/*对（.jsp,.html等）进行拦截。其实不是这样的。这两个都会进行拦截，只是不同点就是，  
/路径会先被Tomcat下web.xml里面的servlet拦截  
/*规则会覆盖所有默认的servlet，会将所有请求都拦截了下来  

如果是请求的是html文件。配置成<url-pattern>/</url-pattern>会出现404 。如果是jsp则可以请求200  
接下来看下tomcat web.xml文件。原因就是tomcat下的web.xml配置了.jsp文件。所以可以正常访问。
```
    <!-- The mapping for the default servlet -->
    <servlet-mapping>
        <servlet-name>default</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>

    <!-- The mappings for the JSP servlet -->
    <servlet-mapping>
        <servlet-name>jsp</servlet-name>
        <url-pattern>*.jsp</url-pattern>
        <url-pattern>*.jspx</url-pattern>
    </servlet-mapping>
```
解决方案：  
1.那么对于html文件咋办？可以在自己项目下web.xml加入
<servlet-mapping>
    <servlet-name>jsp</servlet-name>
    <url-pattern>*.html</url-pattern>
</servlet-mapping>
2.或者在tomcat下web.xml加入 <url-pattern>*.html</url-pattern>不建议这样做，不灵活

3.还可以在springmvc.xml中针对资源文件加入以下，也可以解决
<mvc:default-servlet-handler/>

原文链接：https://blog.csdn.net/saygood999/article/details/86291249
