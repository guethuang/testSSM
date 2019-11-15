<%--
  Created by IntelliJ IDEA.
  User: 73148
  Date: 2019/11/12
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testSSM</title>
</head>
<body>
    <a href="account/findAll">测试</a>
    <h3>测试包</h3>

    <form action="account/save" method="post">
        姓名：<input type="text" name="username" /><br/>
        金额：<input type="text" name="address" /><br/>
        <input type="submit" value="保存"/><br/>
    </form>
</body>
</html>
