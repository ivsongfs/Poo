package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = scan.nextLine();
		System.out.print("Preço: ");
		double preco = scan.nextDouble();
		System.out.print("Quantidade no estoque: ");
		int quantidade = scan.nextInt();
		
		Produto produto = new Produto(name, preco, quantidade);

		System.out.println();
		System.out.println("Dados do Produto: " + produto);

		System.out.println();
		System.out.println("Entre o numero de produtos para serem adcionados para estoque:");
		quantidade = scan.nextInt();
		produto.addProduto(quantidade);

		System.out.println();
		System.out.println("Dados Atualizados: " + produto);

		System.out.println();
		System.out.println("Entre o numero de produtos para serem retirados: ");
		quantidade = scan.nextInt();
		produto.removeProduto(quantidade);

		System.out.println();
		System.out.println("Dados Atualizados: " + produto);

		scan.close();

	}

}
