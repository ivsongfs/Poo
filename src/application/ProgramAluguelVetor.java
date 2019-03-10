package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class ProgramAluguelVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];

		System.out.print("Quantos quartos vão ser alugados? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			scan.nextLine();
			System.out.println("Aluguel #" + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			System.out.print("E-mail: ");
			String email = scan.nextLine();
			System.out.print("Numero do quarto: ");
			int quarto = scan.nextInt();
			System.out.println();
			aluguel[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados:");
		for(int i = 0; i < 10; i++) {
			if(aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
			}
		}

		scan.close();

	}

}
