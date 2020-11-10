<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>测试页面</title>
</head>
<body>
<a href="user/findAll">测试保存</a>
<h3>测试包</h3>
<form action="user/save" method="post">
    <table>
        <tr>
            <th>姓名</th>
            <th><input type="text" name="name"></th>
        </tr>
        <tr>
            <th>密码</th>
            <th><input type="text" name="password"></th>
        </tr>
        <input type="submit" value="提交">
    </table>
</form>
</body>
</html>
