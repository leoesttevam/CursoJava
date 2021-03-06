package WorkFiles;

import java.io.File;
import java.util.Scanner;

public class ManiFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String str = sc.nextLine();
		
		File path = new File(str);
		
		//Vai monstrar as pastas no diretorio
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		//Vai monstrar os arquivos das pastas
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		//Cria sub pasta
		Boolean sucess = new File(str + "\\subdir").mkdir();
		System.out.println("Diretory ceated successfully: " + sucess);
		
		sc.close();
	}
}
