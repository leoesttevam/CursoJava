package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String x = sc.next();
		
		System.out.println("Informe sua idade: ");
		int y = sc.nextInt();

		System.out.println("Informe seu peso: ");
		double p = sc.nextDouble();
		
		System.out.println("Informe seu sexo: ");
		char s = sc.next().charAt(0);
		
		System.out.println("Nome: " + x + " Idade: " + y + " Peso: " + p + " Sexo: " + s);
		sc.close();
	}
}
