package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int cont_n = 0;
        int cont_p = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número inteiro: ");
            num[i] = scanner.nextInt();
            if (num[i] >= 0) {
                pos[cont_p] = num[i];
                cont_p++;
            } else {
                neg[cont_n] = num[i];
                cont_n++;
            }
        }

        System.out.println("Vetor de positivos:");
        if (cont_p == 0) {
            System.out.println("Vetor de positivos vazio");
        } else {
            for (int i = 0; i < cont_p; i++) {
                System.out.print(pos[i] + " ");
            }
            System.out.println();
        }

        System.out.println("Vetor de negativos:");
        if (cont_n == 0) {
            System.out.println("Vetor de negativos vazio");
        } else {
            for (int i = 0; i < cont_n; i++) {
                System.out.print(neg[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
