package java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("c:\\temp\\arquivo.doc");
		
		try (FileReader fr = new FileReader(f)) {// o try dessa forma fecha o arquivo mesmo que de erro
			
			int i = 0; 
			while ((i = fr.read()) != -1) {
					System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
