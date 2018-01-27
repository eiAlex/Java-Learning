
public class Generico <E> {

	
	E elemento ;
	
	
	public E getElemento() {
		return elemento;
	}


	public void setElemento(E elemento) {
		this.elemento = elemento;
	}


	public static void main(String[] args) {

		Generico<String> g = new Generico<>();
		g.setElemento("Teste String");
	//	g.setElemento(1111);
		
		System.out.println(g.getElemento().toUpperCase());
		
		
	}

}
