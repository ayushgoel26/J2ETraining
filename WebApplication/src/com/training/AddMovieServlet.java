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
import com.training.entity.DAO;
import com.training.entity.Movie;
import com.training.utils.DbConnection;

/**
 * Servlet implementation class AddMovieServlet
 */
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String movieName= request.getParameter("movieName");
		String movieId= request.getParameter("movieId");
		String movieDirector= request.getParameter("movieDirector");
		String movieGenre= request.getParameter("movieGenre");
		String movieRating= request.getParameter("movieRating");
		
//		request.setAttribute("movieName", movieName);
//		request.setAttribute("movieId", movieId);
//		request.setAttribute("movieDirector", movieDirector);
//		request.setAttribute("movieGenre", movieGenre);
//		request.setAttribute("movieRating", movieRating);
		
		ClassLoader clsLoader = Thread.currentThread().getContextClassLoader();
		
		InputStream stream = clsLoader.getResourceAsStream("jdbc.properties");
		System.out.println(stream);
	
		Connection con = DbConnection.getOracleConnection(stream);
		DAO<Movie> dao = new MovieDAOImpl(con);
		int success = 0;
		try {
			 success = dao.add(new Movie(Long.parseLong(movieId), movieName, movieDirector, movieGenre, Double.parseDouble(movieRating)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (success > 0 ) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("AddMovie.jsp");

			dispatcher.forward(request, response);
		}
		
	}

}
