package collectiontest;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		
		Vector vector = new Vector();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		Iterator iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
		
		
		
		
	}
}
