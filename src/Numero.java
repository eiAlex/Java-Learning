import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

//Assim como as datas no java os numero podem ser internacionalizados
public class Numero {

	public static void main(String[] args) throws ParseException {

		double saldo = 123_122_123.22;
		NumberFormat nf = NumberFormat.getInstance();

		System.out.println(nf.format(saldo)); //gen�ricos

		nf = NumberFormat.getIntegerInstance();

		System.out.println(nf.format(saldo)); //inteiros
		
		nf = NumberFormat.getPercentInstance();

		System.out.println(nf.format(saldo)); //percentuais
		
		
		nf = NumberFormat.getCurrencyInstance();

		System.out.println(nf.format(saldo)); //gen�rico 


		nf = NumberFormat.getCurrencyInstance(); //� poss�vel formatar o numero m�ximo de casas decimais.
		nf.setMaximumFractionDigits(1);
		System.out.println(nf.format(saldo)); //gen�rico 
		
		
		//Internacionaliza��o 
		
		nf = NumberFormat.getCurrencyInstance(Locale.US); //� poss�vel formatar o numero m�ximo de casas decimais.
		System.out.println(nf.format(saldo)); //gen�rico 
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE); //� poss�vel formatar o numero m�ximo de casas decimais.
		System.out.println(nf.format(saldo)); //gen�rico 
		
		//podemos realiza a convers�o inversa 
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.parse("R$ 1.100,25"));
		
		
	}

}
