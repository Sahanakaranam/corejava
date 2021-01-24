package com.xworkz.contract;

import com.xworkz.contract.implement.Contract;
import com.xworkz.contract.implement.RedBusImpl;
import com.xworkz.contract.implement.Security;

public class Tester {

	public static void main(String[] args) {
		RedBusImpl impl = new RedBusImpl();
		impl.open();
		impl.close();
		impl.maxBooking();
		Security security=new RedBusImpl();
		Contract crt=new RedBusImpl();
		Object obj=new RedBusImpl();
		System.out.println(obj.hashCode());
		
	}

}
