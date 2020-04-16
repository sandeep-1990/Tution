package overloadingtest;

public class Calculator {

	String name ;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public Calculator(String name) {
		this.name = name;
	}
	
	public int sum(int a, int b){
		return a+b;
	}
	private float sum(float f1, float f2){
		return f1+f2;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.sum(5.5f,5));
	}
	
	@Override
	public boolean equals(Object obj) {
		Calculator calculator = (Calculator)obj;
		if(calculator.name.equals(this.name)){
			return true;
		}
		return false;
	}
	
}
