package abstractoin;

public interface Phone {

	static void abc(){

	}

	String name= ""; // public, final and static

	void makeCall(); // Public, Abstract

	void takePicture();

	default void splitScreen() {
		System.out.println("Split screen from phone");
	}

}
