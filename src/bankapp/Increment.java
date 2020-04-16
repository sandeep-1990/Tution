package bankapp;

public class Increment implements Runnable{

	Account account;
	
	public Increment(Account account) {
		this.account = account;
	}
		
	@Override
	public void run() {
	
		account.increment();
	}
	
}
