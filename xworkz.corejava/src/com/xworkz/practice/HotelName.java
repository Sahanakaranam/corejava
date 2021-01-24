package com.xworkz.practice;

public class HotelName {
	public Static String checkhotelAvailaiblity(String hotelName) {
 
String listofhotels[]= {"taj","nakshatra","pola","bala","four season"};
for(int i=0;i<listofhotels.length;i++) {
	if(listofhotels[i].equalsIgnoreCase(hotelName)){
		return listofhotels[i];
	}
	}
return null;
}

}
