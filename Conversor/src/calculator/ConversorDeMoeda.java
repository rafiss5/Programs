package calculator;

public class ConversorDeMoeda {
	
	public static double IOF = 0.06;
	

	public static double conversao(double reais, double precoDolar) {
		return reais * precoDolar * (1.0  + IOF);
		
	}
}
