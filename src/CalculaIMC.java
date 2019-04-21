//Calcula o IMC


public class Principal {

	public static void main(String[] args) {

		
		
		
		
		
		double pesoEmQuilogramas = 70;
		double alturaEmMetros = 1.75;
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso";
		
		System.out.println("IMC: " +imc);
		System.out.println(msg);
		
		
		
	}

}
