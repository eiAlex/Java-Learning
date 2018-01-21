import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();
		c.set(1991, Calendar.JUNE, 15);
		Date date = c.getTime();

		System.out.println(date);

		// formatação de datas

		DateFormat dateFormat = DateFormat.getDateInstance(); // fornece uma formtação de acordo com a instacia do
																	// SO

		System.out.println(dateFormat.format(date));

		// Estilo de formatação

		dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, 0);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, 0);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, 0);
		System.out.println(dateFormat.format(date));
		
		
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, 0);
		System.out.println(dateFormat.format(date));

		
		// O elemento DATE pode ser usado para conversões de data 
		
		DateFormat dateFormat2 = DateFormat.getDateInstance();
		Date data2 = dateFormat2.parse("10/12/1991");
		System.out.println(data2);
		
		//SimpleDateFormat
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf.parse("10/10/2010"));
		
		
	}

}
