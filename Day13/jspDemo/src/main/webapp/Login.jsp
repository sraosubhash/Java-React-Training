<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Login.jsp">
	
		<center>
		
			User Name : 
			<input type="text" name="userName"><br><br>
			Password :
			<input type="password" name="passWord"><br><br>
			<input type="submit" value="Login"><br><br>
		</center>
	
	</form>
	
	<% 
		if(request.getParameter("userName")!=null && request.getParameter("passWord")!=null){
			String user = request.getParameter("userName");
			String pwd = request.getParameter("passWord");
			if (user.equals("Brillio")&& pwd.equals("Brillio")){
		%>
			<jsp:forward page = "Menu.jsp"/>
		<%
			}else{
				out.println("Invalid Credentials");
			}
		}
	%>

</body>
</html>