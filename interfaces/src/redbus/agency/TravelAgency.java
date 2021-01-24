package redbus.agency;

import interfaceclasses.RedBusContract;

public class TravelAgency {
	private RedBusContract contract;
	private String agencyName = new String("BOOK MY TRIP");

	public TravelAgency(RedBusContract contract) {
		System.out.println("invoked travel agency");
		this.contract = contract;

	}

	public void acceptBooking() {
		System.out.println("invoked accept booking");
		System.out.println("accept booking for" + this.agencyName);
		boolean warranty = contract.busWarranty();
		if (warranty) {
			System.out.println("bus is under warranty");
			int min = contract.minBooking();
			if (min > 0 && min <= 20) {
				System.out.println("can accept booking");

			} else {
				System.out.println(" cant accept booking");
			}
		} else {
			System.out.println("bus is not under warranty");
		}
	}

}
