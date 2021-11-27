---
title: Java连接sql数据库
date: 2020-04-06 21:38:34
tags:
---

快速入门：
1.导入驱动jar包
    1.1  mysql-connector-java-5.1.48-bin.jar
    1.2  右键>add as library
2.注册驱动
3.获取数据库连接对象 Connection
4.定义sql语句
5.获取执行sql的对象 Statement
6.执行sql，接受返回结果
7.处理结果
8.释放资源

示例代码:
```
public class jdbcmySql {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TVMovie","root","12345678");
        String sqlforSelect = "select * from 动漫;";
        Statement state = con.createStatement();
        ResultSet rst = state.executeQuery(sqlforSelect);
        while(rst.next())
        {
            System.out.println(rst.getInt("总集数")+"：" + rst.getString("标题名"));
        }

        state.close();
        con.close();
    }
}
```
