package com.example.business;

import java.util.List;

import com.example.bean.Student;

public interface StudentBusiness {
	
	boolean addStudent(Student student);
	
	boolean updateStudent(Student student);
	
	boolean deleteStudent(Student student);
	
	List<Student> searchStudents();
	
	Student searchStudent(String rollNo);

	boolean isStudentExist(String rollNo);
	
	boolean login(String name,String password);
}
