package application;

import java.util.Scanner;

import entities.CalculoMedia;

public class teste1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CalculoMedia a1;
		a1 = new CalculoMedia();
		
		
		System.out.println("Digite a primeira nota: ");
		a1.n1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		a1.n2 = scan.nextDouble();
		
		double media = (a1.n1 + a1.n2) / 2;
		
		System.out.println("Media: " + media);
		
		scan.close();
	}

}
