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

		System.out.print("Digite o número do BL");
		String nameBl = sc.next();
		System.out.print("Digite quantos conteineres vai ter neste BL");
		int qntCntr = sc.nextInt();

		for (int i = 0; i < qntCntr; i++) {

			System.out.println();
			System.out.println("Container #" + (i + 1));
			System.out.print("Digite o Nome da Empresa:");
			sc.nextLine();
			String empresa = sc.nextLine();
			System.out.print("Digite o Número do Container com 4 letras e 7 números:");
			String numero = sc.next();
			System.out.print("Missão do container: " + "0 = Importação " + "1 = Exportação");
			String missao = sc.next();
			if (missao == "0") {
				missao = "Importação";
			} else {
				missao = "Exportação";
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
		System.out.println("Número do BL: " + nameBl);
		for (Container un : bl) {
			System.out.println();
			System.out.println(un);
		}

		sc.close();
	}
}
