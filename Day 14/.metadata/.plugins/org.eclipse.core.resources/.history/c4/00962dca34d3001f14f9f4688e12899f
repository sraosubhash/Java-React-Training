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
	<form method="get" action="AddAgent.jsp">
		<center>
			Agent Id :
			<input type="number" name="agentid" /> <br/><br/>
			Agent Name :
			<input type="text" name="name" /> <br/><br/>
			City :
			<input type="text" name="city" /> <br/><br/>
			Gender :
			<select name="gender">
				<option value="MALE">MALE</option>
				<option value="FEMALE">FEMALE</option>
			</select> <br/><br/>
			
			Marital Status :
<select name="maritalstatus">
    <option value="0">Unmarried</option>
    <option value="1">Married</option>
</select> <br/>
			
			Premium :
			<input type="number" name="premium" /> <br/><br/>
			<input type="submit" value="Add Agent" />
		</center>
	</form>
	<c:if test="${param.agentid !=null && param.premium !=null}">
		<jsp:useBean id="beanAgent" class="com.java.agent.model.Agent" />
		<jsp:setProperty property="*" name="beanAgent"/>
		<jsp:useBean id="beanAgentDao" class="com.java.agent.dao.AgentDaoImpl" />
		<c:out value="${beanAgentDao.addAgentDao(beanAgent)}" />
		<jsp:forward page="ShowAgent.jsp" />
	</c:if>
</body>
</html>