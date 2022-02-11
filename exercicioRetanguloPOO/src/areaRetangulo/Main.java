package areaRetangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Retangulo rt = new Retangulo();

		System.out.println("Enter rectangle width and height:");
		System.out.print("Width:");
		rt.width = sc.nextDouble();
		System.out.print("Hight:");
		rt.hight = sc.nextDouble();
		
		System.out.println(rt);
		
		sc.close();
	}

}
