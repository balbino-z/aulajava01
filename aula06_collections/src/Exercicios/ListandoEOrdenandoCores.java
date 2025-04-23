package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListandoEOrdenandoCores {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        String[] cores = new String[5];

        int contador = 0;
        while (contador < 5) {
            System.out.print("Digite 5 cores em sequencia: ");
            cores[contador] = leia.nextLine();
            contador++;
        }

        System.out.println("\nCores digitadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        ArrayList<String> coresList = new ArrayList<String>();
      
        coresList.addAll(Arrays.asList(cores));
        
        coresList.sort(null);

        System.out.println("\nCores ordenadas:");
        coresList.forEach(System.out::println);

        leia.close();
    }
}