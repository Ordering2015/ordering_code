package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.tempuri.ArrayOfProductClass;
import org.tempuri.GetAllProducts;
import org.tempuri.GetAllProductsSoap;
import org.tempuri.ProductClass;

import com.dao.DateDao;

public class Dummy {
	public static void main(String args[]) throws SQLException {

//		DateDao dd = new DateDao();
//		List x = new ArrayList();
//		x = dd.getdate("March");
//		Iterator i = x.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//				}
		String val = "3";
		GetAllProducts a = new GetAllProducts();
		GetAllProductsSoap b = a.getGetAllProductsSoap();
		ArrayOfProductClass s = b.getProductsByServiceID(val);
		List<ProductClass> p = s.getProductClass();
		for (ProductClass l : p) {
			System.out.println(l.getProductDesc());
			System.out.println(l.getProductID());
			System.out.println(l.getProductName());
			System.out.println(l.getProdEffDate());
			System.out.println(l.getProdEndDate());
			}
	}
}
