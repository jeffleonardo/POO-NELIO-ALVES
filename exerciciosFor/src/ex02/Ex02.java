package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número limite:");
		int limite = sc.nextInt();
		int num;
		int in = 0;
		int out = 0;
		
		for(int i = 1; i<=limite;i++){
			System.out.println("----------------");
			num = sc.nextInt();
			if(num>=10 && num<=20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.println("-------RESULTADO--------");
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();		
	}
}
