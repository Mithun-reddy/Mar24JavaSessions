package inheritance;


public class Nokia extends Phone{
	
	String name;
	String brand;
	
	Nokia(String name, String brand) {
		super(name);
		this.brand = brand;
	}
	
	public void displayName() {
		super.displayName();
		System.out.println(brand);
	}

//	String service = "4g";
//	String model;
//	
	public void makeGroupCall(Person one, Person two, Person three, Person four) {

	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		Nokia n = new Nokia("Smartphone", "Nokia");
		n.displayName();
//		n.makeGroupCall(p1, p2, p3, p4);
		
	}

}
