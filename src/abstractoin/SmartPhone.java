package abstractoin;

public class SmartPhone extends Vehicle implements Phone{


	@Override
	public void makeCall() {

	}

	@Override
	public void takePicture() {

	}

	@Override
	public void splitScreen(){
		System.out.println("Split screen from smartphone");
	}

	public static void main(String[] args) {
		Phone p = new SmartPhone();
		p.makeCall();
		p.splitScreen();
	}

	@Override
	void moveFwd() {
		// TODO Auto-generated method stub

	}

	@Override
	void turnRight() {
		// TODO Auto-generated method stub

	}

}
