<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
</head>
<body>
	<div>
		<form action="addStudent.action" method="post"
			enctype="multipart/form-data">
			学&nbsp;&nbsp;号：<input name="stu.id" type="text" /><span>${iderror}</span><br />
			密&nbsp;&nbsp;码：<input name="stu.password" type="text" /><span>${passworderror}</span><br />
			名&nbsp;&nbsp;字：<input name="stu.name" type="text" /><span>${nameerror}</span><br />
			班&nbsp;&nbsp;级：<input name="stu.classId" type="text" /><span>${classIderror}</span><br />
			头&nbsp;&nbsp;像：<input type="file" name="avatar" /><br /> <input
				type="submit" value="添加" />
		</form>
	</div>

</body>
</html>