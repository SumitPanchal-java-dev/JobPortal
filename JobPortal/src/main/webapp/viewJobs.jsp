<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Jobs</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h1>Job Listings</h1>
    <c:forEach var="job" items="${jobs}">
        <div>
            <h2>${job.title}</h2>
            <p>${job.description}</p>
            <p>${job.location}</p>
            <p>${job.company}</p>
            <p>${job.salary}</p>
            <a href="applyJob.jsp?jobId=${job.id}">Apply</a>
        </div>
    </c:forEach>
    <a href="postJob.jsp">Post a New Job</a>
    <a href="logout.jsp">Logout</a>
</body>
</html>
>