package com.example.businessimpl;

import java.util.List;

import com.example.bean.Student;
import com.example.business.StudentBusiness;
import com.example.dao.StudentDao;
import com.example.daoimpl.StudentDaoImpl;

public class StudentBusinessImpl implements StudentBusiness {

	StudentDao studentDao = new StudentDaoImpl(); 
	
	@Override
	public boolean addStudent(Student student) {
		boolean b = studentDao.isStudentExist(student.getRollNo());
		System.out.println("Business : "+ b);
		if(!b){
			return studentDao.addStudent(student);
		}else{
			return false;
		}
		
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> searchStudents() {
		return studentDao.searchStudents();
	}

	@Override
	public Student searchStudent(String rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isStudentExist(String rollNo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean login(String name, String password) {
		return studentDao.login(name, password);
	}
}
