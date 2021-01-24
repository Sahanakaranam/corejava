package com.xwrokz.ticket;


	public class Ticket {
		public String checkRoute(String place) {
			String states[] = { "KA", "TS", "TN", "KL", "GA", "MH", "GJ", "PB", "DL" };
			for (int i = 0; i < states.length; i++) {
				if (states[i].equals(place)) {
					return states[i];
				}
			}
			return null;
		}

		public static void Ticket(int noOFseats, String travellagency, String place) {
			int amt = 0;
			switch (travellagency) {
			case "SRS":
				if (place.equals("KA")) {
					amt = noOFseats * 800;
					System.out.println(amt);
					
				}
					if (place.equals("TS")) {
						amt = noOFseats * 1000;
						System.out.println(amt);
						
					}
						if (place.equals("TN")) {
							amt = noOFseats * 1200;
							System.out.println(amt);
							
						}
							if (place.equals("KL")) {
								amt = noOFseats * 1500;
								System.out.println(amt);
						
							}
								if (place.equals("GA")) {
									amt = noOFseats * 1800;
									System.out.println(amt);
									
									
								}
									if (place.equals("MH")) {
										amt = noOFseats * 2000;
										System.out.println(amt);
										
									}
										if (place.equals("GJ")) {
											amt = noOFseats * 2500;
											System.out.println(amt);
											
										}
											if (place.equals("DL")) {
												amt = noOFseats * 3000;
												System.out.println(amt);
												
											}
											if (place.equals("PB")) {
												amt = noOFseats * 3500;
												System.out.println(amt);
											
											}
											break;
			case "VRL" :	
				if (place.equals("KA")) {
				amt = noOFseats * 900;
				System.out.println(amt);
				
			}
				if (place.equals("TS")) {
					amt = noOFseats * 1100;
					System.out.println(amt);
					
				}
					if (place.equals("TN")) {
						amt = noOFseats * 1300;
						System.out.println(amt);
						
					}
						if (place.equals("KL")) {
							amt = noOFseats * 1600;
							System.out.println(amt);
					
						}
							if (place.equals("GA")) {
								amt = noOFseats * 1900;
								System.out.println(amt);
								
								
							}
								if (place.equals("MH")) {
									amt = noOFseats * 2100;
									System.out.println(amt);
									
								}
									if (place.equals("GJ")) {
										amt = noOFseats * 2600;
										System.out.println(amt);
										
									}
										if (place.equals("DL")) {
											amt = noOFseats * 3100;
											System.out.println(amt);
											
										}
										if (place.equals("PB")) {
											amt = noOFseats * 3600;
											System.out.println(amt);
																
											
											}
										break;
			

		}
	}
	}
