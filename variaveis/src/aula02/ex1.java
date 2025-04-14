package aula02;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		
		System.out.println("---Calculadora de abono sálarial---");
		
		System.out.println("Digite valor do sálario: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite valor do abono: ");
		float abono = leia.nextFloat();
		
		System.out.printf("%.2f + %.2f = %.2f", salario, abono, (salario + abono));
		
	}

}