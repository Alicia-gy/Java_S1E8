package n1e8;

public class App {
	
	public static void main(String[] args) {
		
		Reversing reversed = string -> String.valueOf(new StringBuilder(string).reverse());
		
		String paraula = "Paraula";
		System.out.println(reversed.reverse(paraula));
	}
}
