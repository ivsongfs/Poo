package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListas {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>(); //Lista
		
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ivson");
		list.add("Gomes");
		list.add("Silva");
		
		list.add(2,  "Marco"); // adcionando na posição 2
		
		
		
		
		
		System.out.println(list.size()); // tamanho da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		
		list.remove("Alex");
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");

		System.out.println("Index of Ivson " + list.indexOf("Ivson"));
		System.out.println("Index of Gomes " + list.indexOf("Gomes"));
		
		System.out.println("---------------");
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------");
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		
	}

}
