package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		/*for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		for(Object integer : al){
			System.out.println(integer);
		}
		*/
		
		/*Iterator iterator = al.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.next());
		}*/
	
		ListIterator<Integer> iterator= al.listIterator();
	
		while(iterator.hasNext()){
			int no = iterator.next();
			System.out.println(no);
		}
	
			
		
	}
	
}
