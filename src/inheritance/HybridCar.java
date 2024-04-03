package inheritance;

public class HybridCar extends ElectricCar {

	@Override
	public void engine() {
		System.out.println("Electric motor + ICE");
	}

	public static void main(String[] args) {

		HybridCar hc = new HybridCar();

	}

}
