package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int dp = 0, lin_ac = 0, col_ac = 1, lin_ab = 1, col_ab = 0;
        int cont_dp = 0, cont_ac = 0, cont_ab = 0;

        while (cont_ac < 10 || cont_ab < 10 || cont_dp < 5) {
            System.out.print("Digite um número maior que zero: ");
            int num = input.nextInt();
            int r = num % 5;

            if (r == 0) {
                if (cont_dp < 5) {
                    matriz[dp][dp] = num;
                    dp++;
                    cont_dp++;
                } else {
                    System.out.println("Diagonal totalmente preenchida");
                }
            } else {
                r = num % 11;
                if (r == 0) {
                    if (cont_ac < 10) {
                        matriz[lin_ac][col_ac] = num;
                        col_ac++;
                        if (col_ac > 4) {
                            lin_ac++;
                            col_ac = lin_ac + 1;
                        }
                        cont_ac++;
                    } else {
                        System.out.println("Não existe mais espaço acima da diagonal principal");
                    }
                } else {
                    r = num % 13;
                    if (r == 0) {
                        if (cont_ab < 10) {
                            matriz[lin_ab][col_ab] = num;
                            col_ab++;
                            if (col_ab >= lin_ab) {
                                lin_ab++;
                                col_ab = 0;
                            }
                            cont_ab++;
                        } else {
                            System.out.println("Não existe mais espaço abaixo da diagonal principal");
                        }
                    } else {
                        System.out.println("Número inválido");
                    }
                }
            }
        }

        System.out.println("Matriz resultante:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}