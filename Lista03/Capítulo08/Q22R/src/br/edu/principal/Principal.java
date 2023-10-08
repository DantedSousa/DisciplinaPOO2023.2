package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vet1 = new int[8];
        int[] vetPositivos = new int[8];
        int[] vetNegativos = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vet1[i] = input.nextInt();
        }

        int contPositivos = separarPositivosNegativos(vet1, vetPositivos, vetNegativos);

        System.out.println("Números positivos:");
        for (int i = 0; i < contPositivos; i++) {
            System.out.print(vetPositivos[i] + " ");
        }

        System.out.println("\nNúmeros negativos:");
        for (int i = 0; i < 8 - contPositivos; i++) {
            System.out.print(vetNegativos[i] + " ");
        }

        input.close();
    }

    public static int separarPositivosNegativos(int[] v1, int[] vPositivos, int[] vNegativos) {
        int contPositivos = 0;
        int contNegativos = 0;

        for (int i = 0; i < 8; i++) {
            if (v1[i] >= 0) {
                vPositivos[contPositivos] = v1[i];
                contPositivos++;
            } else {
                vNegativos[contNegativos] = v1[i];
                contNegativos++;
            }
        }

        return contPositivos;
    }
}