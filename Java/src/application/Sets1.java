package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Products;

public class Sets1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Products> list = new ArrayList<Products>();
		
		list.add(new Products("TV", 900.00));
		list.add(new Products("Notebook", 1200.00));
		list.add(new Products("Tablet", 450.00));
		list.add(new Products("HD Case", 80.90));
		
		Predicate<Products> pred = p -> p.getPrice() >= 100.0;
		
		//list.removeIf(new ProductPredicate());
		
		/*Referencia para metodo
		list.removeIf(Products::noStaticPredicate);*/
		
		//Arrow function
		//Comparator<Products> comp =  (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		
		//list.sort(comp);
		
		list.removeIf(pred);
		
		for(Products p : list) {
			System.out.println(p);
		}
	}
}
