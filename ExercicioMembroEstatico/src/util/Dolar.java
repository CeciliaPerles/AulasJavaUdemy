package util;

public class Dolar {
	
	public static final double IOF = 0.06;
	
	public static double total (double valor, double quantidade) {
		return valor * quantidade + valor * quantidade * IOF;
	}
	
	
	
	
}
