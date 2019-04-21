//calcula circulo

public class CalculaCirculo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo");
		double raio = in.nextDouble();
		
		//Diâmentro :2r
		
		double diametro = 2* raio;
		
		System.out.println("Diâmetro: " +diametro);
		
		//Circunferência : 2 PI r
		
		  final double PI = Math.PI;
		  double circunferencia = 2* PI * raio;
		  
		  System.out.println("Circunferência: " +circunferencia);
		  
		//Área PI r^2
		  
		  double area= PI * (Math.pow(raio, 2));
		  System.out.println("Área: "+area);
		  
		
	}

}
