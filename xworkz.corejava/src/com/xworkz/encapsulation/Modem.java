package com.xworkz.encapsulation;

public class Modem {
private	String brand;
private	int price;
private	int noOfPorts;
private	int password;
private	String username;
	
	public Modem(String brand, int price, int noOfPorts, int password, String username) {
		super();
		this.brand = brand;
		this.price = price;
		this.noOfPorts = noOfPorts;
		this.password = password;
		this.username = username;
	}
	public void switchOModem() {
		System.out.println("modem switched on");
		
	}
	public void switchOf() {
		System.out.println("switch off modem");
	}

}
