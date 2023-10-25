package n2e3;

public class App {

	public static void main(String[] args) {
		Operation sum = (a, b) -> a + b;
		Operation resta = (a, b) -> a - b;
		Operation mult = (a, b) -> a * b;
		Operation div = (a, b) -> a / b;
		
		System.out.println(sum.operacio(5, 10));
		System.out.println(resta.operacio(5, 10));
		System.out.println(mult.operacio(5, 10));
		System.out.println(div.operacio(5, 10));

	}

}
