package flight;

public class Flight {
	String name;
	int noOfSeats;
	int price;
	String color;
	float weight;
	Flight flightArray[] = new Flight[5];
	static int index = 0;

	public Flight(String name, int noOfSeats, int price, String color, float weight) {
		this.name = name;
		this.noOfSeats = noOfSeats;
		this.price = price;
		this.color = color;
		this.weight = weight;
	}

	public void flying() {
		System.out.println("flight is flying");

	}
	public void addFlight(Flight flight) {
		flightArray[index] = flight;
		index = index + 1;
		System.out.println("flightArray.length");
	}
	public void displayFlightDetails() {
		for (int i = 0; i < flightArray.length; i++) {
			System.out.println("the flight nameis="flightArray[]);
			
		}
	}
}
