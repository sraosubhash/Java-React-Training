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
    <th>Agent ID</th>
    <th>Agent Name</th>
    <th>City</th>
    <th>Agent Gender</th>
    <th>Marital Status</th>
    <th>Premium</th>
    <th>Update</th>
    <th>Delete</th>

</tr>

<jsp:useBean id="beanAgentDao" class="com.java.agent.dao.AgentDaoImpl"/>
<c:set var="agentList" value="${beanAgentDao.showAgentDao()}"/>
<c:forEach var="agent" items="${agentList}">
	<tr>
		<td>${agent.agentid}</td>
		<td>${agent.name}</td>
		<td>${agent.city}</td>
		<td>${agent.gender}</td>
		<td>${agent.maritalStatus}</td>
		<td>${agent.premium}</td>
		<td><a href=UpdateAgent.jsp?agentid=${agent.agentid}>Update</a></td>
 		<td><a href=DeleteAgent.jsp?agentid=${agent.agentid}>Delete</a></td>

</c:forEach>
</table>
<hr/>
<a href = "AddAgent.jsp">Add Agent</a>

</body>
</html>