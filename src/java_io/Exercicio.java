package java_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		String texto;
		System.out.println("Digite nomes, quando quiser digite sair");
		File f = new File("c:\\temp\\exercicio.doc");

		try {
			FileWriter fw = new FileWriter(f);
			while (!(texto = in.next()).equalsIgnoreCase("sair")) {
				fw.write(texto + "\n");
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
