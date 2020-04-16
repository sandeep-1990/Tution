package bankapp;

public class Decrement implements Runnable{

	Account account;
	
	public Decrement(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.decrement();
	}
	
	
	
	
	
}
