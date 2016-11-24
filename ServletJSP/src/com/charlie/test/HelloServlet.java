package com.charlie.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getServlet") 
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 4544851314264862044L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get value by key
		String text = request.getParameter("text");
		String name = request.getParameter("name");
		System.out.println("name = " + name);
		System.out.println("text = " + text);
		
		List<Map<String, String>> mapList = new ArrayList<Map<String,String>>();
		Map<String, String> mapTest= new HashMap<>();
		mapList.add(mapTest);
		
		mapTest.put("name", name);
		mapTest.put("text", text);
		
		
		
		// Prepare value to view
		request.setAttribute("test", name + ":" + text);
		request.setAttribute("mapList", mapList);
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		requestDispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
