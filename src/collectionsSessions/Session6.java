package collectionsSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Session6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> studentIDs = new ArrayList<Integer>();
		studentIDs.add(33);
		studentIDs.add(21);
		studentIDs.add(31);
		studentIDs.add(31);
		studentIDs.add(15);
		
		ArrayList<Integer> studentIDB = new ArrayList<Integer>();
		studentIDB.add(33);
		studentIDB.add(21);
		
		LinkedList<String> s = new LinkedList<String>();
		s.add("Pallavi");
		s.add("Deekshith");
		s.add("Mithun");
		s.add("Adithya");
		
		
		
		
//		System.out.println(studentIDs.);
		
//		for (Integer integer : studentIDs) {
//			System.out.println(integer);
//		}
		s.poll();
		s.poll();
		s.poll();
		s.poll();
		System.out.println(s.poll());
		
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
