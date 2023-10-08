package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário de Carlos: ");
        double salCarlos = scanner.nextDouble();

        double salJoao = salCarlos / 3;
        int meses = 0;

        while (salJoao < salCarlos) {
            salCarlos += (salCarlos * 0.02); // Rendimento da poupança (2% ao mês)
            salJoao += (salJoao * 0.05);     // Rendimento do fundo de renda fixa (5% ao mês)
            meses++;
        }

        System.out.println("Quantidade de meses necessários: " + meses);

        scanner.close();
    }
}