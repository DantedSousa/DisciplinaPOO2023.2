package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a dimensão da matriz (quadrada) - no máximo 100:");
        int dim = input.nextInt();

        // Verifica se a dimensão está dentro do intervalo permitido
        if (dim < 1 || dim > 100) {
            System.out.println("A dimensão da matriz deve estar entre 1 e 100.");
            extracted();
        }

        int[][] matriz = new int[dim][dim];

        // Leitura dos elementos da matriz
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        int soma = 0;

        // Soma dos elementos abaixo da diagonal secundária
        for (int i = 1; i < dim; i++) {
            for (int j = dim - 1; j >= dim - i; j--) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos abaixo da diagonal secundária é: " + soma);

        input.close();
    }

	private static void extracted() {
	}
}