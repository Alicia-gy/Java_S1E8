package n1e6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Palabra", "Otra palabra", "palabra2", "otra", "O");
		sortList(list).forEach(System.out::println);

	}
	
	public static List<String> sortList(List<String> list) {
		return list.stream().sorted(Comparator.comparing(string -> string.toString().length())).collect(Collectors.toList());
	}
}
