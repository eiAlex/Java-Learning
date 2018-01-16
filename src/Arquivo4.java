import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {


		Path path = Paths.get("C:/file/texto.txt");

		
		// Exclus�o de arquivos

				//Files.delete(path);// tenta deleta se n�o encontrar lan�ar exce��o
				Files.deleteIfExists(path); // tenta deletar se exitir o arquivo mas n�o lan�a exe��o

		//Cria��o de aquivo
				Files.createFile(path);
		
		
		System.out.println(Files.exists(path)); // se o arquivo existe
		System.out.println(Files.isDirectory(path)); // se � um diret�rio
		System.out.println(Files.isRegularFile(path)); // se � uma arquivo regular texto imagem etcc
		System.out.println(Files.isReadable(path)); // se pode ser lido
		System.out.println(Files.isExecutable(path)); // se pode executado pelo usuario
		System.out.println(Files.size(path)); // tamanho do arquivo precia tratar exce��es
		System.out.println(Files.getLastModifiedTime(path)); // retorna ultima modifica��o;
		System.out.println(Files.getOwner(path)); // retorna o dono do arquivo
		System.out.println(Files.probeContentType(path)); // retorna o tipo de arquivo.

		// Exclus�o de arquivos

		//Files.delete(path);// tenta deleta
	//	Files.deleteIfExists(path); // tenta deletar se exitir o arquivo mas n�o lan�a exe��o

		// Cria��o de arquivos
		Path path2 = Paths.get("C:/file/newtexto.txt");
		Files.deleteIfExists(path2);
		Files.createFile(path2);
		Files.write(path2, "TEXTo".getBytes());

		// C�pia de arquivos

		
		
		Path copia = Paths.get("C:/file/copianewtexto.txt");
		Files.copy(path, copia,StandardCopyOption.REPLACE_EXISTING);
		
		//Mover arquivo
		
		Path mover = Paths.get("C:/file/move/moviTexto.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);

	}

}
