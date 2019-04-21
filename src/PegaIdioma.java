/**
 * # JUserLocale
 * Este codigo serve para pegar o idioma do sistema operacional.
 * This code is used to pick up the language of the operatin
 * 
 */


/**
 * @author Alex
 * @version 1.0
 */
public class Main {
	
	public static void main(String[] args) {

		Locale loc = Locale.getDefault();
		
		System.out.println("Sua liguagem é: " +loc.getDisplayLanguage() +",de sigla: "+loc.getLanguage());
		
		
	}

}
