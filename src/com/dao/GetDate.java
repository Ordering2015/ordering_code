package com.dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DateDao;

/**
 * Servlet implementation class GetDate
 */
public class GetDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DateDao dd = new DateDao();
		List < Integer > x = new ArrayList();
		int j = 0;
		String val = request.getParameter("val");
		System.out.println(val);
		PrintWriter out = response.getWriter();
		System.out.println("sucess");
		try {
			x = dd.getdate(val);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator < Integer > i = x.iterator();
		out.println("<select  name=\"dueDate\" class=\"select-style\"> ");
		while (i.hasNext()) {
			int a = i.next().intValue();
			out.println("<option value=\"" + a + "\">" + a + "</option>");
			System.out.println(a);
		}
		out.println("</select>");
			//	out.println("</div>");
		// out.println("<div class=\"select-style\"> <br />");
		// out.println("<select>");
		// while(i.hasNext())
		// { 
		// 
		// out.println("<option value=\""+i.next()+"\">"+i.next()+"</option>");
		// System.out.println(i.next());
		// }
		// out.println("</select>");
		// out.println("</div>"); 
	}
}