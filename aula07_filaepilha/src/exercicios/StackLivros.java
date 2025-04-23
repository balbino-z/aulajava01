package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class StackLivros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("\n*****************************************************");
			System.out.println("                PILHA DE LIVROS                      ");
			System.out.println("*****************************************************");
			System.out.println("                1 - Adicionar livro na pilha         ");
			System.out.println("                2 - Listar todos os livros           ");
			System.out.println("                3 - Retirar livro da pilha           ");
			System.out.println("                0 - Finalizar programa               ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.print("\nDigite o nome: ");
					String livro = leia.nextLine();
					pilha.push(livro);
					System.out.println("\nLivro adicionado!");
					break;
				case 2:
					System.out.println("\nLista de Livros na Pilha:");
					for (String l : pilha) {
						System.out.println(l);
					}
					break;
				case 3:
					if (pilha.isEmpty()) {
						System.out.println("\nA Pilha está vazia!");
					} else {
						pilha.pop();
						System.out.println("\nUm Livro foi retirado da pilha!");
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
