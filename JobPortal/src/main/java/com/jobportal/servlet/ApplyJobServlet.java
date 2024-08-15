package com.jobportal.servlet;

import com.jobportal.dao.ApplicationDAO;
import com.jobportal.model.Application;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

@WebServlet("/applyJob")
public class ApplyJobServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int jobId = Integer.parseInt(request.getParameter("jobId"));
        int userId = Integer.parseInt(request.getParameter("userId"));

        Application application = new Application();
        application.setJobId(jobId);
        application.setUserId(userId);
        application.setApplicationDate(new Date());

        try {
            ApplicationDAO applicationDAO = new ApplicationDAO();
            applicationDAO.applyJob(application);
            response.sendRedirect("viewJobs.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
