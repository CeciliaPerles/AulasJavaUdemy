package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Joana");
		list.add("Jose");
		list.add("Joao");
		list.add(2, "Miguel");

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("----------------------");

		/*list.removeIf(x -> x.charAt(0) == 'M');

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------");

		list.removeIf(x -> x.charAt(0) == 'J');

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Index of Joana: " + list.indexOf("Joana"));
		System.out.println("----------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}*/
		
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);

	}

}
