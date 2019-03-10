package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Largura: ");
		retangulo.largura = scan.nextDouble();
		
		System.out.println("Altura: ");
		retangulo.altura = scan.nextDouble();
		
		System.out.println(retangulo);
		

		scan.close();
		
	}
	
	
}
