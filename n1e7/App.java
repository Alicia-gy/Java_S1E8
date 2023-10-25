package n1e7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Palabra", "Otra palabra", "palabra2", "otra", "O");
		sortList(list).forEach(System.out::println);
		reverseSortList(list).forEach(System.out::println);


	}
	
	public static List<String> sortList(List<String> list) {
		return list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
	}
	
	public static List<String> reverseSortList(List<String> list) {
		return list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
	}
}
