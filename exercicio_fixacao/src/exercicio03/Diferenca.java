package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite 4 numeros.\n"
				         + "Digite o valor A:");
		int A = sc.nextInt();
		System.out.println("Digite o valor B:");
		int B = sc.nextInt();
		System.out.println("Digite o valor C:");
		int C = sc.nextInt();
		System.out.println("Digite o valor D:");
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.printf("DIFERENCA = " + diferenca);
	}
}
