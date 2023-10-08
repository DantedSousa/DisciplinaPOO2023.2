package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        if (salario < 500.00) {
            double aumento = salario * 0.30;
            double novoSalario = salario + aumento;
            System.out.println("Salário reajustado: R$ " + novoSalario);
        } else {
            System.out.println("O funcionário não tem direito ao aumento.");
        }

        scanner.close();
    }
}