package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;

public class AlcoholTester {

	public static void main(String[] args) {
		AlcoholDTO alco = new AlcoholDTO("red bull", "na", "40");
		AlcoholDTO alco1 = new AlcoholDTO("ib", "kingfisher", "30");
		AlcoholDTO alco2= new AlcoholDTO("old monk", "na", "20");
		
		List<AlcoholDTO>alcoholdtos= new ArrayList<AlcoholDTO>();
		alcoholdtos.add(alco);
		alcoholdtos.add(alco1);
		alcoholdtos.add(alco2);
		AlcoholDTO alco5 = new AlcoholDTO("Bud Wiser", "King Fisher"," 8");
		alcoholdtos.add(2, alco);
		int index=alcoholdtos.indexOf(alco2);
		System.out.println("indexOf"+index);
		
		int lastIndex=alcoholdtos.lastIndexOf(alco1);
		System.out.println("lastIndex"+lastIndex);
		for (AlcoholDTO alcoholDTO : alcoholdtos) {
			System.out.println(alcoholDTO);
		}
	}}
