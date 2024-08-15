package com.jobportal.model;

import java.util.Date;

public class Application {
	private int id;
	private int jobId;
	private int userId;
	private Date applicationDate;

	// Constructors, getters, and setters
	public Application() {
		super();
	}

	public Application(int id, int jobId, int userId, Date applicationDate) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.userId = userId;
		this.applicationDate = applicationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

}
