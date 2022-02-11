package exercicios_while;

import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plano cartesiano:");
		
		System.out.println("Digite a coordenada X:");
		int numX = sc.nextInt();
		System.out.println("Digite a coordenada Y:");
		int numY = sc.nextInt();		
		
		while(numX != 0 && numY != 0) {
			
			if(numX > 0 && numY > 0) {
				System.out.println("primeiro");
				break;
			}else if(numX < 0 && numY > 0) {
				System.out.println("segundo");
				break;
			}else if(numX < 0 && numY < 0) {
				System.out.println("terceiro");
				break;
			}else {
				System.out.println("quarto");
				break;
			}	
		}
		System.out.println("Número 0 não é permitido!");
		sc.close();
	}	
}
