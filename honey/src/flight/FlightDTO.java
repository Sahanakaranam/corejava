package flight;

import constants.CompanyName;

public class FlightDTO {
	private String airoplaneCode;
	private CompanyName Company;
	private String startingPoint;
	private String destinationPoint;
	private int totalSeats;
	private double businessClassPrice;
	private double economyClassPrice;

	public String getAiroplaneCode() {
		return airoplaneCode;
	}

	public void setAiroplaneCode(String airoplaneCode) {
		this.airoplaneCode = airoplaneCode;
	}

	public CompanyName getCompany() {
		return Company;
	}

	public void setCompany(CompanyName company) {
		Company = company;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public double getBusinessClassPrice() {
		return businessClassPrice;
	}

	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}

	public double getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}

}
