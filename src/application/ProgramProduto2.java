package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto2;

public class ProgramProduto2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = scan.nextLine();
		System.out.print("Preço: ");
		double preco = scan.nextDouble();

		Produto2 produto = new Produto2(name, preco);

		produto.setName("Computador");
		System.out.println("Updated name: " + produto.getName());
		produto.setPreco(400);
		System.out.println("Upated preco: " + produto.getPreco());

		System.out.println();
		System.out.println("Dados do Produto: " + produto);

		System.out.println();
		System.out.println("Entre o numero de produtos para serem adcionados para estoque:");
		int quantidade = scan.nextInt();
		produto.addProduto(quantidade);

		System.out.println();
		System.out.println("Dados Atualizados: " + produto);

		System.out.println();
		System.out.println("Entre o numero de produtos para serem retirados: (< 0 para sair) ");
		quantidade = scan.nextInt();
		if (quantidade < 0) {
			System.out.println(produto);
			System.out.println("Fechando...");
		}
		produto.removeProduto(quantidade);

		System.out.println();
		System.out.println("Dados Atualizados: " + produto);

		scan.close();

	}

}
