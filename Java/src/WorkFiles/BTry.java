package WorkFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BTry {

	public static void main(String[] args) {
			
			//Bloco try-with-resources
			String path = "c:\\temp\\in";
			
			
			try (BufferedReader br = new BufferedReader(new FileReader(path))){
				
				String line = br.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = br.readLine();
				}
			}
			catch (IOException e) {
				System.out.println("Error " + e.getMessage());
		}
			
	}
}
