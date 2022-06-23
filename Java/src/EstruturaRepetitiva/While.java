package EstruturaRepetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			x = sc.nextInt();
			
			if(x == 0) {
				System.out.println("Você acertou o número ");
			}else {
				System.out.println("Tente novamente");
			}
		}
		
		sc.close();
	}
}
