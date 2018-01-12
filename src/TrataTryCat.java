/*A utiliza��o do Try e do Catch auxilia n�o cria��o de aplica��es robustas e tolerantes a falhas, 
a utiliza��o deste recurso permite que o programa continue a executar mesmo que aconte�a uma falha, j� o bloco Finally � 
para garantir que um trecho de c�digo seja sempre executado, 
isto pode ser observado quando se utiliza em conex�es a bancos de dados entre outros.

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
