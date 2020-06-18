<%--
  Created by IntelliJ IDEA.
  User: 97020
  Date: 2020/3/8
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>作业管理</title>
  </head>

  <body>
  <div align="center">
      <h1>请登录：</h1>

<%--
 <li><a href="jsp/teacher.jsp">老师管理作业</a> </li>
 <li><a href="jsp/submitHomework.jsp">学生上传作业</a> </li>
--%>
 <form action="${pageContext.request.contextPath}/login" method="get">

     <table style="line-height: 40px">
         <tr>
             <th>用户名:</th>
             <td><input type="text" name="username" maxlength="20" size="40" style="font-family: arial" required></td>
         </tr>
         <tr>
             <th>密码:</th>
             <td><input type="text" name="password" maxlength="20" size="40" style="font-family: arial" required></td>
         </tr>

         <tr align="center">
             <th><input type="reset" value="清空"></th>
             <td><input type="submit" value="提交"> </td>
         </tr>
         <tr>
         <li><a href="jsp/register.jsp">没有账号 点击注册</a> </li>
         </tr>
     </table>

 </form>
</div>

</body>
</html>
