package aula03;

import java.util.Scanner;

public class SomaComparacao {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b, c, soma;

        System.out.println("**********************************************");
        System.out.println("           Comparação da Soma A + B           ");
        System.out.println("**********************************************");
        System.out.println();
        
        System.out.print("Digite o número A: ");
        a = leia.nextInt();

        System.out.print("Digite o número B: ");
        b = leia.nextInt();

        System.out.print("Digite o número C: ");
        c = leia.nextInt();

        soma = a + b;

        if (soma > c) {
            System.out.println(a + " + " + b + " = " + soma + " > " + c);
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < c) {
            System.out.println(a + " + " + b + " = " + soma + " < " + c);
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println(a + " + " + b + " = " + soma + " = " + c);
            System.out.println("A Soma de A + B é Igual a C");
        }

        leia.close();
    }
}
