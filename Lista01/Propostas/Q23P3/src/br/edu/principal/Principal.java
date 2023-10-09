package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida do primeiro ângulo (em graus): ");
        double angulo1 = scanner.nextDouble();

        System.out.print("Digite a medida do segundo ângulo (em graus): ");
        double angulo2 = scanner.nextDouble();

        // Calcula a medida do terceiro ângulo
        double angulo3 = 180 - angulo1 - angulo2;

        System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");

        scanner.close();
    }
}