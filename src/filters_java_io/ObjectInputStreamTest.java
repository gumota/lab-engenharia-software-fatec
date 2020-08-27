package filters_java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		File f = new File("c:/temp/objeto.dat");
		try (FileInputStream fIn = new FileInputStream(f)) {
			ObjectInputStream objIn = new ObjectInputStream(fIn);
			List<Number> inst = (List<Number>) objIn.readObject();
			System.out.println("Lendo do arquivo: ");
			for (Number n : inst) {
				System.out.println(n);
			}
			objIn.close();
		} catch (Exception e) {

		}

	}

}
