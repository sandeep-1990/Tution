package collectiontest;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.add(10);
		stack.add(20);
		
		Iterator iterator = stack.iterator();		
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Testing git");
	}
	
}
