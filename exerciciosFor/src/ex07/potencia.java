package ex07;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número positivo:");
		int num = sc.nextInt();
		
		
		if(num > 0) {
			for(int i =1;i<=num;i++) {
				int quadrado = (int)Math.pow(i, 2);
				int cubo = (int)Math.pow(i, 3);
				System.out.println(i + " " + quadrado + " " + cubo);
			}
		}else {
			System.out.print("Digite apenas números positivos maiores que 0!");
		}
	}
}
