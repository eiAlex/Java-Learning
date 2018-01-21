import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {

		// Tempo 0 : 01/01/1970

		// Tempo atual a partir de 1970 em milesegundos
		System.out.println(System.currentTimeMillis());

		Date agora = new Date();

		// data atua do sistema.
		System.out.println(agora);

		// métodos classe Date

		Date data = new Date();

		System.out.println(data.getTime());

		// para manipular datas utilizes classe Calendar

		// Por default ele retorna um GregorianCalendar
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);

		System.out.println(c.getTime());

		System.out.println(c.get(Calendar.YEAR)); // ano
		System.out.println(c.get(Calendar.MONTH)); // mês 0-11 0 = Janeiro - 12 = Dezembro

		// saudação

		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if (hora <= 12) {
			System.out.println("Bom Dia! ");

		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde");

		} else {
			System.out.println("Boa noite");
		}
	}
}
