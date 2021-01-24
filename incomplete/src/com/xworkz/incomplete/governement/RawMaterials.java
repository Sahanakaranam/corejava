package com.xworkz.incomplete.governement;

public abstract class RawMaterials {

	protected String typeOfMaterial="steel";

	public void heating() {
		System.out.println("heating of material to get shape");
	}

	public abstract void manufacture();

}
