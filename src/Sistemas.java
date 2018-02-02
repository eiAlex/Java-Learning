import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	public static void main(String[] args) throws IOException {

		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		p.setProperty("teste.test", "1.0.0");

		Set<Object> pk = p.keySet();
		for (Object key : pk) {
			System.out.println(key + " = " + p.get(key));
		}

		Console c = System.console(); // Útil para aplicações que interagem com prompt de comando

		Runtime.getRuntime().exec("notepad"); // executa uma aplicação do SO

	}

}
