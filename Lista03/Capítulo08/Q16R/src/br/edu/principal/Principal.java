package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];

        System.out.println("Digite os elementos do primeiro vetor A:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = input.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor B:");
        for (int i = 0; i < 10; i++) {
            vet2[i] = input.nextInt();
        }

        ordenaTodos(vet1, vet2, vet3);

        System.out.println("Vetor C em ordem decrescente:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }

        input.close();
    }

    public static void ordenaTodos(int[] a, int[] b, int[] c) {
        int i, j, k, cont;
        k = 0;

        for (i = 0; i < 10; i++) {
            cont = 0;
            while (cont < k && a[i] < c[cont]) {
                cont++;
            }
            if (cont == k) {
                c[k] = a[i];
                k++;
            } else {
                for (j = k - 1; j >= cont; j--) {
                    c[j + 1] = c[j];
                }
                c[cont] = a[i];
                k++;
            }
        }

        for (i = 0; i < 10; i++) {
            cont = 0;
            while (cont < k && b[i] < c[cont]) {
                cont++;
            }
            if (cont == k) {
                c[k] = b[i];
                k++;
            } else {
                for (j = k - 1; j >= cont; j--) {
                    c[j + 1] = c[j];
                }
                c[cont] = b[i];
                k++;
            }
        }
    }
}