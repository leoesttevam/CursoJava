package application;

import java.util.Map;
import java.util.TreeMap;

public class MProgram {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<String, String>();
		
		cookies.put("user", "Maria");
		cookies.put("e-mail", "Maria@gmail.com");
		cookies.put("phone", "55 958746-5214");
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + " - " + cookies.get(key));
		}
	}
}
