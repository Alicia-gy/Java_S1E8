package n1e4;

import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		printList(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));

	}
	
	public static void printList(List<String> list) {
		list.forEach(System.out::println);
	}

}
