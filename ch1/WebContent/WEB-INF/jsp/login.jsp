<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>  
  <base href="<%=basePath%>"> 
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>后台登录</title>
	<style type="text/css">
	table{
		text-align: center;
	}
	.textSize{
		width: 120px;
		height: 25px;
	}
	</style>
  </head>
  <body>
  	<form action="user/login" method="post">
	<table>
		<tr>
			<td colspan="2">Login</td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="uname" class="textSize"></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="upass" class="textSize"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="登录" >
				<input type="button" value="重置" >
			</td>
		</tr>
	</table>
	</form>
  </body>
</html>
