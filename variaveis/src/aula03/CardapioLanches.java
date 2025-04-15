package aula03;

import java.util.Scanner;

public class CardapioLanches {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int codigo, quantidade;
        String produto = "";
        double preco = 0.0, total = 0.0;

        System.out.println("**********************************************");
        System.out.println("               Cardápio de Lanches            ");
        System.out.println("**********************************************");
        System.out.println("1 - Cachorro Quente     R$ 10.00");
        System.out.println("2 - X-Salada            R$ 15.00");
        System.out.println("3 - X-Bacon             R$ 18.00");
        System.out.println("4 - Bauru               R$ 12.00");
        System.out.println("5 - Refrigerante        R$  8.00");
        System.out.println("6 - Suco de Laranja     R$ 13.00");
        System.out.println("**********************************************");
        System.out.print("Código do Produto: ");
        codigo = leia.nextInt();

        System.out.print("Quantidade: ");
        quantidade = leia.nextInt();

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.0;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.0;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.0;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.0;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.0;
                break;
            case 6:
                produto = "Suco de Laranja";
                preco = 13.0;
                break;
            default:
                System.out.println("Código inválido!");
                leia.close();
                return;
        }

        total = preco * quantidade;
        System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f\n", total);

        leia.close();
    }
}
