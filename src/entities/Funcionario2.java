package entities;

public class Funcionario2 {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	
	
	
	
	public double calculoLiquido() {
		double salarioLiquido = salarioBruto - taxa;
		return salarioLiquido;
	}
	
	public  void calcularIncremento (double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100 - taxa;
	}
	
	
	
	public String toString() {
		return 
			   " "	
			   + nome
			   + ", "
			   + String.format("%.2f", calculoLiquido());
			   
	}
}
