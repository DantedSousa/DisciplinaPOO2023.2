package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();
        double gratificacao = 0;

        if (salarioBruto <= 350.00) {
            gratificacao = 100.00;
        } else if (salarioBruto <= 600.00) {
            gratificacao = 75.00;
        } else if (salarioBruto <= 900.00) {
            gratificacao = 50.00;
        } else {
            gratificacao = 35.00;
        }

        double imposto = 0.07 * salarioBruto;
        double salarioLiquido = salarioBruto + gratificacao - imposto;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Gratificação: R$" + gratificacao);
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Valor a Receber: R$" + salarioLiquido);

        scanner.close();
    }
}