package services;

import java.util.List;

public class CalculoService {
	
	//Quando o metodo e static não e nescessario instancia.
	public static Integer max(List<Integer> list) throws IllegalAccessException {
		if (list.isEmpty()) {
			throw new IllegalAccessException("List can't be empty");
		}
		
		Integer max = list.get(0);
		
		for(Integer item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
