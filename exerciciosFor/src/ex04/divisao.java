package ex04;

import java.util.Locale;
import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite dois n�meros para efetuar a divis�o:");
		 int x = sc.nextInt();
		 double divisao;
		 
		 for(int i = 0; i < x; i++) {
			 System.out.println("Digite o numerador:");
			 double n1 = sc.nextDouble();
			 System.out.println("Digite o denominador:");
			 double n2 = sc.nextDouble();
			 if(n2 == 0) {
				 System.out.println("Divis�o imposs�vel!");
				 System.out.println("----------------------");
			 }else {
				 divisao = n1/n2;
				 System.out.printf("%.1f\n",divisao);
			 }
		 }

	}

}
