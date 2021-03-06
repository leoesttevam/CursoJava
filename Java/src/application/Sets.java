package application;

import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		//HashSet imprime fora de ordem
		//TreeSet imprime em ordem alfabetica
		//LinkedHashSet mantem em ordem de impress?o
		Set<String> set = new TreeSet<String>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		// vai remover os elemetos com mais de 3 letras: set.removeIf(x -> x.length() >= 3);
		//vai remover os elemetos com a letra T: set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
	}
}
