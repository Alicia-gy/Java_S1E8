package n1e2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Palabra", "Otra palabra", "palabra2", "otra", "O");
		listWithO(list).forEach(System.out::println);
			

	}
	
	public static List<String> listWithO(List<String> list) {
		return list.stream().filter(string -> (string.toLowerCase().contains("o")) && string.length() > 5).collect(Collectors.toList());
	}
}
