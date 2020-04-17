package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("a", "sandeep");
		map.put("b", "sahil");
		map.put("a", "sandy");
		
		Set<Entry<String, String>> set = map.entrySet();

		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"   "+ entry.getValue());
		}
	}
}
