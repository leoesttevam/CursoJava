package entities;

public class Product {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "Product: " + nome + ", Price $ " + String.format("%.2f", preco) + ", Stock " + quantidade + " units, Total: $ " + String.format("%.2f", totalEstoque());
	}
}
