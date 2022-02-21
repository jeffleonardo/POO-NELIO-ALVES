package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Container;
import enuns.Status;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Container> bl = new ArrayList<>();
		Container cntr;
		Status state = null;

		System.out.print("Digite o n�mero do BL");
		String nameBl = sc.next();
		System.out.print("Digite quantos conteineres vai ter neste BL");
		int qntCntr = sc.nextInt();

		for (int i = 0; i < qntCntr; i++) {

			System.out.println();
			System.out.println("Container #" + (i + 1));
			System.out.print("Digite o Nome da Empresa:");
			sc.nextLine();
			String empresa = sc.nextLine();
			System.out.print("Digite o N�mero do Container com 4 letras e 7 n�meros:");
			String numero = sc.next();
			System.out.print("Miss�o do container: " + "0 = Importa��o " + "1 = Exporta��o");
			String missao = sc.next();
			if (missao == "0") {
				missao = "Importa��o";
			} else {
				missao = "Exporta��o";
			}
			System.out.print("Peso do Container:");
			double peso = sc.nextDouble();
			System.out.println("Status do Container " + "0 = VAZIO " + "1 = CHEIO");
			int opcao = sc.nextInt();
			
			if (opcao == 0) {
				state = Status.VAZIO;
			} else if (opcao == 1) {
				state = Status.CHEIO;				
			}
			
			cntr = new Container(empresa, numero, missao, peso, state.mostarStatus(opcao));
			bl.add(cntr);
		}
		System.out.println();
		System.out.println("N�mero do BL: " + nameBl);
		for (Container un : bl) {
			System.out.println();
			System.out.println(un);
		}

		sc.close();
	}
}
