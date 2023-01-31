# JDBC 
JDBC 定义一类接口，厂家实现驱动。  
简单的类

```
package chao.jdbc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Util {
    public static Connection getConnetion(){
        Connection conn = null;
        try {
            Properties prop  = new Properties();
            InputStream is = Util.class.getClassLoader().getResourceAsStream("jdbc.properties");
            prop.load(is);
            String driver = prop.getProperty("driver");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");
            String url = prop.getProperty("jdbc.url");
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conn;
    }

    void close(Statement stmt, Connection conn){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     *  释放资源
     *  方法重载
    */
    void close(ResultSet rs,Statement stmt, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

```
```
package chao.jdbc;

import chao.jdbc.utils.Util;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) throws Exception{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://39.101.162.217:3306/ssm","chao","chao");
        Connection conn = Util.getConnetion();
        Statement statement = conn.createStatement();
        String sql = "select * from user";
//        boolean execute = statement.execute(sql);
        ResultSet rs = statement.executeQuery(sql);
        List<User> lu = new ArrayList<>();
        while(rs.next()){
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            User u = new User();
            u.setId(id);
            u.setPassword(password);
            u.setUsername(username);
            System.out.println(u);
            lu.add(u);
        }
        System.out.println("lu"+lu);
    }
}

```
```
package chao.jdbc;

public class User {
    private int id;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

```
jdbc.properties
```
jdbc.url=jdbc:mysql://39.101.162.217:3306/ssm
user=chao
password=chao
driver=com.mysql.cj.jdbc.Driver
```
## 关于事务
Connection 对象操作事务的方法
1.开启事务
Util.getConnetion();
conn.setAutoCommit(false);
2.提交事务
conn.commit();
3.回滚事务
conn.rollback();
```
package chao.jdbc;

import chao.jdbc.utils.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = Util.getConnetion();
        conn.setAutoCommit(false);
        String sql1 = "update account set money = money + ? where id = ?";
        String sql2 = "update account set money = money - ? where id = ?";
        try {
            PreparedStatement pstm1 = conn.prepareStatement(sql1);
            PreparedStatement pstm2 = conn.prepareStatement(sql2);
            pstm1.setDouble(1,500);
            pstm2.setDouble(1,500);
            pstm1.setInt(2,1);

            pstm2.setInt(2,2);
            pstm1.executeUpdate();
            pstm2.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            conn.rollback();
        }
    }
}

```
## 连接池  
```
public static Connection getConnetion() {
        Connection conn=null;
        try {
            Properties pro = new Properties();
            InputStream is = DuirdDemo.class.getClassLoader().getResourceAsStream("Duridjdbc.properties");
            pro.load(is);
            DataSource ds = DruidDataSourceFactory.createDataSource(pro);
            conn = ds.getConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }
```
参考：
https://blog.csdn.net/u014135206/article/details/104437491/

# JDBCTemplate

导入JAR包，Junit
commons-logging-1.2.jar  
spring-beans-5.0.0.RELEASE.jar  
spring-core-5.0.0.RELEASE.jar  
spring-jdbc-5.0.0.RELEASE.jar 
spring-tx-5.0.0.RELEASE.jar  
Junit单元测试  
hamcrest-core-1.3.jar  
junit-4.12.jar  
```
import org.junit.Test;   
public class JDBCt {
    private  JdbcTemplate jt = new JdbcTemplate(DruidUtil.getDatapool());
 @Test
    public void testEmp(){
        String sql = "select * from user";
        List<User> u = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
        for (User uu:u){
            System.out.println(uu);
        }

    }
}
````
