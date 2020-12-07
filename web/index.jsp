<%--
  Created by IntelliJ IDEA.
  User: lilei
  Date: 2020/12/7
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SpringMVCTest</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"/>
  </head>
  <body>
  <h1>${message}</h1>
  <a href="views/hello.jsp">hello.jsp</a><br/>
  <a href="helloUrl.do">helloUrl.do</a><br/>
  <a href="helloClassServlet.do">helloClassServlet.do</a><br/>
  <a href="/user/list.do">查询用户</a><br/>
  <a href="/user/add.do">注册用户</a><br/>
  <a href="/user/update.do">更新用户信息</a><br/>


  <form action="/user/getUserInfo2.do" method="post">
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <input type="submit" value="提交">
  </form>

  <a href="/user/getModelAndView.do">getModelAndView</a><br/>


  <input id="testMessage" placeholder="testMessage"><br/>
  <input id="btn" type="button" value="提交">
  </body>
</html>
