/*O objeto string não é mutavel e a cada função de modficação que realizamos sempre é criado outro membro na memoria.*/
public class StringMutavel {

	public static void main(String[] args) {

		
		StringBuffer s0 = new StringBuffer(); // muito bom para metodos sincronizados em ambientes multprocessador
		StringBuilder s1 = new StringBuilder("java");
		
		s1.toString();
		s1.length();
		s1.capacity();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s1.reverse());
		System.out.println(s1.append(args.toString()));
		
	}

}
