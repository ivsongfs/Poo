package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0;
		
		for(int i= 0 ; i < n; i++) { // percorrendo o vetor
			vetor[i] = scan.nextDouble();
			soma = soma + vetor[i];
		}
		
		double media = soma/ n;
		
		System.out.printf("Media: %.2f%n", media);
		
		scan.close();
		
	}

}
