package application;

public class ProgramBoxUnboxing {

	public static void main(String[] args) {
		int x = 20;
		
		Integer obj = x;
		
		System.out.println(obj);
		
		int y = obj; // Casting
		
		System.out.println(y);
		// Wrapper classes são classes que tem como objetivo 
		//tratar os tipos primitivos como classes só que de forma transparente.
		//Pq usar? Pq o wrapper classe aceita o valor nulo.

	}

}
