package constThisSobrEncapsu;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit(y/n)?");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double dep = sc.nextDouble();
			conta = new Conta(number, holder, dep);
		}else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta.toString());
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}
}
