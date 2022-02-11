package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is th dollar price?");
		double dollarVallue = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		int quantityDollars = sc.nextInt();
		
		double valorTotal = CurrencyConverter.calculator(dollarVallue, quantityDollars);
		
		System.out.print("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.somaIOF(valorTotal)));	

		sc.close();
	}
}
