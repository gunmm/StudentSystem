<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="entity.Students" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>列表显示</title>
    
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
body{
    margin: 0px;
    padding: 0px;
    overflow:auto;
    
}
table.hovertable {
   font-family: verdana,arial,sans-serif;
   font-size: 13px;
   color: #333333;
   border-width: 1px;
   border-color: #999999;
   border-collapse: collapse;
   width: 100%;
  
}
table.hovertable th{
  background-color:#c3dde0;
  border-width:1px;
  padding:8px;
  border-style: solid;
  border-color: #a9c6c9;
  
}
table.hovertable tr{
  background-color:#d4e3e5;
}
table.hovertable td{

  text-align:center;
  border-width:1px;
  padding:8px;
  border-style: solid;
  border-color: #a9c6c9;
  
}
</style>
  
  <body>
    <table class="hovertable">
     <tr>
       <th colspan="6">学生表</th>
     </tr>
     <tr >
       <th>学号</th>
       <th>姓名</th>
       <th>性别</th>
       <th>生日</th>
       <th>家庭住址</th>
       <th>删除</th>
     </tr>
     
     
     <s:iterator value="#session.students_list" var="stu">
          <tr onmouseover="this.style.backgroundColor='#ffff66';"
      onmouseout="this.style.backgroundColor='#d4e3e5';">
	       <td><a href="students/Students_queryForId?sid=<s:property value="#stu.sid"/>"><s:property value="#stu.sid"/></a></td>
	       <td><s:property value="#stu.sname"/></td>
	       <td><s:property value="#stu.gender"/></td>
	       <td><s:date name="#stu.birthday" format="yyyy-MM-dd"/></td>
	       <td><s:property value="#stu.address"/></td>
	       <td><a href="students/Students_delete?sid=<s:property value="#stu.sid"/>" onclick="javasscript: return confirm('真的要删除吗？')">删除</a></td>
     </tr>
     </s:iterator>
    <%--  <%    
        List<Students> list = (List)session.getAttribute("students_list");      
        if(list.size()>0){
          for(int i = 0;i<list.size();i++){
              Students student = list.get(i);
             
     %>
     <tr onmouseover="this.style.backgroundColor='#ffff66';"
      onmouseout="this.style.backgroundColor='#d4e3e5';">
	       <td><a href="jsp/right/add/AddStudent.jsp?sid=<%=student.getSid() %>"><%=student.getSid() %></a></td>
	       <td><%=student.getSname() %></td>
	       <td><%=student.getGender()%></td>
	       <td><%=student.getBirthday()%></td>
	       <td><%=student.getAddress()%></td>
	       <td><a href="<%=path%>/servlet/DeleteServlet?sid=<%=student.getSid() %>">删除</a></td>
     </tr>
     
     <%
             
             
             
          }
          
          %>
          
           <tr onmouseover="this.style.backgroundColor='#ffff66';"
      onmouseout="this.style.backgroundColor='#d4e3e5';">
	       
	       
     </tr>
          
          
          
          
          <%
        }
        
     
     
     %> --%>
     </table>
  </body>
</html>
