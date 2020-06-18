<%--
  Created by IntelliJ IDEA.
  User: 97020
  Date: 2020/6/18
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业管理</title>
</head>

<body>
<div align="center">
    <h1>请注册：</h1>

    <%--
     <li><a href="jsp/teacher.jsp">老师管理作业</a> </li>
     <li><a href="jsp/submitHomework.jsp">学生上传作业</a> </li>
    --%>
    <form action="${pageContext.request.contextPath}/register" method="get">

        <table style="line-height: 40px">
            <tr>
                <th>用户名:</th>
                <td><input type="text" name="title" maxlength="20" size="40" style="font-family: arial" required></td>
            </tr>
            <tr>
                <th>密码:</th>
                <td><input type="text" name="title" maxlength="20" size="40" style="font-family: arial" required></td>
            </tr>
            <tr>
                <th>确认密码:</th>
                <td><input type="text" name="title" maxlength="20" size="40" style="font-family: arial" required></td>
            </tr>


            <tr align="center">
                <th><input type="reset" value="清空"></th>
                <td><input type="submit" value="提交"> </td>
            </tr>

        </table>

    </form>
</div>

</body>
</html>

