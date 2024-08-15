<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Applications</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h1>Job Applications</h1>
    <c:forEach var="application" items="${applications}">
        <div>
            <p>Job ID: ${application.jobId}</p>
            <p>User ID: ${application.userId}</p>
            <p>Date Applied: ${application.applicationDate}</p>
        </div>
    </c:forEach>
    <a href="adminDashboard.jsp">Back to Admin Dashboard</a>
    <a href="logout.jsp">Logout</a>
</body>
</html>
    