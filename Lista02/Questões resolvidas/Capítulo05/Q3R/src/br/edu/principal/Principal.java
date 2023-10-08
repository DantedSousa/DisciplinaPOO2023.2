package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Digite quantos valores deseja calcular o fatorial (N): ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um valor inteiro e positivo: ");
            int num = input.nextInt();
            long fat = calcularFatorial(num);
            System.out.println("Fatorial de " + num + " é: " + fat);
        }

        input.close();
    }

    public static long calcularFatorial(int num) {
        long fat = 1;
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}