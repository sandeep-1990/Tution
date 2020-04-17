package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		
		hashtable.put("1", "sandeep");
		hashtable.put("2", "sahil");
		
		Enumeration<String> enumeration = hashtable.keys();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			String val = hashtable.get(key);
			System.out.println(key + "  "+ val );
		}
		
	}
	
	
}
