package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioClasse;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<FuncionarioClasse> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int n = scan.nextInt();
		
		
		for(int i = 0; i < n ; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1)+ ":");
			System.out.print("Id: ");
			int id = scan.nextInt();
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Salario: ");
			double salario = scan.nextDouble();
			list.add(new FuncionarioClasse(id, nome, salario));
			
		}
		
		System.out.println();
		System.out.println("Digite o Id do Funcionario que irá receber o acréscimo: ");
		int id = scan.nextInt();
		FuncionarioClasse func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Esse ID não existe!");
		}else {
			System.out.println("Digite a porcentagem: ");
			double porcentagem = scan.nextDouble();
			func.acrescentarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		for(FuncionarioClasse obj : list) {
			System.out.println(obj);
		}
		
		
		scan.close();
	}

}
