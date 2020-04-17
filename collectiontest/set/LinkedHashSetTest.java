package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		LinkedHashSet hashSet = new LinkedHashSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
