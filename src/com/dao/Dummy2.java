package com.dao;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.customer.CustomerBean;

public class Dummy2 {
	private static final String FILE_NAME = "jaxb-emp.xml";

	 private static CustomerBean jaxbXMLToObject() {
	        try {
	            JAXBContext context = JAXBContext.newInstance(CustomerBean.class);
	            Unmarshaller un = context.createUnmarshaller();
	            CustomerBean emp = (CustomerBean) un.unmarshal(new File(FILE_NAME));
	            return emp;
	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 
	 
	    private static void jaxbObjectToXML(CustomerBean emp) {
	 
	        try {
	            JAXBContext context = JAXBContext.newInstance(CustomerBean.class);
	            Marshaller m = context.createMarshaller();
	            //for pretty-print XML in JAXB
	            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	             // Write to System.out for debugging
	             m.marshal(emp, System.out);
	             // Write to File
	            m.marshal(emp, new File(FILE_NAME));
	        } catch (JAXBException e) {
	            e.printStackTrace();
	        }
	    }
	public static void main(String args[])
	{
	CustomerBean cb = new CustomerBean();
	
	cb.setEmailId("Email");
	cb.setFirstName("firstName");
	cb.setLastName("lastName");
	cb.setPaymentMethod("paymentmethod");
	cb.setPhoneNo(453545345);
	cb.setServiceAddress("request");
	cb.setStatus("Provision Ready");
	cb.setType("Residential");
//	ByteArrayOutputStream baos = new ByteArrayOutputStream();
//	XMLEncoder xmlEncoder = new XMLEncoder(baos);
//	xmlEncoder.writeObject(cb);
//	xmlEncoder.close();
//	String xml = baos.toString();
	jaxbObjectToXML(cb);
	CustomerBean empFromFile = jaxbXMLToObject();
    System.out.println(empFromFile.toString());
}
}