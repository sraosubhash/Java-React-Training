<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
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
 
<form method="get" action="EmploySearch.jsp">
<center>
Employ No :
<input type="number" name="empno" /><br><br>
<input type="submit" name="search" /><br></br>
 
</center>
 
</form>
<%
if(request.getParameter("empno")!=null){
	int empno=Integer.parseInt(request.getParameter("empno"));
	 Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio", "root", "root");
	PreparedStatement pst=con.prepareStatement("select * from Employ where empno = ?");
	pst.setInt(1, empno);
	ResultSet rs=pst.executeQuery();
	if(rs.next()){
		out.println("Employ No "+rs.getInt("empno")+"<br/>");
		out.println("Employ Name "+rs.getString("ename")+"<br/>");
		out.println("Gender  "+rs.getString("gender")+"<br/>");
		out.println("Dept  "+rs.getString("dept")+"<br/>");
		out.println("Desig  "+rs.getString("desig")+"<br/>");
		out.println("Basic  "+rs.getDouble("basic")+"<br/>");
	}
	else{
		out.println("Record Not Found ....");
	}
	
}
 
%>
 
</body>
</html>