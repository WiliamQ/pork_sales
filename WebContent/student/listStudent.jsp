<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.se.pojo.*"%>
<%@ page import="java.util.*"%>
<%
	List<Student> students = (List<Student>) request.getAttribute("studentlist");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生列表</title>
</head>
<body>
	<div>
		<table border="1px">
			<tr>
				<th>学号</th>
				<th>名字</th>
				<th>班级</th>
				<th>操作</th>
			</tr>
			<%
				for (Student stu : students) {
			%>
			<tr>
				<td><%=stu.getId()%></td>
				<td><%=stu.getName()%></td>
				<td><%=stu.getClassId()%></td>
				<td><a href="student/deleteStudent.action?id=<%=stu.getId()%>">删除</a></td>
			</tr>
			<%
				}
			%>
		</table>
		<a href="../file/downloadFile.action?filename=Roster.xls">导出花名册</a>
	</div>
</body>
</html>