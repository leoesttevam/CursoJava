package application;

import entities.Cliente;

public class PCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Leonardo Estevam", "Leonardo@gmail.com");
		Cliente c2 = new Cliente("Leonardo Estevam", "Leonardo@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println(c1 == c2);
	}
}
