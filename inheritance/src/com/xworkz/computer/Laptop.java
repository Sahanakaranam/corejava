package com.xworkz.computer;

public class Laptop extends Desktop {
	private boolean inBuildMouse;
	

	public boolean isInBuildMouse() {
		return inBuildMouse;
	}


	public void setInBuildMouse(boolean inBuildMouse) {
		this.inBuildMouse = inBuildMouse;
	}


	public void updating() {
		System.out.println("updating windows");
	}

}
