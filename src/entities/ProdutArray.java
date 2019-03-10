package entities;

public class ProdutArray {
	private String nome;
	private double preco;
	
	//CONSTRUTORES
	public ProdutArray(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
