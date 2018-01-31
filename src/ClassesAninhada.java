public class ClassesAninhada {

	/**
	 * Uma documentação de exemplo <code> Exemplo </code>
	 * Deve se adicionar uma breve descrição do código fonte.
	 * 
	 * @author Alex Junio
	 * @author Alex Silva
	 * @version 1.0
	 * @since 1.0 
	 * 
	 * @see java.lang
	 * @see java.lang
	 *
	 */

	private String texto = "texto externo";

	public class Interna {

		private String texto = "texto interno";

		public void imprimeTexto() {
			System.out.println(texto);

			// consegue ver membros da classe externa
			System.out.println(ClassesAninhada.this.texto);
		}
	}

	/**
	 * anotação de método deve ter uma breve descrição sobre sua execução.
	 * @param args
	 */
	public static void main(String[] args) {

		ClassesAninhada externa = new ClassesAninhada();
		Interna interna = externa.new Interna();

		interna.imprimeTexto();
	}
}