package util;

public class CurrencyConverter {
	
	public static double somaIOF(double total) {
		return total += total * 6 / 100;
	}
	
	public static double calculator(double dollar, int quantity) {
		return quantity * dollar;
	}
}
