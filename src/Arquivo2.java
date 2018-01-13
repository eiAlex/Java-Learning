import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) {

		Charset utf8 = StandardCharsets.UTF_8;
		Path path = Paths.get("C:/file/texto.txt");

		// java 7
		// Escrita
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, utf8)) {

			bufferedWriter.write("\nTexto");
			bufferedWriter.write("\nTexto");

		} catch (IOException e) {
			e.printStackTrace();

		}

		//Leitura
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
