package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadePrimos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            if (ehPrimo(numero)) {
                quantidadePrimos++;
            }
        }
        
        System.out.println("Quantidade de números primos digitados: " + quantidadePrimos);
        
        scanner.close();
    }
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}