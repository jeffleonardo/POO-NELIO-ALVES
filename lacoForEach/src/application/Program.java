package application;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(String nomes:vect) {
			System.out.println(nomes);
		}
	}
}