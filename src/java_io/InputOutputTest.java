package java_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputTest {
	
	public static void main(String[] args) {
		
		File f = new File("c:\\temp\\arquivo.doc");
		System.out.printf("Existe: %s%n", f.exists());
		System.out.printf("Arquivo: %s%n", f.isFile());
		System.out.printf("Diretorio: %s%n", f.isDirectory());
		System.out.printf("Pode ler: %s%n", f.canRead());
		System.out.printf("Pde gravar: %s%n", f.canWrite());
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Hello word\n");
			fw.flush();//Descarrega o que tem no buffer e joga no arquivo
			fw.write("File writer\n");
			fw.close();//O close já possui o flush em sua implementação
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
