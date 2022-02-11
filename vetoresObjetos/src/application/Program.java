package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double price;
		int n;
		
		System.out.println("Digite a quantidade de produtos:");
		n = sc.nextInt();
		Product[] vect = new Product[n];
		
		System.out.println("Informe os produtos e seus respectivos pre�os:");
		for(int i = 0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Nome do produto:");
			name = sc.nextLine();
			System.out.println("Valor do produto:");
			price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE = %.2f%n", average);
		sc.close();
	}
}