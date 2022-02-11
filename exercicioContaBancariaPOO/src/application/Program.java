package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		int numConta;
		Conta cb;
		
		System.out.print("Digite o nome do titular da conta:");
		nome = sc.nextLine();
		System.out.print("Digite o número da conta:");
		numConta = sc.nextInt();
		System.out.print("Deseja efetuar depósito? y/n");
		char opcao = sc.next().charAt(0);	
		if(opcao == 'y') {
			System.out.print("Valor inicial do depósito: ");
			double depositoInicial = sc.nextDouble();
			cb = new Conta(nome, numConta, depositoInicial);
		}else {
			cb = new Conta(nome, numConta);
		}
		
		System.out.println();		
		System.out.println("Conta criada com sucesso:");
		System.out.println(cb);
		
		System.out.println();		
		System.out.print("Entre com o valor do depósito: ");
		cb.depositar(sc.nextDouble());
		
		System.out.println();		
		System.out.println("Dados atualizados da conta:");
		System.out.println(cb);
		
		System.out.println();		
		System.out.print("Entre com o valor do saque: ");
		cb.sacar(sc.nextDouble());
		
		System.out.println();		
		System.out.println("Dados atualizados da conta:");
		System.out.println(cb);	
		System.out.println("------------------------");
		System.out.println("Taxa do saque = $ 5.00");
		
		sc.close();
	}
}
