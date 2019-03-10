package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account account;

		System.out.print("Digite o numero da conta: ");
		int numero = scan.nextInt();

		System.out.print("Digite o nome do Dono: ");
		scan.nextLine();
		String dono = scan.nextLine();
		

		System.out.println("Crie sua senha: ");
		int senha = scan.nextInt();
		
		
		System.out.println("Digite sua senha");
		int senhaComparacao = scan.nextInt();
		if(senha == senhaComparacao) {
			
		}else {
			System.out.println("Senha incorreta!");
			System.exit(0);
		}
		
		System.out.print("Tem deposito inicial (s/n)? ");
		char resposta = scan.next().charAt(0);
		if (resposta == 's') {

			System.out.print("Digite o deposito inicial: ");
			double depositoInicial = scan.nextDouble();
			account = new Account(numero, dono, depositoInicial);

		} else {
			account = new Account(numero, dono);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);

		System.out.println();

		System.out.print("Digite um valor para deposito: ");
		double valorDeposito = scan.nextDouble();
		account.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(account);

		System.out.println();

		System.out.print("Digite um valor para saque (Taxa de $5.00): ");
		double valorSaque = scan.nextDouble();
		if (valorSaque + 5 > account.getSaldo()) {
			System.out.println("Saldo insuficiente!");
			System.exit(0);
		} else {
			account.saque(valorSaque);
		}

		System.out.println("Dados da conta atualizados!");
		System.out.println(account);

		scan.close();

	}
}
