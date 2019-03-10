package entities;

public class Account {

	private int numero_conta;
	private String dono;
	private double saldo;

	//COSNTRUTORES
	
	public Account(int numero_conta, String dono, double depositoInicial) {

		this.numero_conta = numero_conta;
		this.dono = dono;
		deposito(depositoInicial);
	}

	public Account(int numero_conta, String dono) {

		this.numero_conta = numero_conta;
		this.dono = dono;
	}
	
	//GETTERS AND SETTERS

	public int getNumero_conta() {
		return numero_conta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}


	//MÉTODOS
	
	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	//TOSTRING
	public String toString() {
		return "Conta "
				+ numero_conta + ","
				+ " Dono: "
				+ dono + ","
				+ " Saldo: $"
				+ String.format("%.2f", saldo);
	}
	


}
