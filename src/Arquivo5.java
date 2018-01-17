import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {

		// Lista discos retorna o sistema de arquivo de cada SO

		Iterable<Path> diretorios = FileSystems.getDefault().getRootDirectories(); // lista de diretórios raiz
		for (Path path : diretorios) {
			System.out.println(path);
		}

		// Lista conteúdo

		Path dir = Paths.get("C:/file");

		DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
		for (Path path : stream) {
			System.out.println(path.getFileName());
		}
		
	}

}
