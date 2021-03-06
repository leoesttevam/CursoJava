package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

	List<Integer> list = new ArrayList<Integer>();
	
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() throws IllegalAccessException {
		if(list.isEmpty()) {
			throw new IllegalAccessException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.println("[");
		if(!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		System.out.println("]");
	}
}
