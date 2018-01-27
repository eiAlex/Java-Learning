
public class ThreadsPinPong extends Thread {

	private String palavra;
	long tempo;

	public ThreadsPinPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(palavra);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		new ThreadsPinPong("Ping", 1500).start();
		new ThreadsPinPong("Pong", 2000).start();

		System.out.println("Ver Thread");

	}

}
