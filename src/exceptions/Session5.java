package exceptions;

public class Session5 {

	public static void div() throws Exception {
//		throw new IOException();
	}

	public static void main(String[] args) {

//		System.out.println(numbers[5]);
		int a = 10;
		int b = 2;

		int[] numbers = { 1, 2, 3, 4 };

		try {
			System.out.println(a / b);
			System.out.println(numbers[2]);
			throw new NullPointerException("My explicit exception");
		} catch (Exception i) {
			System.out.println("third catch block: " + i.getMessage());
		} finally {
			System.out.println("Will execute at any cost");
		}

		for (int c : numbers) {
			System.out.print(c + " ");
		}

		try {
			Session5.div();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
