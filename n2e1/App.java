package n2e1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Alba", "Ana", "Petita", "Fulanita", "Alicia", "Pep", "Aaa", "aaa");
		listThreeWithA(list).forEach(System.out::println);
			

	}
	
	public static List<String> listThreeWithA(List<String> list) {
		return list.stream().filter(string -> (string.charAt(0) == 'A') && string.length() == 3).collect(Collectors.toList());
	}
}
