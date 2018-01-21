import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

//Assim como as datas no java os numero podem ser internacionalizados
public class Numero {

	public static void main(String[] args) throws ParseException {

		double saldo = 123_122_123.22;
		NumberFormat nf = NumberFormat.getInstance();

		System.out.println(nf.format(saldo)); //genéricos

		nf = NumberFormat.getIntegerInstance();

		System.out.println(nf.format(saldo)); //inteiros
		
		nf = NumberFormat.getPercentInstance();

		System.out.println(nf.format(saldo)); //percentuais
		
		
		nf = NumberFormat.getCurrencyInstance();

		System.out.println(nf.format(saldo)); //genérico 


		nf = NumberFormat.getCurrencyInstance(); //É possível formatar o numero máximo de casas decimais.
		nf.setMaximumFractionDigits(1);
		System.out.println(nf.format(saldo)); //genérico 
		
		
		//Internacionalização 
		
		nf = NumberFormat.getCurrencyInstance(Locale.US); //É possível formatar o numero máximo de casas decimais.
		System.out.println(nf.format(saldo)); //genérico 
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE); //É possível formatar o numero máximo de casas decimais.
		System.out.println(nf.format(saldo)); //genérico 
		
		//podemos realiza a conversão inversa 
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.parse("R$ 1.100,25"));
		
		
	}

}
