package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int numTermos = input.nextInt();

        System.out.print("Digite um valor positivo para X: ");
        double x = input.nextDouble();

        double s = 0;
        int denominador = 2;
        int expoente = 2;
        int sinal = -1;

        for (int i = 1; i <= numTermos; i++) {
            double termo = Math.pow(x, expoente) / fatorial(denominador);
            s += sinal * termo;

            expoente++;
            denominador += 2;
            sinal *= -1;
        }

        System.out.println("O valor da série é: " + s);

        input.close();
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}