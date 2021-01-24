package com.xworkz.collections;

public class AlcoholDTO {
	private String name;
	private String brandName;
	private String spiritQuantity;

	public AlcoholDTO() {

	}

	public AlcoholDTO(String name, String brandName, String spiritQuantity) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spiritQuantity = spiritQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSpiritQuantity() {
		return spiritQuantity;
	}

	public void setSpiritQuantity(String spiritQuantity) {
		this.spiritQuantity = spiritQuantity;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals methods invoked");
		if (obj == null)
			return false;
		if (obj instanceof AlcoholDTO) {
			AlcoholDTO casted = (AlcoholDTO) obj;
			if (this.brandName.equals(casted.brandName)) {
				System.out.println("same brand" + this.brandName);
				return true;

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", spiritQuantity=" + spiritQuantity + "]";
	}

}
