package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		//Aluno aluno = new Aluno();
		
		Aluno.nome = scan.nextLine();
		Aluno.nota1 = scan.nextDouble();
		Aluno.nota2 = scan.nextDouble();
		Aluno.nota3 = scan.nextDouble();
		
		System.out.printf("Resultado: %.2f%n", Aluno.calcularMedia());
		
		if(Aluno.calcularMedia() < 60) {
			System.out.println("Reprovado!");
			System.out.printf("faltam %.2f pontos%n", Aluno.pontosFaltando());
		}else {
			System.out.println("Aprovado!");
		}
		
		scan.close();
		
	}

}
