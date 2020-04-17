package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet<>();
		treeSet.add("X");
		treeSet.add("A");
		treeSet.add("Z");
		treeSet.add("M");
	/*	Iterator iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		Iterator iterator2= treeSet.descendingIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}
}
