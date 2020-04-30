package com.example.bean;

public class Student {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String rollNo;
	private String name;
	private String phoneNo;
	private String emailId;

	public Student() {

	}

	public Student(long id, String rollNo, String name, String phoneNo, String emailId) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", phoneNo=" + phoneNo + ", emailId="
				+ emailId + "]";
	}
}
