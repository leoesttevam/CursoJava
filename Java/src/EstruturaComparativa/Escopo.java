package EstruturaComparativa;

public class Escopo {

	public static void main(String[] args) {
		
		double price = 400.00;
		
		double desconto = 0;
		
		if(price < 200.00) {
			desconto = price * 0.1;
		}
		
		System.out.println(desconto);
		
		//Se a vari�vel n�o for iniciada n�o podemos usa-la
	}
}
