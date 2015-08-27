package com.dao1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CustDao;
import com.dao.CustDaoService;



/**
 * Servlet implementation class ClientServ1
 */
@WebServlet("/ClientServ1")
public class ClientServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServ1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustDaoService db=new CustDaoService();
		CustDao dao=db.getCustDaoPort();
		//CustomerDao dao=new CustomerDao();
		String type1=request.getParameter("type2");
		System.out.println(type1);
		int a=(int) request.getSession(false).getAttribute("id1");
		System.out.println(a);
		int res=dao.setPMethod(a,type1);
	     System.out.println("setMethodStatus:"+res);
	     request.setAttribute("name", type1);
		if(res==1)
		{
	     request.getRequestDispatcher("Success.jsp").forward(request, response);
		}
		else
		{
			 request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}
	}
	

}
