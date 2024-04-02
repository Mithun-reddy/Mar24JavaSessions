package inheritance;

public class ElectricCar extends Car{
	
	public void engine() {
		System.out.println("Electric motor");
	}
	
//	protected void park() {
//
//	}
	
	public static void main(String[] args) {
		
		ElectricCar ec = new ElectricCar();
		ec.drift();
		ec.park();
	}
	
}
