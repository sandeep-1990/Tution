package overridingtest;

public class Test2 extends Test1{
	
	@Override
	public Test2 getInstance() {
		return new Test2();
	}

}
