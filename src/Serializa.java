import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String[] nomes = { "Alex", "Fulano", "Ciclano" };

		// Escrita de objeto

		FileOutputStream fos = new FileOutputStream("C:/file/objetoSerializado.serializavel"); // recebe o endereço do
																								// arquivo a extensão do
																								// a aquivo é a escolha
		ObjectOutputStream oos = new ObjectOutputStream(fos); // Responsável pela função de gravar obejetos.
		oos.writeObject(nomes);
		oos.close();

		// Leitura de objeto

		FileInputStream fis = new FileInputStream("C:/file/objetoSerializado.serializavel");
		ObjectInputStream ois = new ObjectInputStream(fis); //executa a leitura do arquivo
		String[] nomesRecuperados = (String[]) ois.readObject(); //recupera a string para um array
		ois.close();
		
		System.out.println(Arrays.toString(nomesRecuperados));
		
	}

}
