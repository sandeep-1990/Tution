package com.example.app;

import java.util.List;

import com.example.bean.Student;
import com.example.business.StudentBusiness;
import com.example.businessimpl.StudentBusinessImpl;

public class StudentApp {

	StudentBusiness studentBusiness = new StudentBusinessImpl();
	
	public boolean addStudent(Student student){
		return studentBusiness.addStudent(student);
	}
	
	public List<Student> getStudents(){
		
		return studentBusiness.searchStudents();
	}
	
	
	public static void main(String[] args) {
		
		StudentApp app = new StudentApp();
		Student student = new Student();
		student.setId(1);
		student.setRollNo("002");
		student.setName("Sahil");
		student.setPhoneNo("098765432");
		student.setEmailId("sahil@gmail.com");
	
		/**
		 * Add New Student
		 */
//		boolean b = app.addStudent(student);
		
//		System.out.println("New Student Add Result : "+ b);
	
		/**
		 * Search All Students
		 */
		
		List<Student> students = app.getStudents();
	
		for(Student student2 : students){
			System.out.println(student2);
		}
	
	}
	
	
	
}
