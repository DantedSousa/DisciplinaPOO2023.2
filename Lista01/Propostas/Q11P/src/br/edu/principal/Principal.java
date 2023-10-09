package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da diagonal maior (em unidades): ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Digite a medida da diagonal menor (em unidades): ");
        double diagonalMenor = scanner.nextDouble();

        double areaLosango = (diagonalMaior * diagonalMenor) / 2.0;

        System.out.println("A área do losango é: " + areaLosango + " unidades quadradas");

        scanner.close();
    }
}