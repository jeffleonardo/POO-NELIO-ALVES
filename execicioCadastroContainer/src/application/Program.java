package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Container;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Container> bl = new ArrayList<>();
		
		
		System.out.println("Digite o nome n�mero do BL");
		String nameBl = sc.next();
		System.out.println("Digite quantos conteineres vai ter neste BL");
		int qntCntr = sc.nextInt();
		
		for(int i=0;i<qntCntr;i++) {
			
			System.out.println();
			System.out.println("Container #" + (i+1));
			System.out.print("Digite o Nome da Empresa:");
			sc.nextLine();
			String empresa = sc.nextLine();
			System.out.print("Digite o N�mero do Container com 4 letras e 7 n�meros:");
			String numero = sc.next();
			System.out.print("Digite a miss�o do container: "
					+ "0 Importa��o "
					+ "1 Exporta��o");
			String missao = sc.next();
			if(missao == "0") {
				missao = "Importa��o";
			}else {
				missao = "Exporta��o";
			}
			System.out.print("Digite o peso do Container:");
			double peso = sc.nextDouble();
			
			Container cntr = new Container(empresa, numero, missao, peso);
			bl.add(cntr);
		}
		
		System.out.println();
		System.out.println("Nome do BL: " + nameBl);
		for(Container un : bl) {
			System.out.println();
			System.out.println(un);
		}

		sc.close();
	}
}