package com.tcs.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/counter")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookieServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter(); //cookies: read, incremented, set
		int count = 0;
		boolean flag = false;
		Cookie c = null;

		Cookie cookies[] = request.getCookies();
		for (int i =0;i<cookies.length;i++) {
			c=cookies[i];
			if (c.getName().equals("visits")) {
				flag = true;
				break;

			}

		}
		if (flag) {//flag = true means visits cookie is found only after first visit
			count = Integer.parseInt(c.getValue());
			count++;
			c.setValue(count+"");
			response.addCookie(c);
		}
		else
		{
			Cookie cookie = new Cookie("visits", count + ""); // here two values are string. count is converted to string as
			// type concatation
			response.addCookie(cookie); //response header
			
		}

		
	
		out.println("<h1>You have refreshed the page " + count + "  times</h1>");

		//out.println(count = count + 1); // it will initial every time & give the same result.
		// cookies will have to store the value, the next request it will get
		// incremented for counter.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
