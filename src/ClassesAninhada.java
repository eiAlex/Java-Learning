public class ClassesAninhada {

	private String texto = "texto externo";
	
	public class Interna{
		
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(ClassesAninhada.this.texto); 
		}
	}
	
	public static void main(String[] args){
		
		ClassesAninhada externa = new ClassesAninhada();
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
	}
}