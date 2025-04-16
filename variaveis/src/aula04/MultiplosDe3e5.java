package aula04;

import java.util.Scanner;

public class MultiplosDe3e5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int inicio = leia.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		int fim = leia.nextInt();
		
		if (inicio >= fim) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("\nNo Intervalo entre " + inicio + " e " + fim + ":");
			for (int i = inicio; i <= fim; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		
		leia.close();
	}
}
