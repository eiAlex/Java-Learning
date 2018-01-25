import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>(); // Ela trabalha de um forma semelhante a um array esta lista aceita elementos duplicados
		
		list.add("Futebol");
		list.add("Tenis");
		list.add("Natação");
		list.add("Futebol");
		
		System.out.println(list);
		
		for(int i =0 ; i< list.size(); i++) {
			
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
			
		}
		System.out.println(list);
		
		
	}

}
