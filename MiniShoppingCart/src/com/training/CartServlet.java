package com.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		String 	selectedBook = request.getParameter("bookSelect");
		String selectedPhone = request.getParameter("phone") ;

		
		if(selectedBook != null) {
			System.out.println("Selected Book: " + selectedBook);
			session.setAttribute("book", selectedBook);

		}
		if(selectedPhone != null) {
			System.out.println("Selected Phone: " + selectedPhone);
			session.setAttribute("phone", selectedPhone);

		}
		
		String[] selectedCpns = request.getParameterValues("coupon") ;
		if(selectedCpns!=null) {
		int i = 0;
		for (String selectedCpn : selectedCpns){
			session.setAttribute("coupon"+i, selectedCpn);
			System.out.println("Selected Coupon" + i+": " + selectedCpn);
			i++;
		}
		session.setAttribute("items",i);

		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("FinalCart.jsp");
		dispatcher.forward(request, response);
	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
