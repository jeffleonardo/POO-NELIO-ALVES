package entities;

import java.util.Scanner;

public class Student {

	Scanner sc = new Scanner(System.in);
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalGrade() {
		double notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}

	public void testaNota() {
		if (nota1 > 30) {
			System.out.println("ERRO! - Nota Máxima = 30");
			System.out.println("Digite a nota do 1º Bimestre:");
			nota1 = sc.nextDouble();
		} else if (nota2 > 35) {
			System.out.println("ERRO! - Nota Máxima = 30");
			System.out.println("Digite a nota do 2º Bimestre:");
			nota2 = sc.nextDouble();
		} else if (nota3 > 35) {
			System.out.println("ERRO! - Nota Máxima = 30");
			System.out.println("Digite a nota do 3º Bimestre:");
			nota3 = sc.nextDouble();
		}
	}
}
