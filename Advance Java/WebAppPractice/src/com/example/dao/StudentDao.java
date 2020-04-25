package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.bean.Student;
import com.example.connectionfactory.ConnectionFactory;

public class StudentDao {

	
	Connection connection;
	PreparedStatement pst;
	ResultSet rst;

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

	
	
}
