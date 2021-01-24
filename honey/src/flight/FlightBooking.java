package flight;

import constants.CompanyName;

public class FlightBooking {

	FlightDTO[] flightdetail = new FlightDTO[50];
	int flightcount = 0;

	public void addFlight(FlightDTO flightDTO) {
		if (flightDTO.getAiroplaneCode() != null && flightDTO.getCompany() != null
				&& flightDTO.getBusinessClassPrice() !=0 && flightDTO.getStartingPoint() != null) {
			System.out.println("flight information is valid");
			flightdetail[flightcount] = flightDTO;
			flightcount++;
		}else {
			System.out.println("not valid information");
		}
			if(flightDTO.getBusinessClassPrice()>=1000) {
				System.out.println("business class price is 1000 soo your price is valid  ");
			}else {
				System.out.println("sorry !business class price 1000");
			}
		}
	

	public void searchByStartingPoint(String startingPoint) {
	
	 
for (int i = 0; i < flightdetail.length; i++) {

	if(flightdetail[i]!=null) {
	if (flightdetail[i].getStartingPoint().equals(startingPoint)) {
	
		System.out.println(flightdetail[i].getAiroplaneCode()+" "+flightdetail[i].getBusinessClassPrice()+""+flightdetail[i].getDestinationPoint()+""+flightdetail[i].getEconomyClassPrice()+""+flightdetail[i].getStartingPoint()+""+flightdetail[i].getTotalSeats()+""+flightdetail[i].getCompany());
	}
	else {
		System.out.println("starting point not found");

	}
	}
}
}
	
	public void display() {
		for(int i=0;i<flightcount;i++) {
			if(flightdetail[i]!=null) {
				System.out.println(flightdetail[i].getAiroplaneCode()+" "+
			flightdetail[i].getBusinessClassPrice()+" "+flightdetail[i].getDestinationPoint()+" "+
						flightdetail[i].getEconomyClassPrice()+" "+flightdetail[i].getStartingPoint()+
						" "+flightdetail[i].getTotalSeats()+" "+flightdetail[i].getCompany());
			}
		}
	}
				
			

}


