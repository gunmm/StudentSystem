<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ page import="entity.Students"%>
<%@page import="java.text.SimpleDateFormat"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'AddSuccess.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
.divv {
	width: 100%;
	margin-top: 10%;
	text-align: center;
}
</style>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css"> -->


</head>

<body>

	<%
	    String type = "添加";
	    String result = "失败";
		String isSuccess = (String) session.getAttribute("add_success");
		String isSuccess2 = (String) session.getAttribute("update_success");
		
		if ("1".equals(isSuccess)) {
		   result = "成功";
		}
		
		if ("1".equals(isSuccess2)) {
		   type = "更新";
		}
		
		
	%>
	<div class="divv">
		添加成功<a href="users/right/add/AddStudent.jsp">继续添加</a>
	</div>


	
	
</body>
</html>
