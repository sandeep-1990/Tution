package bankapp;

import java.util.ArrayList;

public class BankApp {

	public static void main(String[] args) {
		
		Account account = new Account();
		Increment increment = new Increment(account);
		Decrement decrement = new Decrement(account);
		Thread thread = new Thread(increment);
		Thread thread2 = new Thread(decrement);
		thread.start();
		thread2.start();
		
		
	}
}
