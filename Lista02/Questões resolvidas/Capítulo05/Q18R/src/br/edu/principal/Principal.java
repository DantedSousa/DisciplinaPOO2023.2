package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num;
        
        do {
            System.out.print("Digite um valor (zero ou negativo para sair): ");
            num = scanner.nextDouble();
            
            if (num <= 0) {
                break;
            }
            
            double quadrado = num * num;
            double cubo = num * num * num;
            double raizQuadrada = Math.sqrt(num);
            
            System.out.println("Valor: " + num);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz Quadrada: " + raizQuadrada);
        } while (num > 0);
        
        scanner.close();
    }
}