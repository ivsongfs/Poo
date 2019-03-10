package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramRadius {

		
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		 
		
		
		System.out.print("Digite o raio: ");
		double raio = scan.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI %.2f%n", Calculator.PI);
		
		
		
		scan.close();
		
	}
	
	
	
	

}
