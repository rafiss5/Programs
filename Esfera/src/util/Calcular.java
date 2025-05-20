package util;

public class Calcular {
	
	public final double PI = 3.14159;
	
	public  double circumferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public  double volume(double raio) {
		return 4.0 * PI * raio * raio * raio /3;
	}


}
