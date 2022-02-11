package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o código do primeiro produto:");
		int codProduto1 = sc.nextInt();
		System.out.println("Digite a quantidade:");
		int qtdProduto1 = sc.nextInt();
		System.out.println("Digite o valor deste produto:");
		double valorProduto1 = sc.nextDouble();
		System.out.println("Digite o código do segundo produto:");
		int codProduto2 = sc.nextInt();
		System.out.println("Digite a quantidade:");
		int qtdProduto2 = sc.nextInt();
		System.out.println("Digite o valor deste produto:");
		double valorProduto2 = sc.nextDouble();
		
		double valorProd1 = qtdProduto1 * valorProduto1;	
		double valorProd2 = qtdProduto2 * valorProduto2;
		double valorTotal = valorProd1 + valorProd2;	
		
		
		
		System.out.println("Código do produto 1 => " + codProduto1 + " quantidade " + qtdProduto1);
		System.out.println("Código do produto 2 => " + codProduto2 + " quantidade " + qtdProduto2);
		System.out.println("Valor unitário produto 1 = " + valorProd1);
		System.out.println("Valor unitário produto 2 = " + valorProd2);
	
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
	}
}
