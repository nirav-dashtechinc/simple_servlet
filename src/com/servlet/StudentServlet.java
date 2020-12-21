package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.StudentDAO;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("students", new StudentDAO().findAll());

		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/view/student/index.jsp");
		rd.include(request, response);
	}
}
