package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco, imp, transp, seguro, finalPreco;
        double totalImp = 0; // Inicialize a variável totalImp com zero
        int origem;
        String meioTransporte, carga;

        System.out.println("Digite o preço unitário do produto (ou zero para sair):");
        preco = scanner.nextDouble();

        while (preco > 0) {
            System.out.println("Digite o país de origem (1-Estados Unidos, 2-México, 3-Outros):");
            origem = scanner.nextInt();
            System.out.println("Digite o meio de transporte (T-terrestre, F-fluvial, A-aéreo):");
            meioTransporte = scanner.next();
            System.out.println("Carga perigosa (S-sim, N-não):");
            carga = scanner.next();

            if (preco <= 100) {
                imp = preco * 0.05;
            } else {
                imp = preco * 0.10;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    transp = 50.00;
                } else if (origem == 2) {
                    transp = 21.00;
                } else {
                    transp = 24.00;
                }
            } else {
                if (origem == 1) {
                    transp = 12.00;
                } else if (origem == 2) {
                    transp = 21.00;
                } else {
                    transp = 60.00;
                }
            }

            if (origem == 2 || meioTransporte.equals("A")) {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            finalPreco = preco + imp + transp + seguro;
            totalImp += imp;

            System.out.println("Imposto: " + imp);
            System.out.println("Valor do transporte: " + transp);
            System.out.println("Valor do seguro: " + seguro);
            System.out.println("Preço final: " + finalPreco);

            System.out.println("Digite o preço unitário do próximo produto (ou zero para sair):");
            preco = scanner.nextDouble();
        }

        System.out.println("Total dos impostos: " + totalImp);

        scanner.close();
    }
}