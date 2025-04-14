package aula02;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("---Calculadora de sálario liquido---");
		
		
		System.out.println("\n\nDigite qual o seu salário bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite quanto é sua hora extra: ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("Digite quanto é descontado: ");
		float descontos = leia.nextFloat();

		
		System.out.printf("%.2f + %.2f + (%.2f * 5) - %.2f  \n\n Salério Líquido é = %.2f", salarioBruto, adicionalNoturno, horasExtras, descontos, (salarioBruto + adicionalNoturno + (horasExtras *5 ) - descontos));
	}

}