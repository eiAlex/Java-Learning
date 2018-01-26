import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		String[] cores = {"Verde", "Amarelo","Azul","Branco","Verde"};
		
		List<String>  list = Arrays.asList(cores);
		Set<String> set = new HashSet<>(list); //A collection Set recebe um lista de elementos não duplicados 
		System.out.println(set.toString());
		
		
	}

}
