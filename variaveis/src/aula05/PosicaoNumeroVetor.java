package aula05;

import java.util.Scanner;

public class PosicaoNumeroVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, posicao = -1;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				posicao = i;
				break;
			}
		}
		
		if (posicao != -1) {
			System.out.println("\nO número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
		
		leia.close();
	}
}
