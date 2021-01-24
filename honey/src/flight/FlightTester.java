package flight;

import constants.CompanyName;

public class FlightTester {
	public static void main(String args[]) {
		FlightDTO flightDTO = new FlightDTO();
		FlightBooking flightBooking = new FlightBooking();

		flightDTO.setAiroplaneCode("24br7866");
		flightDTO.setBusinessClassPrice(10);
		flightDTO.setCompany(CompanyName.DECCANAIR);
		flightDTO.setDestinationPoint("hyderbad");
		flightDTO.setEconomyClassPrice(400);
		flightDTO.setStartingPoint("bangalore");
		flightDTO.setTotalSeats(100);

		flightBooking.addFlight(flightDTO);
		flightBooking.display();
		flightBooking.searchByStartingPoint("bangalore");
	}
}