import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Refexao {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {
		String str = new String("Anselmo");
		Field atributos[] = null;
		Method metodos[] = null;

		Class c = str.getClass();

		atributos = c.getDeclaredFields();

		System.out.println("ATRIBUTOS:");
		for (int i = 0; i < atributos.length; i++) {
			System.out.println(atributos[i].toString());
		}

		metodos = c.getMethods();
		System.out.println("MÉTODOS:");
		for (int i = 0; i < metodos.length; i++) {
			System.out.println(metodos[i].toString());
		}

		// invocar um método de uma classe a partir da String do seu nome
		String stringNomeClasse = "reflexao.matematica";
		String stringNomeMetodo = "pi";
		String stringNomeMetodoNome = "nomeClasse";
		String stringNomeSoma = "soma";

		// carrega a classe
		Class classeGenerica = Class.forName(stringNomeClasse);

		// instancia um objeto
		Object obj = classeGenerica.newInstance();

		// retorna todos os métodos da classe passada
		Method metodoPI = classeGenerica.getMethod(stringNomeMetodo);
		Method metodoNome = classeGenerica.getMethod(stringNomeMetodoNome);

		// invoda o método do obj instanciado
		System.out.println(metodoPI.invoke(obj).toString());

		// caso o método seja estático
		System.out.println(metodoNome.invoke(stringNomeClasse));

		// chama um método com parâmetros
		Method soma = classeGenerica.getMethod(stringNomeSoma, int.class, int.class);
		System.out.println(soma.invoke(obj, 5, 10));
	}
}