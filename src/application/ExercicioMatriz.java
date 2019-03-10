package application;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] matriz = new int[n][m];
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		int x = scan.nextInt();
		
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		scan.close();

	}

}
