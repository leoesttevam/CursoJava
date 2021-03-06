package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		Product produto = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Product: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Price: ");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Want to add products to stock? (s/n)");
		resp = sc.next().charAt(0);
		
		
		if(resp != 'n') {
			System.out.println();
			System.out.println("Enter the number of products to be added in stock: ");
			int quantidade = sc.nextInt();
			produto.addProduto(quantidade);
			
			System.out.println();
			System.out.println(produto);
			
		}
		
		System.out.println();
		System.out.println("Want to remove products to stock? (s/n)");
		resp = sc.next().charAt(0);
		
		if(resp != 'n') {
			System.out.println();
			System.out.println("Enter the number of products to be remove in stock: ");
			int quantidade = sc.nextInt();
			produto.removeProduto(quantidade);
			
			System.out.println();
			System.out.println(produto);
			
		}else {
			System.out.println("session ended");
		}
		
		System.out.println("session ended");
		
		sc.close();
	}
}
