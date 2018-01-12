/*O propósito das assertions é para serem utilizadas em modo desenvolvimento, por padrão elas vem desativadas, 
elas possuem a utilidade de checar a execução do programa. Você pode habilitar uma assetion para um pacote especifico
 ou desabilitar, na IDE eclipse você  acessa o menu Run configuration 
 na aba arguments  entre no campo VM arguments   e adicione -ea
*/

import java.util.Scanner;

public class Assetion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número de 0 a 10");
		int numero = entrada.nextInt();
		
		assert (numero >= 0 && numero <= 10): "Número invalido" +numero;
		System.out.println("Voê entrou "+numero);
		

	}

}
