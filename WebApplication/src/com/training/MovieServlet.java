package com.training;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.dao.impl.MovieDAOImpl;
import com.training.entity.*;
import com.training.utils.DbConnection;

/**
 * Servlet implementation class MovieServlet
 */
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClassLoader clsLoader = Thread.currentThread().getContextClassLoader();
		
		InputStream stream = clsLoader.getResourceAsStream("jdbc.properties");
		System.out.println(stream);
	
		Connection con = DbConnection.getOracleConnection(stream);
		DAO<Movie> dao = new MovieDAOImpl(con);
		RequestDispatcher dispatcher = request.getRequestDispatcher("showMovies.jsp");
		try {
			List<Movie> movieList = dao.findAll();
			request.setAttribute("movieList", movieList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
