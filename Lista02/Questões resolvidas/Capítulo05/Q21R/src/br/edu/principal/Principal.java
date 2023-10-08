package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, qtd = 0, maior = 0, menor = 0, qtd_par = 0, soma_par = 0, qtd_impar = 0, soma = 0;
        double media, media_par, perc;

        System.out.println("Digite vários números (encerre com 30000):");

        do {
            num = scanner.nextInt();

            if (num != 30000) {
                if (qtd == 0) {
                    maior = num;
                    menor = num;
                } else {
                    if (num > maior) {
                        maior = num;
                    }
                    if (num < menor) {
                        menor = num;
                    }
                }

                soma += num;
                qtd++;

                if (num % 2 == 0) {
                    soma_par += num;
                    qtd_par++;
                } else {
                    qtd_impar++;
                }
            }

        } while (num != 30000);

        if (qtd == 0) {
            System.out.println("Nenhum número digitado.");
        } else {
            System.out.println("Soma dos números digitados: " + soma);
            System.out.println("Quantidade de números digitados: " + qtd);
            media = (double) soma / qtd;
            System.out.println("Média dos números digitados: " + media);
            System.out.println("Maior número digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);

            if (qtd_par == 0) {
                System.out.println("Nenhum número par.");
            } else {
                media_par = (double) soma_par / qtd_par;
                System.out.println("Média dos números pares: " + media_par);
            }

            perc = (double) qtd_impar * 100 / qtd;
            System.out.println("Porcentagem de números ímpares: " + perc + "%");
        }

        scanner.close();
    }
}