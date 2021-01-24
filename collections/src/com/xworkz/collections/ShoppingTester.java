package com.xworkz.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ShoppingTester {

	public static void main(String[] args) {
		ShoppingDTO shop = new ShoppingDTO();
		shop.setItemName("salwar");
		shop.setPrice(2500);
		shop.setQuantity(1);
		ShoppingDTO shop1 = new ShoppingDTO();
		shop1.setItemName("shoe");
		shop1.setPrice(1500);
		shop1.setQuantity(1);
		
		Collection<ShoppingDTO> shopDTO = new ArrayList<ShoppingDTO>();
		shopDTO.add(shop);
		shopDTO.add(shop1);
		
		
		ShoppingDTO shop3 = new ShoppingDTO();
		shop3.setItemName("shoe");
		shop3.setPrice(1500);
		shop3.setQuantity(1);
		
		
		boolean contain=shopDTO.contains(shop3);
		System.out.println("contains"+contain);
		 
		if(contain) {
			System.out.println("already exist");
		}else {
			System.out.println("added to the cart");
		shopDTO.add(shop3);
		}
System.out.println("after the cart");
System.out.println(shopDTO.size());



}

}
