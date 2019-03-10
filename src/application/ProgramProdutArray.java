package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutArray;

public class ProgramProdutArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // Digitando o valor
		
		ProdutArray[] vetor = new ProdutArray[n]; // O valor aatribuido na variável N vai ser utilizado para definir o tamanho do vetor.
		
		for(int i = 0 ; i < vetor.length ; i++) {
			scan.nextLine();
			String nome = scan.nextLine();
			double preco = scan.nextDouble();
			vetor[i] = new ProdutArray(nome, preco);
			
		}
		
		double soma = 0;
		
		for ( int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("Media: %.2f", media);
		
		scan.close();

	}

}
