package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String g = "Good Lord";
		g = g.replace("Lord", "Night");
		g = g.toUpperCase();
		g = g.concat("!!!");
				
		System.out.println(g);
		
		String i = "Ian".toUpperCase();
		IO.println(i);
		
		String A  = "Quando eu falar e quando eu ouvir que ";
		String B = "o amor brilhe através de mim";
		String C = "!!!";
		String D = (A + B).toUpperCase().replace("EU", "Ian")
				.concat(C);
		IO.print(D);
		
		// Tipos primitivos não tem a notação (.)
	}
}
