package exceptions;

public class TestGarbage {

	@Override
	public void finalize() {
		System.out.println("cleanup in progress . . . ");
	}
	
	public TestGarbage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		TestGarbage g1 = new TestGarbage();
		g1 = null;

		TestGarbage g2 = new TestGarbage();
		g2 = null;
		
		System.gc();

	}



}
