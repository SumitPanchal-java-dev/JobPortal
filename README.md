# Job Portal

## Description
A web application for managing job postings and applications. It includes features for user registration, job posting, application submission, and an admin dashboard.

## Features
- User Registration
- User Login
- Job Posting
- Apply for Jobs
- Admin Dashboard

## Technologies Used
- Java Servlet
- JSP
- MySQL
- HTML/CSS

## Setup Instructions
1. Clone the repository: `git clone <repository-url>`
2. Set up the database using the provided SQL scripts.
3. Update the database connection settings in the project.
4. Deploy the project to a servlet container like Apache Tomcat.

## Usage
- Access the application via `http://localhost:8080/JobPortal`
- Use the provided JSP pages for interacting with the application.



Database : 

CREATE DATABASE job_portal;
USE job_portal;

-- Create tables
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    role ENUM('user', 'employer', 'admin') NOT NULL
);

CREATE TABLE jobs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    location VARCHAR(100),
    company VARCHAR(100),
    salary DECIMAL(10, 2),
    posted_date DATE,
    employer_id INT,
    FOREIGN KEY (employer_id) REFERENCES users(id)
);

CREATE TABLE applications (
    id INT AUTO_INCREMENT PRIMARY KEY,
    job_id INT,
    user_id INT,
    application_date DATE,
    FOREIGN KEY (job_id) REFERENCES jobs(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE admins (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
