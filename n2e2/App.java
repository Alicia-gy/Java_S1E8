package n2e2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 20, 51);
		System.out.println(evenList(list));
			

	}
	
	public static String evenList(List<Integer> list) {
		return list.stream().map(i -> (i%2 == 0 ? "e" : "o")+ i).collect(Collectors.joining(", "));
	}
}
