package exceptiontest;

public class RunTimeStackTest {

	
	public void a(){
		System.out.println(5/2);
		System.out.println("dvbjvonvn");
	}
	
	public void b(){
		a();
		System.out.println("abbiwewiub");
	}
	public static void main(String[] args) {
		RunTimeStackTest stackTest = new RunTimeStackTest();
		stackTest.b();
		System.out.println("jdvwieoijwioeiojj");
	}
	
}
