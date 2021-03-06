package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("Digite o n?mero de funcionarios:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id:");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Este ID ja existe! Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Name:");
			sc.nextLine();	
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		System.out.println();
		System.out.println("Digite o ID do funcion?ro que receber? um aumento:");
		int idSalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idSalary);
		if(emp == null) {
			System.out.println("ID inexistente!");
		}else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			emp.aumentarSalario(percent);
		}
		
		System.out.println();
		System.out.println("Lista de funcion?rios: ");
		for(Employee f : list) {
			System.out.println(f);
		}
		
		sc.close();

	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
