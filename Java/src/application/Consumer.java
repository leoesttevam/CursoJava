package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;
import util.PriceUpdate;

public class Consumer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Products> list = new ArrayList<Products>();
		
		list.add(new Products("TV", 900.00));
		list.add(new Products("Notebook", 1200.00));
		list.add(new Products("Tablet", 450.00));
		list.add(new Products("HD Case", 80.90));
		
		list.forEach(new PriceUpdate());
		
		list.forEach(System.out::println);
	}
}
