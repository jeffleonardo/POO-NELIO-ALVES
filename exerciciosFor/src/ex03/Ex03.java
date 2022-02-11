package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de testes a ser realizado:");
		int testes = sc.nextInt();
		double p1 = 2.0;
		double p2 = 3.0;
		double p3 = 5.0;
		double nt1;
		double nt2;
		double nt3;
		double mediaP = 0;
		
		for(int i = 0;i<testes;i++) {			
			System.out.println("Digite o valor da Nota 1: ");
			double n1 = sc.nextDouble();
			System.out.println("Digite o valor da Nota 2: ");
			double n2 = sc.nextDouble();
			System.out.println("Digite o valor da Nota 3: ");
			double n3 = sc.nextDouble();
			nt1 = n1 * p1;
			nt2 = n2 * p2;
			nt3 = n3 * p3;
			mediaP = (nt1+nt2+nt3) / (p1+p2+p3);	
			System.out.printf("%.1f\n",mediaP);
		}		
	}
}
