package com.controller;
import javax.xml.ws.Endpoint;

import com.dao.CustDao;

import com.dao1.CustClient;
import com.dao1.CustomerDao;
import com.model.OrderModel;

public class CustomerController {
	public static void main( String[] args)
	
	{
		
		//vzmodel a = new vzmodel();
		CustomerDao hd= new CustomerDao();
		String url1="http://192.168.0.220:1004/CustDao";
		Endpoint.publish(url1,hd );
		System.out.println("Service Started");
	}	
}
