package exceptions;

public class GarbageExample {

	@Override
	public void finalize() {
		System.out.println("cleanup in progress . . . ");
	}
	public static void main(String[] args) {

		// System, Runtime

		String s  = new String("Shikha");

		s = new String("Mithun");

		s = null;

		TestGarbage g1 = new TestGarbage();
		g1 = null;

		TestGarbage g2 = new TestGarbage();
		g2 = null;

		System.gc();

		//or

		Runtime.getRuntime().gc();


	}

}
