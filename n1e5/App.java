package n1e5;

public class App {
	
	public static void main(String[] args) {
		
		PiValue pi = () -> 3.1415;
		System.out.println(pi.getPiValue());
	}
}
