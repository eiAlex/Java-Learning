//SorteiaCarta

//Apalicação básica em Java para sortear uma carta

import java.util.Random;

public class principal {

	public static void main(String[] args) {

		String	 faces[] = {"A","2","3","4","5","6","7","8","9","10","Valet","Dama","Rei"};
		String 	 nipes[] = {"Espadas","Paus","Copas","Ouros"};
		
		
		Random r = new Random();
		int facesRandom = r.nextInt(faces.length);
		int nipesRandom = r.nextInt(nipes.length);
		
		String carta = faces[facesRandom] + " de " + nipes[nipesRandom];
		
		System.out.println(carta);
		
		
		
	}

}
