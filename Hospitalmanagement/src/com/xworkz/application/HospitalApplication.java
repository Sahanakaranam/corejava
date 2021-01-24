package com.xworkz.application;

import java.util.Scanner;

import com.xworkz.hospitalmodule.Hospital;

public class HospitalApplication {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Scanner scanner = new Scanner(System.in);

		hospital.setName("Hrudayalaya");
		hospital.setPhoneNo(530130);
		hospital.setNoOfDoctors(50);
		hospital.setHospitalType("heart surgeon");
		hospital.setGstNo(5);
		hospital.setLocation("Bellary");

		while (true) {

			System.out.println("WELCOME TO" + " " + hospital.getName());
			System.out.println("1.ADD PATIENT");
			System.out.println("2.DISPLAY PATIENT");
			System.out.println("3.DELETE PATIENT");
			System.out.println("4.UPDATE PATIENT");
			System.out.println("5.EXIT");
			System.out.println("please enter the option");
			int operation = scanner.nextInt();
			if (operation == 1) {
				hospital.addPatient();
			}
			if (operation == 2) {
				hospital.displayPatientDetail();
			}
			if (operation == 3) {
				hospital.deletePatientDetail(0);
			}
		}
	}
}