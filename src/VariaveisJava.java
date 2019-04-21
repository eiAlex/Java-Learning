public class VariaveisJava {

	public static void main(String[] args) {

		// Variavéis Java.
		
		boolean f = true;
		char s = 'm';
		
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		long d = 9223372036854775807L;
		int e = 0;
		
		a += 1; // Um complemento de dois do valor obtido será o resultado. Por exemplo,
		b += 1; // se a variável for do tipo byte, ocorrem os seguintes
		c += 1; // resultados: 127+1 = -128, 127+9=-120 e 127+127=-2.
		d += 1;

		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
		System.out.println("Valor de c = " + c);
		System.out.println("Valor de d = " + d);
		
		 d /= e; // Vai dar erro porque e = 0
		 
		//  Uma excessão do tipo ArithmeticException é levantada caso ocorra uma divisão por zero. 
		 

	}

}
