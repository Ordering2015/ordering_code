package com.dao1;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AddressClass;
import com.dao.CustDao;
import com.dao.CustDaoService;

/**
 * Servlet implementation class AddressServ
 */
@WebServlet("/AddressServ")
public class AddressServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustDaoService db=new CustDaoService();
		CustDao dao=db.getCustDaoPort();
		//CustomerDao dao=new CustomerDao();
		String a1=request.getParameter("a1");
		String a2=request.getParameter("a2");
		String a3=request.getParameter("a3");
		String a4=request.getParameter("a4");
		String a5=request.getParameter("a5");
		String a6=request.getParameter("a6");
		System.out.println("edited addressa1"+a1);
		System.out.println("edited addressa2"+a2);
//		List<AddressClass> ls=new ArrayList<AddressClass>();
		AddressClass temp =new AddressClass();
		temp.setAddLine1(a1);
		temp.setAddLine2(a2);
		temp.setCity(a3);
		temp.setState(a4);
		temp.setStateCode(a5);
		temp.setZipcode(Integer.parseInt(a6));
		
		int a=(int) request.getSession(false).getAttribute("id1");
		System.out.println("id1"+a);
		int stat=dao.setAddressMethod(a,temp);
		System.out.println("stat"+stat);
		if(stat==1){
		request.getRequestDispatcher("ASuccess.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}
		
	}

}		
