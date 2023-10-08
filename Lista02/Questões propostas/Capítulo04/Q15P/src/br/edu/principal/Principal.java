package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de investimento:");
        System.out.println("1 - Poupança");
        System.out.println("2 - Fundos de renda fixa");
        int tipoInvestimento = scanner.nextInt();

        System.out.print("Digite o valor do investimento: ");
        double valorInvestimento = scanner.nextDouble();

        double rendimentoMensal;

        switch (tipoInvestimento) {
            case 1:
                rendimentoMensal = 0.03; // 3%
                break;
            case 2:
                rendimentoMensal = 0.04; // 4%
                break;
            default:
                System.out.println("Tipo de investimento inválido.");
                scanner.close();
                return;
        }

        double valorCorrigido = valorInvestimento * (1 + rendimentoMensal);

        System.out.println("Valor corrigido após um mês de investimento: R$ " + valorCorrigido);

        scanner.close();
    }
}