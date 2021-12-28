
# Servlet
Server applet 运行在服务器端的小程序  
### 1.概念    
本质:是一个接口,interface,  
自定义一个类,复写serverlet方法
### 2.执行原理和生命周期
类没有对象,能执行其中的方法??WHY?Tomcat
```
@WebServlet("/demo2")
public class ServletDemo1 implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello Servlet");

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
```
### 3.Servlet体系结构 
``` 
Servlet
   |  
   └── GenericServlet  
             |  
             └──  HttpServelet
```
Request继承体系
```
ServletRequest
     |  
     └── HttpServletRequest
             |  
             └── org.apache.catalina.connector.RequestFacade(Tomcat运行中实现)
```
