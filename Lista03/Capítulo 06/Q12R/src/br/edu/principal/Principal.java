package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] veiculo = new String[5];
        double[] consumo = new double[5];
        int menor_vei = 0;
        double menor_cons = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o modelo do carro " + (i + 1) + ": ");
            veiculo[i] = scanner.nextLine();
            System.out.print("Digite o consumo em km/l do carro " + veiculo[i] + ": ");
            consumo[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextDouble()

            if (i == 0 || consumo[i] < menor_cons) {
                menor_cons = consumo[i];
                menor_vei = i;
            }
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < 5; i++) {
            double valor = 1000 / consumo[i];
            System.out.println("O veículo " + veiculo[i] + " consome " + valor + " litro(s) de combustível para percorrer 1000 km.");
        }

        System.out.println("O veículo mais econômico é " + veiculo[menor_vei]);

        scanner.close();
    }
}