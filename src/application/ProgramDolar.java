package application;

import java.util.Locale;
import java.util.Scanner;

import util.Dolar;

public class ProgramDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o preço do Dolar? ");
		Dolar.dolar = scan.nextDouble();
		
		System.out.print("Quantos dolares vão ser convertidos? ");
		Dolar.reais = scan.nextDouble();
		
		System.out.printf("Valor a pagar em reais = %.2f", Dolar.converter());
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
