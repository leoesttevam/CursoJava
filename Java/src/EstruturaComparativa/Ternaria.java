package EstruturaComparativa;

public class Ternaria {

	public static void main(String[] args) {
		
		double preco = 34.5;
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5; 
		
		System.out.println(desconto);
	}
}
