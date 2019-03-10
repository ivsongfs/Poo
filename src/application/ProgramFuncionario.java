package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o valor do Salário bruto: ");
		funcionario.salario_bruto = scan.nextDouble();
		
		
		
		
		funcionario.calculoDesconto();
		
		System.out.println(funcionario);
		
		scan.close();

	}

}
