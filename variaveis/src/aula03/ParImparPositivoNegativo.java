package aula03;

import java.util.Scanner;

public class ParImparPositivoNegativo {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("**********************************************");
        System.out.println("       Verificação de Paridade e Sinal        ");
        System.out.println("**********************************************");
        System.out.println();

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if (numero % 2 == 0 && numero >= 0)
            System.out.println("O Número " + numero + " é par e positivo!");
        else if (numero % 2 == 0 && numero < 0)
            System.out.println("O Número " + numero + " é par e negativo!");
        else if (numero % 2 != 0 && numero >= 0)
            System.out.println("O Número " + numero + " é ímpar e positivo!");
        else
            System.out.println("O Número " + numero + " é ímpar e negativo!");

        leia.close();
    }
}
