
public class StringToke {

	public static void main(String[] args) {

		//tokenização de strings
		
		String s1 ="Html;CSS;JavaScrpt;Java";
		String [] tokens = s1.split(";");
		System.out.println(tokens.length);
		
		for (String token :tokens) {
			System.out.println(token);
			
		}
		
	}

}
