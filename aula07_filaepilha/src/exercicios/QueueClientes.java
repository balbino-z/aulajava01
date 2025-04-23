package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueClientes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("\n*****************************************************");
			System.out.println("                FILA DE CLIENTES DO BANCO            ");
			System.out.println("*****************************************************");
			System.out.println("                1 - Adicionar cliente na fila        ");
			System.out.println("                2 - Listar todos os clientes         ");
			System.out.println("                3 - Chamar cliente                   ");
			System.out.println("                0 - Finalizar programa               ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.print("\nDigite o nome: ");
					String nome = leia.nextLine();
					fila.add(nome);
					System.out.println("\nCliente Adicionado!");
					break;
				case 2:
					System.out.println("\nLista de Clientes na Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
					break;
				case 3:
					if (fila.isEmpty()) {
						System.out.println("\nA Fila está vazia!");
					} else {
						fila.remove();
						System.out.println("\nO Cliente foi Chamado!");
					}
					break;
				case 0:
					System.out.println("\nPrograma Finalizado!");
					break;
				default:
					System.out.println("\nOpção inválida!");
			}
		}
		
		leia.close();
	}
}
