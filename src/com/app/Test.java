package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		Address ad=new Address();
		ad.setAdid(2);
		ad.setLoc("Hyd");
		Employee e=new Employee();
		e.setEmpid(5);
		e.setEmpname("Rohit");
		e.setAddr(ad);

		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(e);
			System.out.println(json);
			
		} catch (Exception e2) {
			
		}
	}
}
