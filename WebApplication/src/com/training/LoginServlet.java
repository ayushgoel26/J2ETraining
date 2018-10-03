package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname= request.getParameter("userName");
		String pword= request.getParameter("passWord");
		
		boolean isValidUser = false;
		
		String errorMessage= "Invalid Username or Password!";
		
		if(uname.equals("India") && pword.equals("india")){
			isValidUser = true;
		}
		
		request.setAttribute("errMsg", errorMessage);
		RequestDispatcher dispatcher;
		
		if(isValidUser){
			dispatcher = request.getRequestDispatcher("success.jsp");
		}else{
			dispatcher = request.getRequestDispatcher("failure.jsp");
		}
	
		dispatcher.forward(request, response);
		
	}

}
