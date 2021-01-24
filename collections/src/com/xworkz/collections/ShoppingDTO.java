package com.xworkz.collections;

public class ShoppingDTO {
	private String itemName;
	private int price;
	private int quantity;

	public ShoppingDTO() {
		
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

	

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals");
		if(obj==null) {
			return false;
		}
		if(obj instanceof ShoppingDTO) {
			ShoppingDTO cast=(ShoppingDTO)obj;
			if(this.itemName.equals(cast.itemName)&&this.price==cast.price) {
			System.out.println("item is matching"+cast.itemName);
			
		return true;
	}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ShoppingDTO [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ", getItemName()="
				+ getItemName() + ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
