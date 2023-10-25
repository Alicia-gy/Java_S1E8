package n1e1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Palabra", "Otra palabra", "palabra2", "otra");
		listWithO(list).forEach(System.out::println);
			

	}
	
	public static Stream<String> listWithO(List<String> list) {
		return list.stream().filter(string -> string.contains("o")||string.contains("O"));
	}
}
