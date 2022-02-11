package exercicios_while;

import java.util.Scanner;

public class ValidadorSenha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		int senhaDigitada = sc.nextInt();
		
		int senhaCorreta = 2002;		
		
		while(senhaDigitada != senhaCorreta) {
			System.out.println("Senha inválida!");
			System.out.println("Digite a senha:");
			senhaDigitada = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");
	}
}
