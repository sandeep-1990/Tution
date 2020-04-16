package oopstest;

public class AnimalTest {

	public static void showSpecilization(Animal[] animal){
		Dog d = null;
		Cat c= null;
		Horse h = null;
				
		for(Animal aa : animal){
			
			if(aa instanceof Dog){
				d  = (Dog)aa;
				d.specilization();
			}else if(aa instanceof Cat){
				c = (Cat)aa;
				c.specilization();
			}else if(aa instanceof Horse){
				h = (Horse)aa;
				h.specilization();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0] =  new Dog();
		a[1] = new Cat();
		a[2] = new Horse();
		
		showSpecilization(a);
		
		
		
	}
}
