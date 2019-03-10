package entities;

public class Aluno {
	public static String nome;
	public static double nota1;
	public static double nota2;
	public static double nota3;

	public static double  calcularMedia() {
		return nota1 + nota2 + nota3;
	}

	public static double  pontosFaltando() {
		if (calcularMedia() < 60) {
			return 60 - calcularMedia();
		} else {
			return 0;
		}
	}

}
