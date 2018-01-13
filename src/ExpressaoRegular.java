import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		boolean b = "JAVA".matches("JAVA"); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(b);
		
	/*	MODIFICADORES
		(?i), Ignora maiuscula e minuscula
		(?x), Comentarios
		(?m), Multilinhas
		(?s), Dottal
		*/
		
		boolean c = "jAVA".matches("(?im)JAVA"); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(c);
		
/*	Metacaracteres
	.qualquer cactere
	\d d�gitos
	\D n�o � digito
	\s espa�os
	\S n�o � espa�os
	\w letra
	\W n�o � letra
		*/
		
		boolean d = "@".matches("."); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(d);
		
		boolean e = "2".matches("\\d"); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(e);
		
		boolean f = "w".matches("\\w"); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(f);
		
/*		QUANTIFICADORES
		x{n} X,exatamente n vezes
		x {n,} X,pelo menos n vezes
		x{n,m} X, pelo menos n mas n�o mais do que m vezes 
		x? { n, m} X, pelo menos n mas n�o mais que m vezes
		X* X, o ou 1 vez
		X+ x, 1 ou + vezes*/
		
		boolean g = "21".matches("\\d{2}"); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(g);
		boolean h = "212".matches("\\d{2,}"); //express�es regulares s�o sencivels a maiusculas e minusculas
		System.out.println(h);
		
		
		
		//espress�o regular para validar cep
		
		
		boolean cep = "35700-000".matches("\\d{5}-\\d{3}"); 
		System.out.println(cep);
		
		//espress�o regular para validar data
		
		
		boolean data = "01/01/2010".matches("\\d{2}/\\d{2}/\\d{4}"); 
		System.out.println(data);
		
		
		
	/*	Metacaractere de fronteira
		^  inicia
		$  finaliza
		| ou*/ 
		
		
		boolean i = "Alex10".matches("^Alex.*"); 
		System.out.println(i);
		
		boolean j = "Tem java aqui".matches(".*java.*"); 
		System.out.println(j);
		
		boolean h1 = "Tem java aqui".matches("^Tem.* aqui$"); 
		System.out.println(h1);
		
	/*	AGRUPADORES
		[...]  agrupamentos
		[a-z]	alcance
		[a-e][i-u]	uni�o
		[a-z&&[aeiou]]	interse��o
		[^abc]	exce��o
		[a-z&&[^m-p]] subtra��o
		\x fuga literal
		*/
		
		
		boolean l = "x".matches("[a-z]"); 
		System.out.println(l);
		boolean m = "1".matches("[0-9]"); 
		System.out.println(m);
		
		//para verifica��es mais profunda de expre��es e quando for necessarios uma maior performance recomenda-se a utiliza��o do 
		//pattern pois ele carrega a straing
		String doce = "Qual � o Doce mais DoCe que o doce de Batata DOce";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while (matcher.find()) {
			System.out.println(matcher.group());
		
		}
		
		/*SUBSTITUI��ES*/
		
		String x = doce.replaceAll("(?i)doce", "docinho");
		System.out.println(x);
		
		
		
		
		
		
		
		
	}

}
