package EstruturaSequencial;

import java.util.Locale;

public class ExercicioFixacao {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measue = 52.234567;
		
		System.out.println("Products:");
		
		System.out.printf(product1 + ", which price is $ %.2f %n", price1);
		System.out.printf(product2 + ", which price is $ %.2f %n", price2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %s %n", age, code, gender);
		
		System.out.printf("%nMeasue with eight decimal places: " + measue);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%nRouded (three decimal places): %.3f", measue);
		
	}

}
