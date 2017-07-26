<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>删除反馈界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <%
        String issuccess = request.getParameter("issuccess");
        if("success".equals(issuccess)){           
  %>
            删除成功<a href="jsp/right/Right.jsp">查看列表</a>
    
  <%
               
        }else{    
  %>
            删除失败<a href="jsp/right/Right.jsp">查看列表</a>
  <%           
	    }

  %>
  </body>
</html>
