<%--
  Created by IntelliJ IDEA.
  User: lilei
  Date: 2020/12/7
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>
    <form method="post" action="hello.do">
        <input type="text" name="hello" placeholder="helloWorld">
        <input type="submit" value="提交">
    </form>

    <form method="post" action="/hello.do">
        <input type="text" name="username" placeholder="username">
        <input type="submit" value="提交">
    </form>
</body>
</html>
