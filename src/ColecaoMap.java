import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {

	public static void main(String[] args) {

		//Na collction MAP os dados podem ser iguais mas só possuem uma chave única.
		Map<String, String> pais = new HashMap<>();
		pais.put("BR","Brasil");
		pais.put("RU", "Russia");
		pais.put("CN", "China");
		
		System.out.println(pais);
		System.out.println(pais.containsKey("BR")); //Verifica se existe uma chave
		System.out.println(pais.containsValue("Brasil")); //Verifica se existe um valor
		System.out.println(pais.get("BR")); //recupera um conteúdo
		System.out.println(pais.remove("RU")); // remove um conteúdo
	}

}
