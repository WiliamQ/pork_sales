<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>《软件工程》课程网站</title>
</head>
<body>
	<div>
		<form action="user/login.action" method="post">
			账&nbsp;&nbsp;号：<input name="id" type="text" /><span>${iderror}</span><br />
			密&nbsp;&nbsp;码：<input name="password" type="password" /><span>${passworderror}</span><br />
			<input type="submit" value="登陆" /><span>${loginerror}</span>
		</form>
	</div>
</body>
</html>