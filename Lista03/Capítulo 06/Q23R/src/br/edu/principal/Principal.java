package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] corredor = new int[24];
        int[] janela = new int[24];
        for (int i = 0; i < 24; i++) {
            corredor[i] = 0;
            janela[i] = 0;
        }

        int op;
        boolean achou;
        String posicao;
        int num;

        do {
            System.out.println("1- Vender passagem");
            System.out.println("2- Mostrar mapa de ocupação do ônibus");
            System.out.println("3- Encerrar");
            op = scanner.nextInt();

            if (op == 1) {
                achou = false;
                for (int i = 0; i < 24; i++) {
                    if (corredor[i] == 0 || janela[i] == 0) {
                        achou = true;
                    }
                }
                if (!achou) {
                    System.out.println("Ônibus lotado");
                } else {
                    do {
                        System.out.println("Escolha J (Janela) ou C (Corredor): ");
                        posicao = scanner.next();
                    } while (!posicao.equals("J") && !posicao.equals("C"));

                    do {
                        System.out.println("Digite o número da poltrona (1 a 24): ");
                        num = scanner.nextInt();
                    } while (num < 1 || num > 24);

                    if (posicao.equals("J") && janela[num - 1] == 1) {
                        System.out.println("Poltrona ocupada");
                    } else if (posicao.equals("C") && corredor[num - 1] == 1) {
                        System.out.println("Poltrona ocupada");
                    } else {
                        System.out.println("Venda efetivada");
                        if (posicao.equals("J")) {
                            janela[num - 1] = 1;
                        } else {
                            corredor[num - 1] = 1;
                        }
                    }
                }
            } else if (op == 2) {
                System.out.println("JANELA CORREDOR");
                for (int i = 0; i < 24; i++) {
                    if (janela[i] == 0) {
                        System.out.print((i + 1) + "- Livre\t");
                    } else {
                        System.out.print((i + 1) + "- Ocupada\t");
                    }
                    if (corredor[i] == 0) {
                        System.out.println((i + 1) + "- Livre");
                    } else {
                        System.out.println((i + 1) + "- Ocupada");
                    }
                }
            }
        } while (op != 3);

        scanner.close();
    }
}