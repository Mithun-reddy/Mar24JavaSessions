package inheritance;

public class HydrogenCar  {

	private int wheels;

	private String name = "Merc";


	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}


	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	void displayCarSpecs() {
		System.out.println("Brand is: "+name+" has "+ wheels+" wheels");
	}

}
