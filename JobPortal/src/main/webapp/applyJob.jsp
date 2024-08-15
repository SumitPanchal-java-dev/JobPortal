<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Apply for Job</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h1>Apply for Job</h1>
    <form action="applyJob" method="post">
        <input type="hidden" name="jobId" value="<%= request.getParameter("jobId") %>">
        <input type="hidden" name="userId" value="<%= session.getAttribute("user").getId() %>">
        <input type="submit" value="Apply">
    </form>
    <a href="viewJobs.jsp">Back to Job Listings</a>
</body>
</html>
