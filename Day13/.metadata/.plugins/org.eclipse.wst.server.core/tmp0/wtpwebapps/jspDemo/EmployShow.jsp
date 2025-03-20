<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio","root","root");
		PreparedStatement pst = connection.prepareStatement("select * from employ");
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			out.println("Employ no "+ rs.getInt("empno")+"<br");
			out.println("Employ Name"+ rs.getString("ename") +"<br");
			out.println("Gender"+rs.getString("gender")+"<br/>");
			out.println("Department "+rs.getString("dept")+"<br/>");
			out.println("Designation"+rs.getString("desig")+"<br/>");
			out.println("Basic"+rs.getDouble("Basic")+"<br/>");
			out.println("________________________________________<br/>");
		}
	%>

</body>
</html>