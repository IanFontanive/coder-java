package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(F - 32) x 5/9 = C
		final double MULTIPLICADOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		//ALT setas para mover linhas de códigos
		double FAHRENHEIT = 64; 
		double celsius = (FAHRENHEIT - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura é: " + celsius);
		
		FAHRENHEIT = 150; 
		celsius = (FAHRENHEIT - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura é: " + celsius);
		
		
	}
}	
