package com.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.bean.Student;
import com.example.dao.StudentDao;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = new Student();
		student.setName(request.getParameter("name"));
		student.setRollNo(request.getParameter("rollNo"));
		student.setPhoneNo(request.getParameter("phone"));
		student.setEmailId(request.getParameter("email"));
		
		StudentDao studentDao = new StudentDao();
		boolean b = studentDao.addStudent(student);
		if(b){
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			request.setAttribute("status", "success");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			request.setAttribute("status", "failed");
			dispatcher.forward(request, response);
		}
	}

}
