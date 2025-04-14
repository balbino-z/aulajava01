package aula02;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---Calculadora de média---");
		
		
		
		float mediaFinal;
		
		System.out.println("Digite primeira nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite segunda nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("Digite terceira nota: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("Digite quarta nota: ");
		float nota4 = leia.nextFloat();
		
		
		System.out.printf("%.2f + %.2f + %.2f + %.2f /4 \n\n A média final é = %.2f", nota1, nota2, nota3, nota4, ((nota1 + nota2 + nota3 + nota4) /4));
		
	}

}