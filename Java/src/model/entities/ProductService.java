package model.entities;

import java.util.List;
import java.util.function.Predicate;

import entities.Products;

public class ProductService {

	public double filteredSum(List<Products> list, Predicate<Products> criteria) {
		double soma = 0.0;
		for(Products p : list) {
			if(criteria.test(p)) {
				soma += p.getPrice();
			}
		}
		return soma;
	}
}
