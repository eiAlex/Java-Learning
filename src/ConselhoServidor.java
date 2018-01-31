import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws IOException {

		System.out.println("Serve on");
		ServerSocket server = new ServerSocket(5000);

		while (true) {
			Socket socket = server.accept();

			try (PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
				pw.println("Mensagem Enviada do servidor!");
			}

		}

	}

}
