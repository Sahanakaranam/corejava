package com.xwrokz.ticket;



public class TicketMain {

	public static void main(String[] args) {

		Ticket ticketbooking = new Ticket();
		String checkRoute = ticketbooking.checkRoute("K0arnataka");
		System.out.println("you can book seates");

		if (checkRoute != null) {
			System.out.println("root is  avalable");
			Ticket.Ticket(2, "SRS", "karnataka");
		} else {
			System.out.println("invalid");

		}

	} 

}