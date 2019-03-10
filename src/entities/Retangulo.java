package entities;

public class Retangulo {

	public double largura;
	public double altura;
	
	
	
	public double calculoArea() {
		double area = largura * altura;
		return area;
	}
	
	public double calculoPerimetro() {
		double perimetro = 2 * (altura + largura);
		return perimetro;
	}
	
	public double calculoDiagonal() {
		double diagonal = Math.sqrt(largura * largura + altura * altura);
		return diagonal;
	}
	
	public String toString() {
		return "Area = "
				+ String.format("%.2f%n", calculoArea())
				+ "Perimetro = "
				+ String.format("%.2f%n", calculoPerimetro())
				+ "Diagonal = "
				+ String.format("%.2f%n", calculoDiagonal());
	}
	
}
