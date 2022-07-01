package WorkFiles;

import java.io.File;
import java.util.Scanner;

public class Arquivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String str = sc.nextLine();
		
		File path = new File(str);
		
		System.out.println("getName: " + path.getName());
		System.out.println("gtParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		sc.close();
	}
}
