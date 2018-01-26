import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {

		// A collection Queue representa uma fila
		Queue<String> fila = new LinkedList<>();
		fila.add("Alex");
		fila.add("Alessandra"); // add no final da fila
		fila.offer("Donatela"); // add no final da fila

		System.out.println(fila);
		System.out.println(fila.peek()); // Próximo elemento da fila
		System.out.println(fila.poll()); // remove o elemento que será atendido na fila

		System.out.println(fila);
	}

}
