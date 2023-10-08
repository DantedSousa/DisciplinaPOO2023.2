package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] mat = new double[4][7];
        double menor = 0;
        int l_menor = 0, col = 0;

        // Preenche a matriz com números reais fornecidos pelo usuário
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Digite um número real para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = input.nextDouble();

                // Verifica se o número atual é menor do que o menor encontrado até agora
                if (i == 0 && j == 0 || mat[i][j] < menor) {
                    menor = mat[i][j];
                    l_menor = i;
                }
            }
        }

        double maior = mat[l_menor][0];

        // Encontra o maior elemento na linha do menor elemento
        for (int j = 0; j < 7; j++) {
            if (mat[l_menor][j] > maior) {
                maior = mat[l_menor][j];
                col = j;
            }
        }

        System.out.println("MINMAX: " + maior);
        System.out.println("Posição (linha e coluna): [" + (l_menor + 1) + "][" + (col + 1) + "]");

        input.close();
    }
}