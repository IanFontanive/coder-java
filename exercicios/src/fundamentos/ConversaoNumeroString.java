package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Usando Wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		//Usando diretamente o tipo
		System.out.println(Integer.toString(num2).length());
	}
}
