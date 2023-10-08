package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double percentualAumento;

        if (salario <= 300.00) {
            percentualAumento = 0.35; // 35%
        } else {
            percentualAumento = 0.15; // 15%
        }

        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;

        System.out.println("Salário reajustado: R$ " + novoSalario);

        scanner.close();
    }
}