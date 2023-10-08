package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, res;
        char op;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        do {
            System.out.print("Digite a operação (+ ou *): ");
            op = input.next().charAt(0);
        } while (op != '+' && op != '*');

        res = calcular(num1, num2, op);
        System.out.println("Resultado: " + res);

        input.close();
    }

    public static double calcular(double num1, double num2, char simbolo) {
        if (simbolo == '+') {
            return num1 + num2;
        } else {
            return num1 * num2;
        }
    }
}