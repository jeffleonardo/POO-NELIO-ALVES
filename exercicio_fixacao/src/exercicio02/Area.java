package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		double areaCirculo = 3.14159*(Math.pow(raio, 2));
		
		
		System.out.printf("A = %.4f", areaCirculo);
	}
}
