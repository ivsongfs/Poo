package entities;

public class Produto {

	public String name;
	public double preco;
	public int quantidade; // Esse atributo

	
	public Produto(String name, double preco, int quantidade) {
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String name, double preco) {
		this.name = name;
		this.preco = preco;
		
	}
	
	
	
	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade; // This.quantidade serve para referenciar o atributo quantidade da classe.
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: RS "
				+ String.format("%.2f", valorTotalEstoque());
	}
}
