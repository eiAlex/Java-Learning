import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {

		// Java 7

		Path path = Paths.get("C:/files/texto.txt");// caminho
		System.out.println(path.toAbsolutePath()); // caminho absoluo
		System.out.println(path.getParent());// mosta o diretorio pai
		System.out.println(path.getRoot()); // mostra o diretorio aonde esta armazenado
		System.out.println(path.getFileName()); // mostra nome do arquivo.

		/* criaçao de diretorios */

		Files.createDirectories(path.getParent()); // para criar diretorios

		/* escrever e ler arquivos */

		byte[] bytes = "Criando Arquivos no Java".getBytes();
		Files.write(path, bytes); // cria,limpa , escreve texto no arquivo.
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));// ler arquivo.

	}

}