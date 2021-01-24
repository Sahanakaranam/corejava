package interfaceclasses;

public class RedBusImpl implements RedBusContract{

	@Override
	public void minBooking() {
System.out.println("accept min bookinh");		
	}

	@Override
	public void open() {
System.out.println("open the booking");		
	}

	@Override
	public void close() {
System.out.println(" close the booking");		
	}
}
	