package abstractoin;

public class singleton {

//	private static final singleton s = new singleton(); // eager

	private static singleton s;

	private singleton() {

	}

	public static singleton getSingletonObject() {
		if(s==null) {
			s = new singleton(); // lazy
		}
		return s;
	}
}
