<%-- 
	Name: Jennifer Byrne
	Date: March 6, 2020
	Notes: ENTD481 Week 5 Assignment - This is the JSP that corresponds to DateBean, which displays the current date.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%-- JSP tag 'useBean' to invoke the Java Bean - class attribute specifies the path to the appropriate Java Bean --%>    
<jsp:useBean id="datebean" scope="session" class="week5bean.DateBean" />

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Today's date</title>
	</head>
	
	<body>
		<%-- JSP tag 'getProperty' inserts the value of the property "date", which is retrieved from the Java Bean--%>
		<p>Today's date is <jsp:getProperty property="date" name="datebean" /></p>
	</body>
	
</html>