package collectionsSessions;

import inheritance.Car;

public class Generics<Any> {
	
	private Any at; // Instance variable of type Any
	
	public Generics(Any t) {
		at = t;
	}
	
	Any getType() {
		return at;
	}
	
	void showType() {
		System.out.println("Type of data is: "+at.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		
		Generics<String> st = new Generics<String>("Pallavi");
		System.out.println(st.getType());
		st.showType();
		
		Generics<Integer> it = new Generics<Integer>(33);
		System.out.println(it.getType());
		it.showType();
		
		Generics<Car> ct = new Generics<Car>(new Car());
		System.out.println(ct.getType());
		ct.showType();
		
	}

}
