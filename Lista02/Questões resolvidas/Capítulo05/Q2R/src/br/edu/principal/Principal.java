package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor inteiro e positivo N: ");
        int n = input.nextInt();
        input.close();

        double e = 1.0;
        double fat = 1.0;

        for (int i = 1; i <= n; i++) {
            fat = 1.0;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1.0 / fat;
        }

        System.out.println("O valor de E é: " + e);
    }
}