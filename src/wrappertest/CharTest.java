package wrappertest;

public class CharTest {

	
	public static void main(String[] args) {
		
		
		char c = 'a';
		
		Character character = new Character(c);
		System.out.println(character);
		
		Character cc = c;
		
		Character c2 = Character.valueOf(c);
		
		/**+
		 * reverse
		 */
		
		Character c3 = new Character('v');
		char c1= c3;
		char cc1 = c3.charValue();
		
		
	}
}
