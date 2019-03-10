package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario2;

public class ProgramFuncionario2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Funcionario2 funcionario = new Funcionario2();

		System.out.println("Nome do funcionário: ");
		funcionario.nome = scan.nextLine();

		System.out.println("Salario Bruto: ");
		funcionario.salarioBruto = scan.nextDouble();

		System.out.println("Imposto: ");
		funcionario.taxa = scan.nextDouble();
        
		System.out.println();
		System.out.println("Funcionario:" + funcionario);
		System.out.println();

		System.out.println("Qual porcentagem para incrementar no salario: ");
		double incremento = scan.nextDouble();

		funcionario.calcularIncremento(incremento);

		System.out.printf("Updated: %s, $ %.2f", funcionario.nome, funcionario.salarioBruto);

		scan.close();

	}

}
