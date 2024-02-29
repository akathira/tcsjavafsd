package com.tcs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //response.getWriter().append("Served at: ").append(request.getContextPath());
		
		  PrintWriter out = response.getWriter(); 
		  out.println("One two three...."); 
		  //Response goes to the clien*/
		  
		
		/*String[] data = "One Two Three....".split("");
		for(String d: data)
		{
			out.println(d);
		}*/
		  
		  PrintWriter output= response.getWriter();
		  String query = request.getQueryString();
		  out.println(query);
		  String array[] = query.split("=");
		  int n = Integer.parseInt(array[1]); //num=6 converts to int.
		  int i=1;
		  int fact=1;
		  while(i<=5)
		  {
			  fact *=i;
			  i++;
			  
		  }
		  out.println(fact);
		  
		  
		  
		 				
	}

}
