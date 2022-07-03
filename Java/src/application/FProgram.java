package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;
import model.entities.ProductService;

public class FProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Products> list = new ArrayList<Products>();
		
		list.add(new Products("TV", 900.00));
		list.add(new Products("Notebook", 1200.00));
		list.add(new Products("Tablet", 450.00));
		list.add(new Products("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double soma = ps.filteredSum(list, p -> p.getNome().charAt(0) == 'T');
		
		System.out.println("Soma = " + String.format("%.2f", soma));
	}
}
