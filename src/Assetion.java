/*O prop�sito das assertions � para serem utilizadas em modo desenvolvimento, por padr�o elas vem desativadas, 
elas possuem a utilidade de checar a execu��o do programa. Voc� pode habilitar uma assetion para um pacote especifico
 ou desabilitar, na IDE eclipse voc�  acessa o menu Run configuration 
 na aba arguments  entre no campo VM arguments   e adicione -ea
*/

import java.util.Scanner;

public class Assetion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero de 0 a 10");
		int numero = entrada.nextInt();
		
		assert (numero >= 0 && numero <= 10): "N�mero invalido" +numero;
		System.out.println("Vo� entrou "+numero);
		

	}

}
