package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preencha a matriz com os valores desejados

        int soma = somaMatriz(matriz);

        System.out.println("A soma dos elementos da matriz é: " + soma);
    }

    public static int somaMatriz(int[][] m) {
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += m[i][j];
            }
        }

        return soma;
    }
}