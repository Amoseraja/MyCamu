package com.mycamuproject.dto;

public class addstudentdto {
	private String email;
    
    private String dob;  // Changed to String to store date of birth properly
    
    private String department;  // Corrected the spelling
    
    private String semester;  // Changed to lowercase
    private String password;
    private String gender;
    
    private String courseName;  // 
    private String role;
	 
	 private int attendce;
	 private String name;
	 private String username;  // Changed to lowercase 'u' to follow naming conventions
	 private Long univereid;
	 private Long salary;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAttendce() {
		return attendce;
	}
	public void setAttendce(int attendce) {
		this.attendce = attendce;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getUnivereid() {
		return univereid;
	}
	public void setUnivereid(Long univereid) {
		this.univereid = univereid;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
