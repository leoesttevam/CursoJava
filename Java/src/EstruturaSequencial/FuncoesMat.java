package EstruturaSequencial;

import java.util.Scanner;

public class FuncoesMat {

	/*
	 * Algumas fun��es matem�ticas em Java
	 * 
	 * A = Math.sqrt(x); Vari�vel A recebe a raiz quadrada de x
	 * 
	 * A = Math.pow(x, y); Vari�vel A recebe o resultado de x elevado a y
	 * 
	 * A = Math.abs(x); Vari�vel A recebe o valor absoluo de x
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " Elevado a " + x + " = " + A);
		System.out.println(x + " Elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		sc.close();
	}
}
