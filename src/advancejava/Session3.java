package advancejava;

public class Session3 {


	static {
//		System.out.println("This is a static method");
	}

	static int a;
	int b;

	static void displayA() {
		System.out.println(a);
	}

	 void displayB() {
		System.out.println(b);
	}

	public static void main(String[] args) {

//		Session3 s3 = new Session3();
//		Session3 s4 = new Session3();
//
//		Session3.a = 10;
//		Session3.a = 50;
//
//		s3.b = 15;
//		s4.b = 100;
//
//		Session3.displayA();
//		Session3.displayA();
//
//		s3.displayB();
//		s4.displayB();

//		char[] name = {'a', 'd','i','t','y', 'a'};
//		String name1 = "aditya";


//		System.out.println(name);

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
//		System.out.println(s1 == s2); // true
//		System.out.println(s1 == s3); //false
//		System.out.println(s4 == s3); //false
//
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s1.equals(s3)); // true
//		System.out.println(s4.equals(s3)); // true

		s1.concat(" Language");

		String s5 = s1.concat(" Language");


		String[] s6 = s5.split("a");

		for(String a: s6) {
			System.out.print(a+" ");
		}

		char[] c1 = s5.toCharArray();

		StringBuffer sb = new StringBuffer(16);

		sb.append("Launguage1234566");
//		sb = "New";
		System.out.println(sb.length());




	}

}
