package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.print("Digite o nome do funcionário:");
		func.name = sc.nextLine();
		System.out.print("Digite o salário bruto:");
		func.grossSalary = sc.nextDouble();
		System.out.print("Digite o valor da taxa:");
		func.tax = sc.nextDouble();
		
		System.out.println();		
		System.out.println("Employee: " + func);		
		System.out.println();		
		System.out.print("Which percentage to increase salary?");
		double percent = sc.nextDouble();		
		func.increaseSalary(percent);
		
		System.out.print("Updated data: " + func);
		
		sc.close();
	}
}
