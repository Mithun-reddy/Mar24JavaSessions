package advancejava;

public class Session2 {

	String name;
	int id;
	int v;

	Session2(){
		System.out.println("first constructor");
	}

	Session2(int id, String name){
		this();
		this.id = id;
		this.name = name;
		System.out.println(id+" "+name);
	}

	Session2(int id, String name, int v){
		this(id, name);
		this.v = v;
		System.out.println("printing v"+v);
	}

	Session2(Session1 b){
		System.out.println("first constructor");
	}

	void dummy(Session2 b) {
		System.out.println("Dummy method");
	}

	void dummy2() {
		dummy(this);
	}

	Session2 dummy3() {
		System.out.println("Dummy 3");
		return this;
	}

	public static void main(String[] args) {

		int a;
		int b = 10; // autoboxing
		a = b; // autounboxing

		String[] names = {"Deeskhith", "Mithun", "Gokila"};
		int[] numbers = {1,2,3,4,5}; //1D
		int[][] matrix = {{12,13,14}, {1,2,3,6}, {7,8,9}}; // 2D 3X3

//		12 13 14
//		1   2  3
//		7   8  9

		for (int[] element : matrix) {
			for (int col = 0; col < element.length ; col++) {
				System.out.print(element[col]+" ");
			}
			System.out.println();
		}



		System.out.println(matrix[2][1]);
		System.out.println(matrix[0][0]);

		int[] wholeNums = new int[10];
		int[][] xyz = new int[3][3];
		wholeNums[0] = 2;



		System.out.println(names[2]);

	}


//	public int add(int a, int b) {
//
//		return a + b;
//	}
//
//	public void displayRes() {
//		add(10,10);
//
//		this.add(10, 10);
//	}
//
//	public double add(double a, double b) {
//
//		return a+b;
//	}
//
//	public int sub (int a, int b) {
//		return b-a;
//	}
//
//	public int sub (int a, int b, int c) {
//		return b-a-c;
//	}
}
