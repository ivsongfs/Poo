package entities;

public class Funcionario {
	public double salario_bruto;
	public double salario_liquido;
	public double desconto;
	
	
	
	
	public double calculoSalarioBruto() {
		this.salario_liquido = salario_bruto - desconto;
		return salario_bruto;
	}
	
	public double calcularAumento(double aumento) {
		aumento = (aumento * salario_liquido) / 100;
		return aumento;
	}
	
	public double calculoDesconto() {
		this.desconto = salario_bruto * 0.2;
		return this.desconto;
	}
	
	
	public String toString() {
		return  "Salario bruto: R$"
				+ String.format("%.2f", salario_bruto)
				+ " Desconto: R$" 
				+ String.format("%.2f", desconto);
				
	}
	
}
