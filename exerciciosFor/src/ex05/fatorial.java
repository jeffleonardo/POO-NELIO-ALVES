package ex05;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para calcular seu fatorial:");
		int n = sc.nextInt();
		
		int fat = 1;
		for(int i = 1;i<=n;i++) {
			fat = fat * i;
		}
		System.out.println(fat);
		
		sc.close();
	}
}
