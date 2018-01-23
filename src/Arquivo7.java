import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Arquivo7 {

	public static void main(String[] args) throws IOException {

		// Retorna Informações das partições das unidades.

		FileSystem fs = FileSystems.getDefault();

		for (FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store.toString());
			System.out.println("Toatal: " + store.getTotalSpace());
			System.out.println("Disponivel: " + store.getUsableSpace());
			System.out.println("Utilizada: " + (store.getTotalSpace() - store.getUsableSpace()));
			System.out.println();
		}
	}

}
