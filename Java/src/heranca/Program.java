package heranca;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<Account>();
		
		list.add(new SavingAccount(1001, "Alex", 1000.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingAccount(1003, "Ana", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Jos?", 500.0, 500.0));
		
		double soma = 0.0;
		for(Account acc : list) {
			soma += acc.getSaldo();
		}
		
		System.out.println("Saldo total: " + soma);
		
		for(Account acc : list) {
			acc.deposito(10.0);
		}
		
		for(Account acc : list) {
			System.out.println("Conta " + acc.getNumber() + " Titular " + acc.getTitular() + " Saldo " + acc.getSaldo());
		}
		
	}
}
