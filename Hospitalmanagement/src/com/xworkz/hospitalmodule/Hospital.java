package com.xworkz.hospitalmodule;

import java.util.Scanner;

import com.xworkz.patientmodule.Patient;

public class Hospital {
	String name;
	long PhoneNo;
	int noOfDoctors;
	String location;
	String hospitalType;
	int gstNo;

	Scanner scanner = new Scanner(System.in);
	Patient patientDetai[] = new Patient[20];
	int patientCount = 0;

	public void addPatient() {
		Patient patient = new Patient();
		patientDetai[patientCount] = patient;
		patientCount = patientCount + 1;

		System.out.println("enter the patient name:");
		String name = scanner.next();
		patient.setName(name);

		System.out.println("enter patient age:");
		int age = scanner.nextInt();
		patient.setAge(age);

		System.out.println("enter patient gender:");
		String gender = scanner.next();
		patient.setGender(gender);

		System.out.println("enter patient bloodgroup:");
		String bloodgroup = scanner.next();
		patient.setBloodGroup(bloodgroup);

		System.out.println("enter patient phoneNo:");
		long phoneNo = scanner.nextLong();
		patient.setPhoneNo(phoneNo);

		System.out.println("enter patient id:");
		int patientId = scanner.nextInt();
		patient.setPatientId(patientId);

		System.out.println("enter patient weight:");
		int weight = scanner.nextInt();
		patient.setWeight(weight);

		System.out.println("enter patient address:");
		String address = scanner.next();
		patient.setAddress(address);

	}

	public void displayPatientDetail() {
		for (int i = 0; i < patientCount; i++) {
			if (patientDetai[i] != null) {
				System.out.println("patient name is" + " " + patientDetai[i].getName());
				System.out.println("patient gender is" + " " + patientDetai[i].getGender());
				System.out.println("patient age is" + " " + patientDetai[i].getAge());
				System.out.println("patient adress is" + " " + patientDetai[i].getAddress());
				System.out.println("patient bloodgroup is" + " " + patientDetai[i].getBloodGroup());
				System.out.println("patient patient id is" + " " + patientDetai[i].getPatientId());
				System.out.println("patient phoneno is" + " " + patientDetai[i].getPhoneNo());
				System.out.println("patient weightis" + " " + patientDetai[i].getWeight());
			}

		}

	}

	public void deletePatientDetail(int index) {
		for (int i = 0; i < patientCount; i++) {
			if (i == index) {
				patientDetai[i] = null;
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHospitalType() {
		return hospitalType;
	}

	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}

	public int getGstNo() {
		return gstNo;
	}

	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}

}
