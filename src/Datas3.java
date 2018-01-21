import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		c.set(1980, Calendar.FEBRUARY, 12);

		Date date = c.getTime();

		Locale padrao = Locale.getDefault(); // retorna o padrão do SO
		Locale brasil = new Locale("pt", "BR"); // setando um locale
		Locale india = new Locale("hi", "IN");
		Locale usa = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale china = Locale.CHINESE;

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, brasil);

		System.out.println(df.format(date));

		df = DateFormat.getDateInstance(DateFormat.FULL, india);

		System.out.println(df.format(date));

		df = DateFormat.getDateInstance(DateFormat.FULL, usa);

		System.out.println(df.format(date));

		df = DateFormat.getDateInstance(DateFormat.FULL, japao);

		System.out.println(df.format(date));
		
		

		df = DateFormat.getDateInstance(DateFormat.FULL, china);

		System.out.println(df.format(date));


	}

}
