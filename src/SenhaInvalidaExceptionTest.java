
public class SenhaInvalidaExceptionTest {
	
	static void autenticar(String senha) throws SenhaInvalidaException {
		
		if ("123".equals(senha)){
			//autenticado
			System.out.println("Senha Válida");
			
		}else {
			//senha incorreta
		throw new SenhaInvalidaException("Senha Invaalida");
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			autenticar("123w");
		}catch (SenhaInvalidaException e) {
			e.printStackTrace();
		}
		
	}

}
