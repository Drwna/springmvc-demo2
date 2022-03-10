<%--
  Created by IntelliJ IDEA.
  User: 晓龙
  Date: 2022/3/9
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc-demo2</title>
</head>
<body>
<h3>入门程序</h3>
<a href="user/hello">点我</a>
<br/>
<a href="user/test">test</a>
<br/>
<a href="param/testParam?username=hhh">请求参数转发</a>
<br/>
<h3>表单数据</h3>
<%--把数据封装到 Account 类中--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    用户姓名：<input type="text" name="user.uname"/><br/>
    用户年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交">
</form>
<h3>list map</h3>
<%--把数据封装到 Account 类中, 类中存在 list 和 map--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    <h4>list</h4>
    用户姓名：<input type="text" name="list[0].uname"/><br/>
    用户年龄：<input type="text" name="list[0].age"/><br/>
    <h4>map</h4>
    用户姓名：<input type="text" name="map['one'].uname"/><br/>
    用户年龄：<input type="text" name="map['one'].age"/><br/>

    <input type="submit" value="提交">
</form>
</body>
</html>
