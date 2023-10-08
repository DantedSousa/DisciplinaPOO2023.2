package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, qtd, valor_kw, gasto, acresc, total, tot_geral = 0;
        int tipo, qtd_cons = 0;

        System.out.println("Informe o valor do salário mínimo:");
        sal = scanner.nextDouble();

        System.out.println("Informe a quantidade de quilowatts gasta por consumidor (digite 0 para encerrar):");
        qtd = scanner.nextDouble();

        valor_kw = sal / 8;

        while (qtd != 0) {
            System.out.println("Informe o tipo de consumidor (1 - residencial; 2 - comercial; 3 - industrial):");
            tipo = scanner.nextInt();

            gasto = qtd * valor_kw;

            if (tipo == 1) {
                acresc = gasto * 0.05;
            } else if (tipo == 2) {
                acresc = gasto * 0.10;
            } else if (tipo == 3) {
                acresc = gasto * 0.15;
            } else {
                acresc = 0;
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Valor gasto: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total a ser pago: " + total);

            System.out.println("Informe a quantidade de quilowatts gasta por consumidor (digite 0 para encerrar):");
            qtd = scanner.nextDouble();
        }

        System.out.println("Faturamento geral da empresa: " + tot_geral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + qtd_cons);

        scanner.close();
    }
}