package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        int resultado = verifica(num);

        if (resultado == 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }

        input.close();
    }

    public static int verifica(int num) {
        if (num >= 0) {
            return 1; // Retorna 1 se o número for positivo
        } else {
            return 0; // Retorna 0 se o número for negativo
        }
    }
}