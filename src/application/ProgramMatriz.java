package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas linhas e colunas e vetor irá ter: ");
		int n = scan.nextInt();

		int[][] matriz = new int[n][n];
		int count = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();

				if (matriz[i][j] < 0) {
					count++;
				}
				
			}
		}

		System.out.println("Numeros negativos: " + count);
		
		System.out.println("Diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		scan.close();

	}

}
