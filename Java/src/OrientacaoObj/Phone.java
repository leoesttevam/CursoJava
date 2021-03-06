package OrientacaoObj;

import java.util.Locale;
import java.util.Scanner;

import entities.Celular;

public class Phone {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a marca do celular: ");
		String marca = sc.nextLine();
		System.out.println("Digite o modelo do celular: ");
		String modelo = sc.nextLine();
		System.out.println("Digite a porcentagem da bateria: ");
		int bat = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe a operadora do celular: ");
		String opd = sc.nextLine();
		
		Celular phone = new Celular(marca, modelo, bat, opd);
		
		System.out.println("Status do celular: " + phone.toString());
		sc.close();
	}
}
