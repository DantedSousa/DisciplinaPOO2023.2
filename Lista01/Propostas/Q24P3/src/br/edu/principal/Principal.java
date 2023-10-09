package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro em reais: ");
        double quantidadeEmReais = scanner.nextDouble();

        double cotacaoDolar = 1.80;
        double cotacaoMarcoAlemao = 2.00;
        double cotacaoLibraEsterlina = 3.57;

        double quantidadeEmDolares = quantidadeEmReais / cotacaoDolar;
        double quantidadeEmMarcoAlemao = quantidadeEmReais / cotacaoMarcoAlemao;
        double quantidadeEmLibraEsterlina = quantidadeEmReais / cotacaoLibraEsterlina;

        System.out.println("Quantidade em dólares: $" + quantidadeEmDolares);
        System.out.println("Quantidade em marco alemão: " + quantidadeEmMarcoAlemao + " DM");
        System.out.println("Quantidade em libra esterlina: £" + quantidadeEmLibraEsterlina);

        scanner.close();
    }
}