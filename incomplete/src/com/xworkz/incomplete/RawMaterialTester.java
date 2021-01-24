package com.xworkz.incomplete;

import com.xworkz.incomplete.governement.RawMaterials;
import com.xworkz.incomplete.governement.SteelRawMaterial;

public class RawMaterialTester {
	public static void main(String args[]) {
		RawMaterials rawMaterial = new SteelRawMaterial();
		rawMaterial.manufacture();
		rawMaterial.heating();

	}

}
