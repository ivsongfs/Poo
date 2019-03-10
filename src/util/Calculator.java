package util;
//Como a calculadora é apenas uma classe utilitaria com operações e cosntantes estaticas, 
//eu posso usar diretamente através do nome da classe
public class Calculator {
	public static final double PI = 3.14159;

	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
}
