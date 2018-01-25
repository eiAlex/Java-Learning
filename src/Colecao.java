import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>(); // Instância de Collection onde se é preciso definir o tipo de objeto
													// onde será implementado.

		c.add("A"); // Adiciona a uma list
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");

		System.out.println(c.toString()); // converte para String
		System.out.println(c.isEmpty()); //verifica se esta vazio
		System.out.println(c.contains("A")); //verifica se contem ocorrência de  um determinado elemento.

		c.remove("A"); // remove um elemento

		System.out.println(c.toString());

		//trabalhar com grupos de elementos
		
		Collection<String> c2 = Arrays.asList("F","G");
		
		c.addAll(c2); // o método recebe todos os elementos de outra collection
		
		System.out.println(c.toString()); //resultado dos dois elementos juntos 
		
		System.out.println(c.containsAll(c2)); //Verifica se existem todos os elemento da collection C2 em C
		
		System.out.println(c.removeAll(c2)); // remove todos elementos de uma coleção em outra.
		
		
		// Percorrer elementos de uma collection
		
		for(String string :c) {
			System.out.print(string);
		}
		
		//converter uma coleção em um array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		c.clear(); //limpa toda a collection
		System.out.println(c.toString()); 
		
	}

}
