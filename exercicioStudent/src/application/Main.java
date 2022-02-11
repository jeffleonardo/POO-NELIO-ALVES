package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Digite o Nome do Aluno:");
		st.name = sc.nextLine();
		System.out.println("Digite a nota do 1º Bimestre:");
		st.nota1 = sc.nextDouble();
		st.testaNota();
		System.out.println("Digite a nota do 2º Bimestre:");
		st.nota2 = sc.nextDouble();
		st.testaNota();
		System.out.println("Digite a nota do 3º Bimestre:");
		st.nota3 = sc.nextDouble();
		st.testaNota();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", st.finalGrade()));
		if(st.finalGrade() >= 60.00) {
			System.out.println("PASS");
		}else {
			double missing = 60.00 - st.finalGrade();
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", missing) + " POINTS");
		}		
		
		sc.close();
	}
}
