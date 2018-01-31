import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("Cliente on");
		Socket socket = new Socket("127.0.0.1",5000);
		
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("MeEnsagem: "+ s.nextLine());
		s.close();
	}

}
