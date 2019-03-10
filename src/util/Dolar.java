package util;

public class Dolar {
	public static double dolar;
	public static double reais;
	public static final double IOF = 0.06;

	public static double converter() {
		double convercao = dolar * reais;
		return convercao + convercao * IOF;
	}

	

}
