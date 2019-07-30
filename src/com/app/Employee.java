package com.app;

public class Employee {
	
	private String empname;
	private int empid;
	
	private Address addr;

	public Employee() {
		super();
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + "]";
	}
	
	
	

}
