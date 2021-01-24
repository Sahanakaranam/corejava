package com.xworkz.car;

public class CarMain {

	public static void main(String args[]) {
		Car car = new Car();
	car.setNoOfSeats(5);
		car.setColor("red");
		car.setPrice(25000000);
		System.out.println(car.getNoOfSeats());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());

		TeslaCar teslacar = new TeslaCar();
		teslacar.setNoOfSeats(7);
		teslacar.setAutomatic(true);
		System.out.println(teslacar.isAutomatic());
		car.riding();

	}

}
