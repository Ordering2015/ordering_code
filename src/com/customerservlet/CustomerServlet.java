package com.customerservlet;

import java.beans.XMLEncoder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.AddressBean;
import com.customer.CustomerBean;
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public String setCustomerValues(HttpServletRequest request) {
		CustomerBean cb = new CustomerBean();
		cb.setBillingAddress(setBillingAddressValues(request));
		cb.setEmailId(request.getParameter("Email"));
		cb.setFirstName(request.getParameter("firstName"));
		cb.setLastName(request.getParameter("lastName"));
		cb.setPaymentMethod(request.getParameter("paymentmethod"));
		cb.setPhoneNo(Long.parseLong(request.getParameter("phone")));
		cb.setServiceAddress(setServiceAddressValues(request));
		cb.setStatus("Provision Ready");
		cb.setType("Residential");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		XMLEncoder xmlEncoder = new XMLEncoder(baos);
		xmlEncoder.writeObject(cb);
		xmlEncoder.close();
		String xml = baos.toString();
		return xml;
	}

	public String setBillingAddressValues(HttpServletRequest request) {
		AddressBean ab1 = new AddressBean();
		ab1.setAddressLine1((String) request.getParameter("BAddressLine1"));
		ab1.setAddressLine2((String) request.getParameter("BAddressLine2"));
		ab1.setCity((String) request.getParameter("BCity"));
		ab1.setStateCode((String) request.getParameter("BState"));
		ab1.setZipCode((String) request.getParameter("BZipCode"));
		String bAddress = ab1.getAddressLine1() + " " + ab1.getAddressLine2()
				+ " " + ab1.getCity() + " " + ab1.getStateCode() + " "
				+ ab1.getZipCode();
		return bAddress;

	}

	public String setServiceAddressValues(HttpServletRequest request) {
		AddressBean ab = new AddressBean();
		ab.setAddressLine1((String) request.getParameter("SAddressLine1"));
		ab.setAddressLine2((String) request.getParameter("SAddressLine2"));
		ab.setCity((String) request.getParameter("SCity"));
		ab.setStateCode((String) request.getParameter("SState"));
		ab.setZipCode((String) request.getParameter("SZipCode"));
		String sAddress = ab.getAddressLine1() + " " + ab.getAddressLine2()
				+ " " + ab.getCity() + " " + ab.getStateCode() + " "
				+ ab.getZipCode();
		return sAddress;
	}

	/*
	 * public OrderBean setOrderValues(HttpServletRequest request) { OrderBean
	 * ob = new OrderBean();
	 * //ob.setCustomerId(Integer.parseInt(request.getParameter("")));
	 * ob.setServiceId(Integer.parseInt(request.getParameter("")));
	 * //ob.setOrderId(Integer.parseInt(request.getParameter("")));
	 * ob.setProductid(Integer.parseInt(request.getParameter("")));
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	 * java.util.Date date = null; try { date =
	 * sdf.parse(request.getParameter(" ")); } catch (ParseException pe) {
	 * System.out.println(pe); } ob.setDueDate(date);
	 * ob.setOrderStatus("Provision Ready");
	 * System.out.println(ob.getCustomerId() + " " + ob.getServiceId() + " " +
	 * ob.getOrderId() + " " + ob.getProductid() + " " + ob.getDueDate() + " " +
	 * ob.getOrderStatus()); return ob; }
	 */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// setOrderValues(request);
		System.out.println(setCustomerValues(request));
		String[] check=request.getParameterValues("cb");
		
		for(int i=0; i<check.length; i++)
       {
            System.out.println(check[i]);
        }
		String dateMonth=request.getParameter("mySelect");
		String datedate=request.getParameter("dueDate");
		System.out.println(dateMonth);
		System.out.println(datedate);
	}

}
