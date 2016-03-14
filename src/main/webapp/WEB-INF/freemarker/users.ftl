<html lang="en-US">
<head>
<meta charset="UTF-8">
<title>用户信息</title>
<head>
<body>
<table>
<h3>${userName} ,welcome!</h3>
<p> 用户列表：</p>
<tr><td>用户ID</td><td>用户姓名</td><tr>
<#list userList as user>
<tr><td>${user.userId}</td><td>${user.userName}</td><tr>
</#list>
</table>
</body>

</html>