package filters_java_io;

import java.io.File;
import java.util.List;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {

		List<Number> numbers = Arrays.asList(1, 2, 3, 4.5, 7.5, 9.1);

		File f = new File("c:/temp/objeto.doc");
		try (FileOutputStream fout = new FileOutputStream(f)) {
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			objOut.writeObject(numbers);
			objOut.close();
			System.out.println("Objeto foi criado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
