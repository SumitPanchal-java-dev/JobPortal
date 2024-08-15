package com.jobportal.dao;

import com.jobportal.model.Job;
import com.jobportal.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobDAO {
    public void postJob(Job job) throws SQLException {
        String sql = "INSERT INTO jobs (title, description, location, company, salary, posted_date, employer_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, job.getTitle());
            stmt.setString(2, job.getDescription());
            stmt.setString(3, job.getLocation());
            stmt.setString(4, job.getCompany());
            stmt.setDouble(5, job.getSalary());
            stmt.setDate(6, new java.sql.Date(job.getPostedDate().getTime()));
            stmt.setInt(7, job.getEmployerId());
            stmt.executeUpdate();
        }
    }

    public List<Job> getAllJobs() throws SQLException {
        List<Job> jobs = new ArrayList<>();
        String sql = "SELECT * FROM jobs";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setLocation(rs.getString("location"));
                job.setCompany(rs.getString("company"));
                job.setSalary(rs.getDouble("salary"));
                job.setPostedDate(rs.getDate("posted_date"));
                job.setEmployerId(rs.getInt("employer_id"));
                jobs.add(job);
            }
        }
        return jobs;
    }
}
