package application;

import java.util.Locale;
import java.util.Scanner;

import constThisSobrEncapsu.CProduct;

public class CProgram {
	
	//Aula Construtores
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		System.out.println("Enter product data: ");
		System.out.print("Product: ");
		String nome = sc.nextLine();
		
		System.out.print("Price: ");
		double preco = sc.nextDouble();
		
		CProduct produto = new CProduct(nome, preco);
		
		produto.setNome("Computador");
		System.out.println("Update: " + produto.getNome());
		
		produto.setPreco(1280.89);
		System.out.println("Update: " + produto.getPreco());
		
		
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
