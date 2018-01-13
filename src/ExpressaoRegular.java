import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		boolean b = "JAVA".matches("JAVA"); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(b);
		
	/*	MODIFICADORES
		(?i), Ignora maiuscula e minuscula
		(?x), Comentarios
		(?m), Multilinhas
		(?s), Dottal
		*/
		
		boolean c = "jAVA".matches("(?im)JAVA"); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(c);
		
/*	Metacaracteres
	.qualquer cactere
	\d dígitos
	\D não é digito
	\s espaços
	\S não é espaços
	\w letra
	\W não é letra
		*/
		
		boolean d = "@".matches("."); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(d);
		
		boolean e = "2".matches("\\d"); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(e);
		
		boolean f = "w".matches("\\w"); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(f);
		
/*		QUANTIFICADORES
		x{n} X,exatamente n vezes
		x {n,} X,pelo menos n vezes
		x{n,m} X, pelo menos n mas não mais do que m vezes 
		x? { n, m} X, pelo menos n mas não mais que m vezes
		X* X, o ou 1 vez
		X+ x, 1 ou + vezes*/
		
		boolean g = "21".matches("\\d{2}"); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(g);
		boolean h = "212".matches("\\d{2,}"); //expressões regulares são sencivels a maiusculas e minusculas
		System.out.println(h);
		
		
		
		//espressão regular para validar cep
		
		
		boolean cep = "35700-000".matches("\\d{5}-\\d{3}"); 
		System.out.println(cep);
		
		//espressão regular para validar data
		
		
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
		[a-e][i-u]	união
		[a-z&&[aeiou]]	interseção
		[^abc]	exceção
		[a-z&&[^m-p]] subtração
		\x fuga literal
		*/
		
		
		boolean l = "x".matches("[a-z]"); 
		System.out.println(l);
		boolean m = "1".matches("[0-9]"); 
		System.out.println(m);
		
		//para verificações mais profunda de expreções e quando for necessarios uma maior performance recomenda-se a utilização do 
		//pattern pois ele carrega a straing
		String doce = "Qual é o Doce mais DoCe que o doce de Batata DOce";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while (matcher.find()) {
			System.out.println(matcher.group());
		
		}
		
		/*SUBSTITUIÇÕES*/
		
		String x = doce.replaceAll("(?i)doce", "docinho");
		System.out.println(x);
		
		
		
		
		
		
		
		
	}

}
