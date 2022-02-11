package exercicio01;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");
		int x = sc.nextInt();
		System.out.println("Digite o valor de y:");
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("SOMA = " + soma);
	}
}
