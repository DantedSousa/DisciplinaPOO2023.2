package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoAtual;
        double salario = 1000.0;
        double percentual = 0.015; // 1.5%

        System.out.print("Digite o ano atual: ");
        anoAtual = input.nextInt();

        double novoSalario = calcularSalario(anoAtual, salario, percentual);
        System.out.println("Salário atual em " + anoAtual + ": R$" + novoSalario);

        input.close();
    }

    public static double calcularSalario(int anoAtual, double salario, double percentual) {
        for (int ano = 2006; ano <= anoAtual; ano++) {
            salario += salario * percentual;
            percentual *= 2; // Aumento dobro do percentual
        }
        return salario;
    }
}