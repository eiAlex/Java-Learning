import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Arquivo5 {

	public static void main(String[] args) {
		
		//Lista discos  retorna o sistema de arquivo de cada SO
		
		Iterable <Path> diretorios = FileSystems.getDefault().getRootDirectories();
		for (Path path : diretorios) {
			System.out.println(path);
		}
		

	}

}
