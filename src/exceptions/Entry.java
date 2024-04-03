package exceptions;

public class Entry {

	public static void checkAttendance(Student s) throws ExceptionAbsent {
		if(s==null) {
			throw new ExceptionAbsent();
		}
	}

	public static void main(String[] args) {

		Student s = new Student("Shikha Singh");



	}

}
