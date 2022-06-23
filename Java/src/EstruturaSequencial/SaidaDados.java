package EstruturaSequencial;

import java.util.Locale;

public class SaidaDados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int y = 32;
		int idade = 31;
		double x = 10.35784;
		double renda = 1.500;
		
		System.out.println(y);
		
		//Saída fomatada com 2 casas decimais
		System.out.printf("%.2f%n", x);
		
		//Saída fomatada com 2 casas decimais
		System.out.printf("%.4f%n", x);
		
		//Saída com quebra de linha.
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		
		//Saída sem quebra de linha.
		System.out.print("Boa tarde!");
		
		//Saída concatenada
		System.out.printf("RESULTADO = " + x + " METROS");
		System.out.println();
		
		//Saída concatenada usando printf
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}
