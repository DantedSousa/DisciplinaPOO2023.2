package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetorA = new char[20];
        char[] vetorB = new char[20];

        // Preencher o vetor A
        System.out.println("Digite os caracteres para o vetor A:");
        for (int i = 0; i < 20; i++) {
            vetorA[i] = scanner.next().charAt(0);
        }

        // Preencher o vetor B
        System.out.println("Digite os caracteres para o vetor B:");
        for (int i = 0; i < 20; i++) {
            vetorB[i] = scanner.next().charAt(0);
        }

        // Mostrar os vetores antes da troca
        System.out.println("Vetor A - Antes da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B - Antes da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorB[i] + " ");
        }

        // Trocar os elementos
        for (int i = 0; i < 20; i++) {
            char temp = vetorA[i];
            vetorA[i] = vetorB[19 - i];
            vetorB[19 - i] = temp;
        }

        // Mostrar os vetores depois da troca
        System.out.println("\nVetor A - Depois da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B - Depois da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorB[i] + " ");
        }

        scanner.close();
    }
}