package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite um número inteiro maior que 1: ");
			int num = input.nextInt();

			if (isPrimo(num)) {
			    System.out.println("Número primo.");
			} else {
			    System.out.println("Número não primo.");
			}
		}
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}