package util;

import java.util.function.Function;

import entities.Products;

public class UpperCaseName implements Function<Products, String>{

	@Override
	public String apply(Products p) {
		return p.getNome().toUpperCase();
	}
}
