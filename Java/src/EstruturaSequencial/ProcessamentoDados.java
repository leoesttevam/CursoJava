package EstruturaSequencial;

public class ProcessamentoDados {
	
	public static void main(String[] args) {
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		int d, f;
		double resultado;
		
		d = 5;
		f = 2;
		
		//casting convertendo um int por um double
		resultado = (double) d / f;
		
		System.out.println(resultado);
	}
}
