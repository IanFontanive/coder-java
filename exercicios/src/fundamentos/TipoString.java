package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		IO.println("Hello There".charAt(10));
		
		//O valor inicial de uma String imutavel,
		//apenas substiuível 
		String a = "Ryze Blue";
		
		IO.print(a.concat(" !!!"));
		
		IO.println(a.startsWith("Ryze"));
		IO.println(a.startsWith("ryze"));
		IO.println(a.endsWith("Blue"));
		IO.println(a.length());
		System.out.println(a.equals("ryze blue"));
		System.out.println(a.equalsIgnoreCase("ryze blue"));
	}
}
