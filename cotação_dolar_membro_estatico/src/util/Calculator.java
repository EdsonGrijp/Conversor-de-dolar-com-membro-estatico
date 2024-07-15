package util;

public class Calculator {
	public static final double IOF = 0.06;
	
	public static double dolarparareal(double quantidade, double dolar) {
		double valor = dolar * quantidade;
		return valor += valor * IOF;
		
	}
	
	
}
