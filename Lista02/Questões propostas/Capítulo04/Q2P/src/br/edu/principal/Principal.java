package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média aritmética: " + media);

        if (media >= 0 && media < 3.0) {
            System.out.println("Mensagem: Reprovado");
        } else if (media >= 3.0 && media < 7.0) {
            System.out.println("Mensagem: Exame");
        } else if (media >= 7.0 && media <= 10.0) {
            System.out.println("Mensagem: Aprovado");
        } else {
            System.out.println("Média inválida. Certifique-se de que as notas estão entre 0 e 10.");
        }

        scanner.close();
    }
}