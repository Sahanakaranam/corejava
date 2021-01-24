package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Food {

	public static void main(String[] args) {
		String northIndian = "gobi";
		String southIndian = "rice sambar";
		String chinese = "noodles";
		String pastry = "chocolate";
		String milkshake = "chocolate milkshake";

		Collection foods = new ArrayList();
		boolean added = true;
		added = foods.add(northIndian);
		System.out.println("added");
		added = foods.add(southIndian);
		System.out.println("added");
		added = foods.add(chinese);
		System.out.println("added");
		added = foods.add(pastry);
		System.out.println("added");
		added = foods.add(milkshake);
		System.out.println("added");

		boolean contains = foods.contains(milkshake);
		System.out.println("food contains:" + contains);
	}

}
