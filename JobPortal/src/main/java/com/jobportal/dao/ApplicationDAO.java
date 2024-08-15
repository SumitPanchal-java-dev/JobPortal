package com.jobportal.dao;

import com.jobportal.model.Application;
import com.jobportal.util.DBConnection;

import java.sql.*;

public class ApplicationDAO {
    public void applyJob(Application application) throws SQLException {
        String sql = "INSERT INTO applications (job_id, user_id, application_date) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, application.getJobId());
            stmt.setInt(2, application.getUserId());
            stmt.setDate(3, new java.sql.Date(application.getApplicationDate().getTime()));
            stmt.executeUpdate();
        }
    }
}
