package inheritance;

public class HybridCar extends ElectricCar {
	
	public void engine() {
		System.out.println("Electric motor + ICE");
	}
	
	public static void main(String[] args) {
		
		HybridCar hc = new HybridCar();
		
	}

}
