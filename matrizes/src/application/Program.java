package application;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a dimensão da matriz");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<mat.length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Main diagonal:");
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
			
		}	
		
		System.out.println("Negative numbers = " + count);

		sc.close();

	}

}
