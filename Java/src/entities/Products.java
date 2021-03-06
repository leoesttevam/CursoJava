package entities;

public class Products{

	private String nome;
	private Double price;
	
	public Products(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static String staticUpperCase(Products p) {
		return p.getNome().toUpperCase();
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", price);
	}
	
}
