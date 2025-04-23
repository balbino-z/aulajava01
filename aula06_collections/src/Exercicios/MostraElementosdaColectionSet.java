package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MostraElementosdaColectionSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();
		
		int contador = 0;
		while( contador < 10) {
            System.out.print("Digite 10 numeros em sequencia:  ");
            numeros.add(leia.nextInt());
            contador++;
        }
		
		
		 System.out.println("\nListar dados do Set:");
	        Iterator<Integer> iterator = numeros.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
		
	        
	        leia.close();
	}

}