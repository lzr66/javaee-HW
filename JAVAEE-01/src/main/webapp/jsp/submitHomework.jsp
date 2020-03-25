<%--
  Created by IntelliJ IDEA.
  User: 97020
  Date: 2020/3/13
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交作业</title>
</head>
<body>
<div align="center">
    <form method="post" action="${pageContext.request.contextPath}/submit">
        <table border="1" width="960">
<tr>
    <th width="30%">学号:</th>
    <td width="70%"><input type="number" name="studentId"
                           maxlength="20" style="font-family: Arial;  width: 100%" required>
    </td>
</tr>

<tr>
    <th width="30%">作业号:</th>
    <td width="70%"><input type="number" name="homeworkId"
                           maxlength="20" style="font-family: Arial;  width: 100%" required>
    </td>
</tr>

 <tr>
     <th width="30%">作业名:</th>
     <td width="70%"><input type="text" name="title"
                            maxlength="20" style="font-family: Arial;  width: 100%" required>
     </td>
 </tr>

<tr>
    <th width="30%">作业内容</th>
    <td width="70%"><textarea name="content"  style="font-family: Arial; width: 100%" rows="10" required></textarea></td>
</tr>
<tr style="border: none">
    <td align="center"><input type="reset" value="清空"></td>
    <td align="center"><input type="submit" value="提交"></td>
</tr>
        </table>
    </form>
</div>
</body>
</html>
