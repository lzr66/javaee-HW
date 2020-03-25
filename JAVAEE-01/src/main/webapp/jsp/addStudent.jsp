<%--
  Created by IntelliJ IDEA.
  User: 97020
  Date: 2020/3/11
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>


<div align="center">
    <h1>新学生</h1>
    <form action="${pageContext.request.contextPath}/addStudent" method="post">
        <table style="line-height: 40px">
            <tr>
                <th>姓名:</th>
                <td><input type="text" name="name" maxlength="20" style="font-family: arial" required></td>
            </tr>
            <tr align="center">
                <td><input type="submit" value="提交"> </td>


            </tr>

        </table>

    </form>

</div>

</body>
</html>
