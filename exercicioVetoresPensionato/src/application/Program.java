package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		Student[] vect= new Student[10];

		System.out.print("Digite quantos estudantes v?o se hospedar:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do Estudante:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o email do Estudante:");
			String email = sc.nextLine();
			System.out.print("Escolha um quarto - 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9");
			int room = sc.nextInt();
			vect[room] = new Student(name,email);
			System.out.println();
			System.out.println(room + ": " + vect[room]);
			System.out.println();
		}
		
		System.out.println("Busy rooms:\n");
		for (int i = 0; i<10; i++) {
			if (vect[i] != null) {				
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}
