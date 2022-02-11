package exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite três números:"
				         + "Valor A:");
		double A = sc.nextDouble();
		System.out.println("Valor B:");
		double B = sc.nextDouble();
		System.out.println("Valor C:");
		double C = sc.nextDouble();
		
		double areaTriangulo = (A * C) / 2;
		double areaCirculo = 3.14159 * Math.pow(C, 2);
		double areaTrapezio = (A+B)*C/2;
		double areaQuadrado = B*B;
		double areaRetangulo = A*B;

		System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);	
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
	}
}
