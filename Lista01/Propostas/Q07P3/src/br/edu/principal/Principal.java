package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        double novoPesoEngordar = peso * 1.15;

        double novoPesoEmagrecer = peso * 0.80;

        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar);
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer);

        scanner.close();
    }
}