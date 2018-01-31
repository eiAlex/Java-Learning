import java.io.Serializable;

@AnotacaoCabecalho(instuicao = "SalaDeTI", projeto = "Exempro", dataCriacao = "01/10/12", criado = "Alex", revisao = 1)

//permite suprimir warnings
@SuppressWarnings("serial")
public class Anotacao implements Serializable {

	//informa que vai ser depreciado
	@Deprecated
	public void anotar() {
		//faz anotação.
	}
	
	// informa que sera sobrescrevido.
	@Override
	public String toString() {
		return null;
	}
	
	@SuppressWarnings("unused")
	private  int x;
	
}
