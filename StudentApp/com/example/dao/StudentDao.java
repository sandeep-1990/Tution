package com.example.dao;

import java.util.List;

import com.example.bean.Student;

public interface StudentDao {

	boolean addStudent(Student student);
	
	boolean updateStudent(Student student);
	
	boolean deleteStudent(Student student);
	
	List<Student> searchStudents();
	
	Student searchStudent(String rollNo);

}
