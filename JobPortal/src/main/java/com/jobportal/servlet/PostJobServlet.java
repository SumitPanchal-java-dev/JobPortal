package com.jobportal.servlet;

import com.jobportal.dao.JobDAO;
import com.jobportal.model.Job;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

@WebServlet("/postJob")
public class PostJobServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String location = request.getParameter("location");
        String company = request.getParameter("company");
        double salary = Double.parseDouble(request.getParameter("salary"));
        int employerId = Integer.parseInt(request.getParameter("employerId"));

        Job job = new Job();
        job.setTitle(title);
        job.setDescription(description);
        job.setLocation(location);
        job.setCompany(company);
        job.setSalary(salary);
        job.setPostedDate(new Date());
        job.setEmployerId(employerId);

        try {
            JobDAO jobDAO = new JobDAO();
            jobDAO.postJob(job);
            response.sendRedirect("viewJobs.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
