package application;

import java.util.Comparator;

import entities.Products;

public class MyComparator implements Comparator<Products>{

	@Override
	public int compare(Products p1, Products p2) {
		
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}

	
}
