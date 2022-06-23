package polismorfismo;

import entities.Account;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}
}
