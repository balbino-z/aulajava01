package aula02;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		
		System.out.println("---Calculadora de diferencial---");
		
		
		System.out.println("\n\nDigite 4 números: ");
		float num1 = leia.nextFloat();

		System.out.println("\n\nDigite 4 números: ");
		float num2 = leia.nextFloat();
		
		System.out.println("\n\nDigite 4 números: ");
		float num3 = leia.nextFloat();
		
		System.out.println("\n\nDigite 4 números: ");
		float  num4 = leia.nextFloat();	
		
		System.out.printf("(%.2f * %.2f) - (%.2f * %.2f) O diferencial é = %.2f", num1, num2, num3, num4, (num1 * num2) - (num3 * num4));
		
		
	}

}