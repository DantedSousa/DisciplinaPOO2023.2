package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, valorAd, imp, precoC, desconto, novoPreco;
        String tipo, refrigeracao;

        System.out.print("Digite o preço do produto: ");
        preco = sc.nextDouble();

        System.out.print("Digite o tipo do produto (A - Alimentação, L - Limpeza, V - Vestuário): ");
        tipo = sc.next();

        System.out.print("Produto refrigerado (S - Sim, N - Não): ");
        refrigeracao = sc.next();

        if (refrigeracao.equals("N")) {
            if (tipo.equals("A")) {
                if (preco < 15) {
                    valorAd = 2;
                } else {
                    valorAd = 5;
                }
            } else if (tipo.equals("L")) {
                if (preco < 10) {
                    valorAd = 1.50;
                } else {
                    valorAd = 2.50;
                }
            } else if (tipo.equals("V")) {
                if (preco < 30) {
                    valorAd = 3;
                } else {
                    valorAd= 2.5;
                }
            } else {
                valorAd = 0;
            }
        } else {
            if (tipo.equals("A")) {
                valorAd = 8;
            } else {
                valorAd = 0;
            }
        }

        System.out.println("Valor adicional: " + valorAd);

        if (preco < 25) {
            imp = 0.05 * preco;
        } else {
            imp = 0.08 * preco;
        }

        System.out.println("Imposto: " + imp);

        precoC = preco + imp;

        System.out.println("Preço de custo: " + precoC);

        if (!tipo.equals("A") && !refrigeracao.equals("S")) {
            desconto = 0.03 * precoC;
        } else {
            desconto = 0;
        }

        System.out.println("Desconto: " + desconto);

        novoPreco = precoC + valorAd - desconto;

        System.out.println("Novo preço: " + novoPreco);

        if (novoPreco <= 50) {
            System.out.println("Barato");
        } else if (novoPreco < 100) {
            System.out.println("Normal");
        } else {
            System.out.println("Caro");
        }

	}

}
