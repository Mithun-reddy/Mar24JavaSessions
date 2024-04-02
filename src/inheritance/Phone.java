package inheritance;

public class Phone {
	
	String name = "fdgdfg";
	
	public void displayName() {
		System.out.println(name);
	}
	
	Phone(String name){
		this.name = name;
	}
	
	Phone(){
		
	}
	
	String service;

	public void makeGroupCall(Person one, Person two, Person three) {

	}

	public void makeGroupCall(Person one, Person two, Person three, Person four) {

	}
	
	public static void main(String[] args) {
		
		
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		Person p4 = new Person();
//		
//		Phone p = new Phone("");
//		p.makeGroupCall(p1,p2,p3);
//		p.makeGroupCall(p1,p2,p3,p4);
	}

}
