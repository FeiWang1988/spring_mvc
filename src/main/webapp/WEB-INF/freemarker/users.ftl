<html lang="en-US">
<head>
<meta charset="UTF-8">
<title>�û���Ϣ</title>
<head>
<body>
<table>
<h3>${userName} ,welcome!</h3>
<p> �û��б�</p>
<tr><td>�û�ID</td><td>�û�����</td><tr>
<#list userList as user>
<tr><td>${user.userId}</td><td>${user.userName}</td><tr>
</#list>
</table>
</body>

</html>