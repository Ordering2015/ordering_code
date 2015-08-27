package com.dao1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustDao;
import com.dao.CustDaoService;

import org.tempuri.ProductClass;



/**
 * Servlet implementation class ProductClient
 */
@WebServlet("/ProductClient")
public class ProductClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustDaoService db=new CustDaoService();
		CustDao dao=db.getCustDaoPort();
		CustomerDao da=new CustomerDao();
		int id=Integer.parseInt(request.getParameter("name"));
		 HttpSession session = request.getSession();
		   
		    session.setAttribute("Name", id);
		System.out.println("id"+id);
		List<com.dao.ProductClass> ps=dao.getSProducts(id);
		List<org.tempuri.ProductClass> aps=da.getAllProducts(id);
		
		Iterator<com.dao.ProductClass> it = ps.iterator();
		com.dao.ProductClass p;
		while(it.hasNext()){
			p = it.next();
			System.out.println("selected:"+p.getProductId());
			
		}
		Iterator<ProductClass> it1 = aps.iterator();
		ProductClass p1;
		while(it1.hasNext()){
			p1 = it1.next();
			System.out.println("all:"+p1.getProductID());
			System.out.println("all:"+p1.getProductName());
			
			
		}
		
		
		List<ProductClass> sl=new ArrayList<ProductClass>();
		List<ProductClass> nsl=new ArrayList<ProductClass>();
		for(ProductClass o : aps)
		{
			int count=0;
			for(com.dao.ProductClass o1 : ps)
			{
				if(o.equals(o1
						))
				{ 
					System.out.println("entered if");
					count++;
					System.out.println("count"+count);
					break;
				}
			}
			if(count==1)
			{
				System.out.println("count: 1");
				sl.add(o);
				
			}
			else
			{
				System.out.println("count:0");
				nsl.add(o);
			}
		}
		
        /* for (Products temp : aps)
         {
        	 System.out.println("contains"+ps.contains(temp));
        	 if(ps.contains(temp))
        		 sl.add(temp);
        	 else
        		 nsl.add(temp);
         }
		*/
		
        	 
        
		System.out.println("selected"+sl);
		System.out.println("not selected"+nsl);
		
		request.setAttribute("pds",sl);
		request.setAttribute("apds",nsl);
		RequestDispatcher rd=request.getRequestDispatcher("ViewPds.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
