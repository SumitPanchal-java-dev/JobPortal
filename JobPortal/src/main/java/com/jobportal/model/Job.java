package com.jobportal.model;

import java.util.Date;

public class Job {
	private int id;
	private String title;
	private String description;
	private String location;
	private String company;
	private double salary;
	private Date postedDate;
	private int employerId;

	// Constructors, getters, and setters
	public Job() {
		super();
	}

	public Job(int id, String title, String description, String location, String company, double salary,
			Date postedDate, int employerId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.location = location;
		this.company = company;
		this.salary = salary;
		this.postedDate = postedDate;
		this.employerId = employerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

}
