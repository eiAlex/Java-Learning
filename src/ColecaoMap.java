import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		//Na collction MAP os dados podem ser iguais mas s� possuem uma chave �nica.
		Map<String, String> pais = new HashMap<>();
		pais.put("BR","Brasil");
		pais.put("RU", "Russia");
		pais.put("CN", "China");
		
		System.out.println(pais);
		System.out.println(pais.containsKey("BR")); //Verifica se existe uma chave
		System.out.println(pais.containsValue("Brasil")); //Verifica se existe um valor
		System.out.println(pais.get("BR")); //recupera um conte�do
		System.out.println(pais.remove("RU")); // remove um conte�do
		
		//percorrendo um map
		Set<String> Keys = pais.keySet();
		
		for (String key : Keys) {
			System.out.println(key + " : " +pais.get(key));
		}
		
		
	}

}
