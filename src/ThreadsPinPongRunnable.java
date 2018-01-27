
public class ThreadsPinPongRunnable implements Runnable {

	private String palavra;
	long tempo;

	public ThreadsPinPongRunnable(String palavra, long tempo) {
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

		Runnable ping = new ThreadsPinPongRunnable("Ping", 1500);
		Runnable pong = new ThreadsPinPongRunnable("Pong", 2000);

		System.out.println("Ver Thread");

		
		new Thread(ping, "ping").start();
		new Thread(pong, "Pong").start();
		
		
	}

}
