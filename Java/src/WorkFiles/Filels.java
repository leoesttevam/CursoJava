package WorkFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filels {

	public static void main(String[] args) {
		
		//FileWriter e BufferedWriter
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
