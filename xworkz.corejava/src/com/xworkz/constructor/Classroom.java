package com.xworkz.constructor;


public class Classroom {
	int noOfChair;
	int noOfBoard;
	int noOfProjector;
	int noOfStudents;

	public Classroom(int noOfChair, int noOfBoard, int noOfProjector, int noOfStudents) {
		this.noOfChair = noOfChair;
		this.noOfBoard = noOfBoard;
		this.noOfProjector = noOfProjector;
		this.noOfStudents = noOfStudents;
	}

	public void sitting() {
		System.out.println("students are sitting");
	}

	public void standing() {
		System.out.println("students are sitting");
	}
}
