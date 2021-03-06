package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estudo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//Adicionar elemento na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		//Tamanho da lista
		System.out.println(list.size());
		
		//Remover elemento da lista
		list.remove(1);
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("- - - - - - - - - - - - - - - -");
		//Remover elemento que come?a com a letra M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("- - - - - - - - - - - - - - - -");
		//Encontra um elemento 
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("- - - - - - - - - - - - - - - -");
		//Encontra elemento na lista
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("- - - - - - - - - - - - - - - -");
		//Encontra o primeiro elemento da lista que atende o predicado -> (x -> x.charAt(0) == 'A')
		//caso o elemento n?o existir ele vai retorna nulo.
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		if(name == null) {
			System.out.println("Nome n?o encontrado ou n?o existe na lista");
		}else {
			System.out.println(name);
		}
		
	}
}
