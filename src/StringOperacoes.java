
public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "write once";
		String s2 = "Run Anywhere!";
		String s3 =  new String ( "Java Virtual Machine");
		
		char [] array = {'j','a','v','a'};
		String s4 = new String(array);
		
		//operações
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(0)); //0 a lenght -1
		
		// localização
		
		System.out.println(s3.indexOf("Virtual")); //retorna o indice case sensitive
		System.out.println(s3.indexOf('j')); //retorna o indice
		System.out.println(s3.isEmpty());
		
		//comparação
		String test = "string";
		
		System.out.println("string".equals(test));
		System.out.println("STRING".equalsIgnoreCase(test)); //ignora maiúsculas e minúsculas
		System.out.println("st".startsWith(test)); //verifica se começa com com partes da string
		
		System.out.println("amor".compareTo("bola")); //-1 checa ordem alfabetica
		System.out.println("bola".compareTo("amor")); //1
		System.out.println("bola".compareTo("bola")); //0
	
		System.out.println("Olhe, Olhe!".regionMatches(true, 6, "olhe", 0, 0)); //comparar string dentro de string
		
		String l = "O Brasil é lindo"; // busca corta a string
		System.out.println(l.substring(11));
		System.out.println(l.substring(2,8));
		
		System.out.println(l.replace('s', 'z')); // troca de carcctere
		System.out.println(l.replaceFirst(" ", "x")); // troca a primeira ocorrencia
		
		System.out.println(l.toUpperCase()); // letras maiúsculas
		
		System.out.println("      espaços        ".trim()); //remove os espaços antes e depois da string
		
		
		
		
		
	}

}
