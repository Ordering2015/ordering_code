package com.dao1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AddressClass;
import com.dao.CustDao;
import com.dao.CustDaoService;



/**
 * Servlet implementation class AddrClient
 */
@WebServlet("/AddrClient")
public class AddrClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddrClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustDaoService db=new CustDaoService();
		CustDao dao=db.getCustDaoPort();
		int a=Integer.parseInt(request.getParameter("id"));
		
		
		List<com.dao.AddressClass> adls1=new ArrayList<AddressClass>();
		adls1=dao.getAddress(1);
		Iterator<AddressClass> it = adls1.iterator();
		com.dao.AddressClass p;
		while(it.hasNext()){
			p = it.next();
			System.out.println("address id" +p.getAddressId());
			System.out.println("line1"+p.getAddLine1());
			System.out.println("line2"+p.getAddLine2());
			System.out.println("city"+p.getCity());
			System.out.println("state"+p.getState());
			System.out.println("scode"+p.getStateCode());
			System.out.println("zcode"+p.getZipcode());
			
		}
		
		//System.out.println(d);
		HttpSession ses=request.getSession(true);
		ses.setAttribute("id1",a);
		request.setAttribute("name", adls1);
		request.getRequestDispatcher("adddisplay.jsp").forward(request, response);
	}

	

}
