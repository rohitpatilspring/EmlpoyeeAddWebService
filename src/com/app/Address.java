package com.app;

public class Address {

	private int adid;
	private String loc;
	public Address() {
		super();
	}
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Address [adid=" + adid + ", loc=" + loc + "]";
	}
	
	
	
	
}
