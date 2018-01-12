/*A utilização do Try e do Catch auxilia não criação de aplicações robustas e tolerantes a falhas, 
a utilização deste recurso permite que o programa continue a executar mesmo que aconteça uma falha, já o bloco Finally é 
para garantir que um trecho de código seja sempre executado, 
isto pode ser observado quando se utiliza em conexões a bancos de dados entre outros.

*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class TrataTryCat {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a;
		int b;
		boolean continua = true;

		do {
			try {
				System.out.println("Informa um numero:");
				a = entrada.nextInt();
				System.out.println("Informe outro numero");
				b = entrada.nextInt();

				System.out.println("Resultado " + a / b);
				continua = false;
			} catch (ArithmeticException e) {
				System.err.println("ArithmeticException");
				entrada.nextLine();
			} catch (InputMismatchException e2) {

				System.err.println("InputMismatchException");
				entrada.nextLine();
			}
			
			finally {
				System.out.println("Fim do programa!");
			}

		} while (continua == true);
	
	
	
	
	}

}
