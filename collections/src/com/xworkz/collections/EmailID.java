package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailID {
	public static void main(String[] args) {
		Collection<String> emailids = new ArrayList<String>();
		emailids.add("sahanak.xworkz@gmail.com");
		emailids.add("sahanakcse.rymec@gmail.com");
		emailids.add("sahanak.xworkz@gmail.com");

		Collection<String> tempemailids = new ArrayList<String>();
		Iterator<String> Iterator = emailids.iterator();
		while (Iterator.hasNext()) {
			String emailid = Iterator.next();
			System.out.println("email id" + emailids);
			if (tempemailids.contains(emailid)) {
				System.out.println("duplicate emailids id :" + emailid);
			} else {
				System.out.println("added" + emailid);
				tempemailids.add(emailid);
			}

		}
		System.out.println("tempemailid size" + tempemailids.size());
		emailids.clear();
		Iterator<String> tempIterator = tempemailids.iterator();
		while (tempIterator.hasNext()) {
			emailids.add(tempIterator.next());
		}
		System.out.println("size of email" + emailids.size());
	}

}
