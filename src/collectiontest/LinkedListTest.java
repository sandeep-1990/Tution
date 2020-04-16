package collectiontest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
	}
	
}
