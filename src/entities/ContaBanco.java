package entities;

public class ContaBanco {
	private int numero_conta;
	private String nome_dono;
	private double saldo;
	
	
	//CONTRUTORES
	public ContaBanco(int numero_conta, String nome_dono, double depositoInicial) {
		this.numero_conta = numero_conta;
		this.nome_dono = nome_dono;
		deposito(depositoInicial);
	}

	public ContaBanco(int numero_conta, String nome_dono) {
		this.numero_conta = numero_conta;
		this.nome_dono = nome_dono;
	}

	//GETTERS AND SETTERS
	
	public String getNome_dono() {
		return nome_dono;
	}

	public void setNome_dono(String nome_dono) {
		this.nome_dono = nome_dono;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	//TO STRING
	
	public String toString() {
		return "Numero Conta: "
				+ numero_conta + ", "
				+"Dono: "
				+ nome_dono + ", "
				+"Saldo: "
				+"$ " + saldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
