package fundamentos;

public class AreaCircuferencia {
	//Main é a porta de entrada de um programa Java!
	public static void main(String[] args) {
		double raio = 3.4;
		//Cosntantes usam letras maiúsculas
		final double PI = 3.14159;
		
		double area = PI* raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area);
	}
}
