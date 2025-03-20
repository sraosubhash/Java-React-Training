<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="3" align="center">
<tr>
    <th>Employ No</th>
    <th>Employ Name</th>
    <th>Employ Gender</th>
    <th>Department</th>
    <th>Designation</th>
    <th>Basic</th>
    <th>Update</th>
    <th>Delete</th>

</tr>

<jsp:useBean id="beanEmployDao" class="com.java.hib.dao.EmployDaoImpl"/>
<c:set var="employList" value="${beanEmployDao.showEmployDao()}"/>
<c:forEach var="employ" items="${employList}">
	<tr>
		<td>${employ.empno}</td>
		<td>${employ.ename}</td>
		<td>${employ.gender}</td>
		<td>${employ.dept}</td>
		<td>${employ.desig}</td>
		<td>${employ.basic}</td>
		<td><a href=UpdateEmploy.jsp?empno=${employ.empno}>Update</a></td>
 		<td><a href=DeleteEmploy.jsp?empno=${employ.empno}>Delete</a></td>

</c:forEach>
</table>
<hr/>
<a href = "AddEmploy.jsp">Add Employ</a>

</body>
</html>