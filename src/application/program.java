package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int m = sc.nextInt();
		System.out.print("Colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		System.out.print("Matriz: \n");
		for (int i=0; i<mat.length; i++) {
			System.out.printf("Linha %d: ", i);
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.print("Numero: ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j]==x) {
					System.out.print("Position " + i + ", " + j + ": \n");
					if (j>0) {
						System.out.print("Left: " + mat[i][j-1] + "\n");
					}
					if (i>0) {
						System.out.print("Up: " + mat[i-1][j] + "\n");
					}
					if (j<mat[i].length-1) {
						System.out.print("Right: " + mat[i][j+1] + "\n");
						}
					if (i<mat.length-1) {
						System.out.print("Down: " + mat[i+1][j] + "\n");
					}
				}
			}
		}

		
		
		sc.close();
	}

}
