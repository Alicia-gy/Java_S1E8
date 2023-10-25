package n1e3;

import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<String> months = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
		
		months.forEach(month -> System.out.println(month));

	}
}
