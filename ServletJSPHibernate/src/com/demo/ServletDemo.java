package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "The first servlet", urlPatterns = { "/ServletDemoPath" })
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	response.setContentType("text/html");
	//	System.out.println("Hello from the servlet.");
	//	PrintWriter writer = response.getWriter();
	//	writer.println("<H3>Text goes here</H3>");
	//	String userName = request.getParameter("userName");
	//	writer.println("Hello, " + userName);
	//}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Hello from the servlet.");
		PrintWriter writer = response.getWriter();
		writer.println("<H3>Text goes here</H3>");
		
		
		String userName = request.getParameter("userName");
		writer.println("Hello (from the post method), " + userName);
		
		// ƒо этого места все правильно работает.
		Hibernating ob = new Hibernating(userName);
		ob.doSave();
	}

}
