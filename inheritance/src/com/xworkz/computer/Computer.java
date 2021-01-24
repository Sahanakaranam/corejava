package com.xworkz.computer;

public class Computer {
	private String brand;
	private int price;
	private String color;

	public void installation() {
		System.out.println("installation of apps");
	}

	public void screenRecording() {
		System.out.println("recording of screen");

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
