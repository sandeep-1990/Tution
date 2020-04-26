package com.example.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.bean.Student;
import com.example.connectionfactory.ConnectionFactory;
import com.example.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

	Connection connection;
	PreparedStatement pst;
	ResultSet rst;

	@Override
	public boolean addStudent(Student student) {
		boolean b = false;
		connection = ConnectionFactory.createConnection();
		try {
			pst = connection.prepareStatement("insert into student values(?,?,?,?,?)");
			pst.setInt(1, 0);
			pst.setString(2, student.getRollNo());
			pst.setString(3, student.getName());
			pst.setString(4, student.getPhoneNo());
			pst.setString(5, student.getEmailId());
			int no = pst.executeUpdate();
			if (no > 0) {
				b = true;
			}
			return b;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			ConnectionFactory.closeConnection();
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
		List<Student> students = new ArrayList<Student>();
		Student student = null;
		connection = ConnectionFactory.createConnection();
		try {
			pst = connection.prepareStatement("select * from student");
			rst = pst.executeQuery();
			while (rst.next()) {
				student = new Student();
				student.setId(rst.getInt(1));
				student.setRollNo(rst.getString(2));
				student.setName(rst.getString(3));
				student.setPhoneNo(rst.getString(4));
				student.setEmailId(rst.getString(5));
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Student searchStudent(String rollNo) {
		Student student = null;
		connection = ConnectionFactory.createConnection();
		try {
			pst = connection.prepareStatement("select * from student where rollno = ?");
			pst.setString(1, rollNo);
			rst = pst.executeQuery();
			while (rst.next()) {

			}
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean isStudentExist(String rollNo) {
		boolean status = false;
		connection = ConnectionFactory.createConnection();
		try {
			pst = connection.prepareStatement("select * from student where rollno = ?");
			pst.setString(1, rollNo);
			rst = pst.executeQuery();
			while (rst.next()) {
				status = true;
			}
			System.out.println("dao : "+ status);
			return status;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean login(String name, String password) {
		boolean status = false;
		connection = ConnectionFactory.createConnection();
		try {
			pst = connection.prepareStatement("select * from login_tbl where name = ? and password = ?");
			pst.setString(1, name);
			pst.setString(2, password);
			rst = pst.executeQuery();
			while (rst.next()) {
				status = true;
			}
			System.out.println("dao : "+ status);
			return status;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
