<%@page import="entity.Students"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>

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

<title>My JSP 'AddStudent.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<style type="text/css">
#btn {
	margin-top: 30px;
	margin-left: 25%;
	width: 50%;
}

#pannell {
	margin-top: 50px;
	margin-left: 25%;
	width: 50%;
}

#sname {
	margin-left: 25%;
	width: 50%;
}

#ssex {
	
}

#sbirthday {
	
}

#saddress {
	
}
</style>


<script type="text/javascript"
	src="${pageContext.request.contextPath }/users/right/add/My97DatePicker/WdatePicker.js"></script>


<body>

	<%
	    Students student = (Students)session.getAttribute("students_info");
		String sid = "";
		String sname = "", ssex = "", saddress = "", sbirthday = "", btnTitle;
		String radioCheck1 = "checked";
		String radioCheck2 = "";
		String url = "students/Students_add.action";

		    
		    if(student != null)
		     {
		        
		        sid = student.getSid();
		     
		        url = "students/Students_update.action";
		     
		        sname = student.getSname();
		        ssex = student.getGender();
		        if("女".equals(ssex)){
		            radioCheck1 = "";
		            radioCheck2 = "checked";
		        }
		        Date birthday = student.getBirthday();
		        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		        sbirthday = dateformat.format(birthday);
		        saddress = student.getAddress();
		     
		     btnTitle = "确认修改"; 
	%>

	  <h1 align="center">编辑学号<%=sid%>学生资料</h1> 
	<%
	}else{
		btnTitle = "确认添加";
	%>
	<h1 align="center">添加学生</h1>
	<%
	 } 
	%>

	<hr>
	<div id="pannell">
	
		<form action="<%=url%><%if (sid.length() > 0) {%>?sid=<%=sid%><%}%>" method="post">

			<div id="sname">
				姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<input
					type="text" value="<%=sname%>" name="sname" /> <br>


				性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别： <input
					type="radio" name="gender" value="男"
					<%if (radioCheck1.length() > 0) {%> checked="checked" <%}%> /> 男 <input
					type="radio" name="gender" value="女"
					<%if (radioCheck2.length() > 0) {%> checked="checked" <%}%> />女 <br>

				出生日期：<input type="text" name="birthday" class="Wdate"
					value="<%=sbirthday%>"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" /> <br> 
				家庭住址：<input
					type="text" value="<%=saddress%>" name="address" /> <br> <input
					class="button" type="submit" value="<%=btnTitle%>" id="btn">


			</div>
		</form>
	</div>


</body>
</html>
