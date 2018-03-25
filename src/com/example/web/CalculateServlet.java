package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculateServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String inp=request.getParameter("number");
		String result=FactorialOfNumber.calculateFactorial(Integer.parseInt(inp));
		request.setAttribute("answer",result);
		request.setAttribute("input",inp);
		PrintWriter out=response.getWriter();
		RequestDispatcher view=request.getRequestDispatcher("result.jsp");
		view.include(request,response);
	}
}
