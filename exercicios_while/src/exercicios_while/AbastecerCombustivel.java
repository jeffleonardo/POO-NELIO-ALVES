package exercicios_while;

import java.util.Scanner;

public class AbastecerCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		boolean repeat = true;
		int contadorA = 0;
		int contadorG = 0;
		int contadorD = 0;

		while (repeat) {
			System.out.println("Escolha seu combustível:");
			System.out.println("1 - Álcool\n" + "2 - Gasolina\n" + "3 - Diesel\n" + "4 - Sair");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				contadorA += 1;
				break;
			case 2:
				contadorG += 1;
				break;
			case 3:
				contadorD += 1;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO\n" 
				         + "Alcool: " + contadorA + "\n" 
				         + "Gasolina: " + contadorG + "\n"
				         + "Diesel: " + contadorD);
				repeat = false;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}			
		}		
		sc.close();
	}
}
