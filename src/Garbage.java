import java.util.ArrayList;
import java.util.List;

public class Garbage {

	public static long carregarMemoria() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++) {
			
			
		}
		return Runtime.getRuntime().freeMemory();
		
	}
	
	
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		int MB = 1_048_575; // total de bytes
		double total = runtime.maxMemory() /MB;
		
		double inicio = total - (carregarMemoria()/MB);
		
		System.out.println("Total: "+total);
		System.out.println("Inicio: "+inicio);
		
		runtime.runFinalization();
		runtime.gc(); // chama a execução do Garbage collector 

		double fim = total - (runtime.freeMemory()/MB);
		
		
		System.out.println("Inicio: "+ inicio + "Fim: " +fim);
		
		
	}

}
