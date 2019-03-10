package entities;

//CONSTRUCTORS

public class Produto2 {

	public String name;
	public double preco;
	public int quantidade; // Esse atributo

	public Produto2() { // CONSTRUTOR PADRÃO

	}

	public Produto2(String name, double preco, int quantidade) {
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto2(String name, double preco) {
		this.name = name;
		this.preco = preco;

	}

	// GETTERS SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade; // This.quantidade serve para referenciar o atributo quantidade da classe.
	}

	public void removeProduto(int quantidade) {
		if (quantidade < 0) {
			System.exit(0);
		} else {
			this.quantidade -= quantidade;
		}
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: RS "
				+ String.format("%.2f", valorTotalEstoque());
	}
}
