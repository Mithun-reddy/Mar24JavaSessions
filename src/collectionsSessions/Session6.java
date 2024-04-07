package collectionsSessions;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Session6 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> studentIDs = new ArrayList<Object>();
		studentIDs.add(33);
		studentIDs.add("Swapna");
		studentIDs.add(31);
		studentIDs.add(31);
		studentIDs.add(15);
//		
//		ArrayList<Integer> studentIDB = new ArrayList<Integer>();
//		studentIDB.add(33);
//		studentIDB.add(21);
//		
//		LinkedList<String> s = new LinkedList<String>();
//		s.add("Pallavi");
//		s.add("Deekshith");
//		s.add("Mithun");
//		s.add("Adithya");
////		System.out.println(studentIDs.);
		
//		for (Integer integer : studentIDs) {
//			System.out.println(integer);
//		}
//		s.poll();
//		s.poll();
//		s.poll();
		
//		System.out.println(s.poll());
		
		
//		ArrayDeque<Integer> pq = new ArrayDeque<Integer>();
//		pq.add(5);

		
//		Set<Integer> s = new LinkedHashSet<Integer>();
//		s.add(5);
//		s.add(5);
//		s.add(8);
//		s.add(1);
//		s.add(3);
//		s.add(null);
		
//		Set<Integer> s = new TreeSet<Integer>();
//		s.add(5);
//		s.add(5);
//		s.add(8);
//		s.add(1);
//		s.add(3);
//		
//		Iterator<Integer> i = s.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for(Integer i: s) {
//			System.out.println(i);
//		}
		
		Map<Integer, String> hm = new TreeMap<Integer, String>();
		
		hm.put(2, "Swapna");
		hm.put(2, "Mithun");
		hm.put(3, "Mithun");
		hm.put(4, null);
		hm.put(5, null);
		hm.remove(4);
		
		System.out.println(hm.get(3));
		
//		for(Map.Entry<Integer, String> ex: hm.entrySet()) {
//			System.out.println(ex.getKey()+" "+ex.getValue());
//		}
		
		Iterator<Map.Entry<Integer, String>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> en = i.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
	}

}
