<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Post Job</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h1>Post a Job</h1>
    <form action="postJob" method="post">
        <label>Title:</label>
        <input type="text" name="title" required><br>
        <label>Description:</label>
        <textarea name="description" required></textarea><br>
        <label>Location:</label>
        <input type="text" name="location"><br>
        <label>Company:</label>
        <input type="text" name="company"><br>
        <label>Salary:</label>
        <input type="text" name="salary"><br>
        <input type="hidden" name="employerId" value="<%= session.getAttribute("user").getId() %>">
        <input type="submit" value="Post Job">
    </form>
    <a href="viewJobs.jsp">Back to Job Listings</a>
</body>
</html>
