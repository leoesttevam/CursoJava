package util;

import java.util.function.Consumer;

import entities.Products;

public class PriceUpdate implements Consumer<Products>{

	@Override
	public void accept(Products p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
