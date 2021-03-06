package OrientacaoObj;

import java.util.Locale;
import java.util.Scanner;

import entities.Monitor;

public class TV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Monitor tv = new Monitor();
		
		System.out.println("Digite a marca domonitor: ");
		String mc = sc.nextLine();
		tv.setMarca(mc);
		System.out.println("Digite o modelo do monitor: ");
		String md = sc.nextLine();
		tv.setModelo(md);
		System.out.println("Digite a cor do monitor: ");
		String cor = sc.nextLine();
		tv.setCor(cor);
		System.out.println("Digite a polegadas do monitor: ");
		int pol = sc.nextInt();
		tv.setPolegadas(pol);
		tv.setStatus(true);
		
		System.out.println(tv);
		tv.statusMonitor();
		
		sc.close();
	}
}
