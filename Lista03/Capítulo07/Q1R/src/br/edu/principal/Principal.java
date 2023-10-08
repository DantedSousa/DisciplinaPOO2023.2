package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mat = new int[2][2];
        int[][] resultado = new int[2][2];
        int maior = 0;

        // Preenche a matriz e encontra o maior elemento
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um número para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = input.nextInt();

                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
        }

        // Multiplica os elementos pelo maior elemento
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = maior * mat[i][j];
            }
        }

        System.out.println("Matriz resultante:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}