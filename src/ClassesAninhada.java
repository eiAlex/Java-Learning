public class ClassesAninhada {

	/**
	 * Uma documenta��o de exemplo <code> Exemplo </code>
	 * Deve se adicionar uma breve descri��o do c�digo fonte.
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
	 * anota��o de m�todo deve ter uma breve descri��o sobre sua execu��o.
	 * @param args
	 */
	public static void main(String[] args) {

		ClassesAninhada externa = new ClassesAninhada();
		Interna interna = externa.new Interna();

		interna.imprimeTexto();
	}
}