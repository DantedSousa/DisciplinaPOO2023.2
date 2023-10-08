package br.edu.principal;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        double adicional = 0;
        double totImp = 0;
        int qtdBarato = 0;
        int qtdNormal = 0;
        int qtdCaro = 0;
        double maiorPreco = 0;
        double menorPreco = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Produto " + i);
            System.out.print("Digite o preço: ");
            double preco = leitor.nextDouble();
            System.out.print("Digite a refrigeração (S/N): ");
            String refri = leitor.next();
            System.out.print("Digite a categoria (A/L/V): ");
            String categ = leitor.next();

            double custoEst = 0;
            double imp = 0;

            if (preco <= 20) {
                if (categ.equals("A")) {
                    custoEst = 2;
                } else if (categ.equals("L")) {
                    custoEst = 3;
                } else if (categ.equals("V")) {
                    custoEst = 4;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.equals("S")) {
                    custoEst = 6;
                } else {
                    custoEst = 0;
                }
            } else if (preco > 50) {
                if (refri.equals("S")) {
                    if (categ.equals("A")) {
                        custoEst = 5;
                    } else if (categ.equals("L")) {
                        custoEst = 2;
                    } else if (categ.equals("V")) {
                        custoEst = 4;
                    }
                } else {
                    if (categ.equals("A") || categ.equals("V")) {
                        custoEst = 0;
                    } else if (categ.equals("L")) {
                        custoEst = 1;
                    }
                }
            }

            if (!(categ.equals("A") && refri.equals("S"))) {
                imp = preco * 0.02;
            } else {
                imp = preco * 0.04;
            }

            double precoFinal = preco + custoEst + imp;
            
            if (i == 1) {
                maiorPreco = precoFinal;
                menorPreco = precoFinal;
            } else {
                if (precoFinal > maiorPreco) {
                    maiorPreco = precoFinal;
                }
                if (precoFinal < menorPreco) {
                    menorPreco = precoFinal;
                }
            }

            adicional += custoEst + imp;
            totImp += imp;

            System.out.println("Custo de Estocagem: " + df.format(custoEst));
            System.out.println("Imposto: " + df.format(imp));
            System.out.println("Preço Final: " + df.format(precoFinal));

            if (precoFinal <= 20) {
                System.out.println("Classificação: Barato");
                qtdBarato++;
            } else if (precoFinal <= 100) {
                System.out.println("Classificação: Normal");
                qtdNormal++;
            } else {
                System.out.println("Classificação: Caro");
                qtdCaro++;
            }
        }

        adicional /= 12;
        System.out.println("Média dos valores adicionais: " + df.format(adicional));
        System.out.println("Maior preço final: " + df.format(maiorPreco));
        System.out.println("Menor preço final: " + df.format(menorPreco));
        System.out.println("Total dos impostos: " + df.format(totImp));
        System.out.println("Quantidade de produtos Baratos: " + qtdBarato);
        System.out.println("Quantidade de produtos Normais: " + qtdNormal);
        System.out.println("Quantidade de produtos Caros: " + qtdCaro);

        leitor.close();
    }
}