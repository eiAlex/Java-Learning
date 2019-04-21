
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int palpite;
		int valorDado;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu palpite de 1 a 6 : ");
		palpite=entrada.nextInt();
		
		while (palpite <= 0 || palpite > 6) {
			System.err.println("Seu palpite " +palpite +" é invalido");
			System.out.println("Informe seu palpite de 1 a 6 : ");
			palpite=entrada.nextInt();	
		}
		
		Random r = new Random();
		
		valorDado =  r.nextInt(6) + 1;
		
		if (valorDado == palpite) {
			System.out.println("Você Acertou !");
			System.out.println("|Palpite = " + palpite+" |"+ "|Valor sorteado = " +valorDado+ " |");
			
		}else {
			System.out.println("Você Errou!");
			System.out.println("|Palpite = " + palpite+" |"+ "|Valor sorteado = " +valorDado+ " |");
		}
		
		
		
	}

}
