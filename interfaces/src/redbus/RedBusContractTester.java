package redbus;

import interfaceclasses.RedBusContract;
import redbus.agency.TravelAgency;
import redbus.vrl.RedBusContractImplementor;

public class RedBusContractTester {

	public static void main(String[] args) {
		RedBusContract redContract = new RedBusContractImplementor();
		TravelAgency travelagency = new TravelAgency(redContract);
		travelagency.acceptBooking();
	}

}
