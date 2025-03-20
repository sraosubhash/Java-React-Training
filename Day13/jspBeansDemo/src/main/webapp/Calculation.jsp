<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Calculation.jsp" method="get">
	
		<center>
			First number :
			<input type="number" name="firstNo" ><br><br>
			Second number :
			<input type="number" name="secondNo" ><br><br>

			<input type="submit" value="Calculation" ><br><br>
			
		</center>
		
		<%
			if (request.getParameter("firstNo")!=null && request.getParameter("secondNo")!=null){
				
		%>
		
			<jsp:useBean id="beanCalculation" class="com.java.beans.Calculation"/>
			<jsp:setProperty property="*" name ="beanCalculation" />
			Sum is : <b><%=beanCalculation.sum() %></b><br>
			Sub is : <b><%=beanCalculation.sub() %></b><br>
			Mul is : <b><%=beanCalculation.mul() %></b><br>
		
		<%
			}
		%>
		
	</form>

</body>
</html>