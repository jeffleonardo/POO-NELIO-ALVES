package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário:");
		int numFuncionario = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas:");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor por hora trabalhada:");
		double valorHora = sc.nextDouble();
		
		double salary = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f", salary);
	}
}
