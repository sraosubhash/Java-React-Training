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

	<jsp:useBean id="beanAgentDao" class="com.java.agent.dao.AgentDaoImpl"/>
	<c:set var="agent" value="${beanAgentDao.searchAgentDao(param.agentid) }" />
	<form method="get" action="UpdateAgent.jsp">
	<center>
	
		Agent ID:
			<input type="number" name="agentid" value="${agent.agentid}" />
		Agent Name:
		<input type="text" name="name" value="${agent.name}" />
		Agent City :
		<input type="text" name="city" value="${agent.city}" />
		Gender :
		<input type="text" name="gender" value="${agent.gender}" />
		Marital Status :
		<input type="text" name="maritalStatus" value="${agent.maritalStatus}" />
		Premium :
		<input type="number" name="premium" value="${agent.premium}" />
		<input type="submit" value="Update Agent" />
		
	</center>
	
	</form>
	
	<c:if test="${param.agentid!= null && param.premium!=null }">
		<jsp:useBean id="beanAgent" class = "com.java.agent.model.Agent" />
		<jsp:setProperty property="*" name="beanAgent"/>
		<c:out value="${beanAgentDao.updateAgentDao(beanAgent) }"/>
		<jsp:forward page="ShowAgent.jsp" />
	</c:if>

</body>
</html>