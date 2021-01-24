package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class PhoneNumber {
	public static void main(String args[]) {
		Collection<Long> nums = new ArrayList();
		nums.add(8792479057l);
		nums.add(9449712137l);
		nums.add(9035444701l);
		nums.add(9449791332l);
		nums.add(1234567899l);
		nums.add(2345671899l);

		for (Long Number : nums) {
			String convertedNumber = Number.toString();
			Character last = convertedNumber.charAt(convertedNumber.length() - 1);
			System.out.println(last);
			if (Integer.parseInt(last.toString()) > 3) {
				System.out.println(convertedNumber);
			}

		}
	}
}
