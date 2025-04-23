package aula05;

import java.util.Scanner;

public class DiagonaisMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		
		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		System.out.print("\nElementos da Diagonal Principal:\n");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
			somaPrincipal += matriz[i][i];
		}
		
		System.out.print("\n\nElementos da Diagonal Secundária:\n");
		for (int i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			somaSecundaria += matriz[i][2 - i];
		}
		
		System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
		
		leia.close();
	}
}
