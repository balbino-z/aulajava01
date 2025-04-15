package aula03;

import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome, cargo = "";
        int codigo;
        float salario, reajuste = 0, novoSalario;

        System.out.println("**********************************************");
        System.out.println("           Reajuste de Salário                ");
        System.out.println("**********************************************");
        System.out.print("Nome do colaborador: ");
        leia.nextLine();
        nome = leia.nextLine();

        System.out.print("Código do cargo (1 a 6): ");
        codigo = leia.nextInt();

        System.out.print("Salário atual: R$ ");
        salario = leia.nextFloat();

        switch (codigo) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08f;
                break;
            default:
                System.out.println("Código inválido!");
                leia.close();
                return;
        }

        novoSalario = salario + (salario * reajuste);

        System.out.println();
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

        leia.close();
    }
}
