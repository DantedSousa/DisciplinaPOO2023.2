package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] cidade = new String[5];
        double[][] distancia = new double[5][5];
        double consumo;

        // Leitura dos nomes das cidades
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da cidade " + (i + 1) + ": ");
            cidade[i] = input.nextLine();
        }

        // Preenchimento da matriz de distâncias
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    distancia[i][j] = 0;
                } else {
                    System.out.print("Digite a distância entre " + cidade[i] + " e " + cidade[j] + " (em quilômetros): ");
                    distancia[i][j] = input.nextDouble();
                }
            }
        }

        // Percursos que não ultrapassam 250 quilômetros
        System.out.println("Percursos que não ultrapassam 250 quilômetros:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (distancia[i][j] <= 250 && distancia[i][j] > 0) {
                    System.out.println("Distância: " + distancia[i][j] + " entre " + cidade[i] + " e " + cidade[j]);
                }
            }
        }

        // Leitura do consumo de combustível
        System.out.print("Digite o consumo de combustível do veículo (quilômetros por litro): ");
        consumo = input.nextDouble();

        // Cálculo da quantidade de combustível necessária para os percursos
        System.out.println("Consumo de combustível para os percursos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    double qtde = distancia[i][j] / consumo;
                    System.out.println("Consumo entre " + cidade[i] + " e " + cidade[j] + " = " + qtde + " litros");
                }
            }
        }

        input.close();
    }
}