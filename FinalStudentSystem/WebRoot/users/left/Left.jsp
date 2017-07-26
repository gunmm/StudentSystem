<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>左侧列表</title>
    
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
*{
margin:0; 
padding:0; 
font-size:14px;
}
a{
color:#333;
text-decoration:none
}
.nav li a{
 display:block;
 /* text-indent:20px;  */
 text-align:center;
 height:30px; 
 line-height:30px; 
 width:100%; 
 background-color:#efefef; 
 /* margin-bottom:1px; */
 margin-top: 20px;
 }
.nav li a:hover{
 background-color:#F60; 
 color:#fff}


</style>

  
  
  <body>
	   <ul class="nav">
	    <li><a href="students/Students_query.action" target="right">学生列表</a></li>
	    <!-- <li><a href="#" target="right">学生编辑</a></li> -->
	    <li><a href="users/right/add/AddStudent.jsp" target="right">学生添加</a></li>
	    <!-- <li><a href="#" target="right">学生删除</a></li> -->
	    </ul>
  
   
    
    
  </body>
</html>
