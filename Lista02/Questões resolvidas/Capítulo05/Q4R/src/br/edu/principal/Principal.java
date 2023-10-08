package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorIndiceAcidentes = 0;
        int menorIndiceAcidentes = Integer.MAX_VALUE;
        int codCidadeMaior = 0;
        int codCidadeMenor = 0;
        int somaVeiculos = 0;
        int somaAcidentesMenos2000 = 0;
        int contCidadesMenos2000 = 0;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Cidade " + cont + ":");
            System.out.print("Código da cidade: ");
            int codCidade = input.nextInt();
            System.out.print("Número de veículos de passeio: ");
            int numVeiculos = input.nextInt();
            System.out.print("Número de acidentes de trânsito com vítimas: ");
            int numAcidentes = input.nextInt();

            // Verifica maior e menor índice de acidentes
            if (numAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = numAcidentes;
                codCidadeMaior = codCidade;
            }
            if (numAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = numAcidentes;
                codCidadeMenor = codCidade;
            }

            // Soma veículos
            somaVeiculos += numVeiculos;

            // Verifica se a cidade tem menos de 2000 veículos
            if (numVeiculos < 2000) {
                somaAcidentesMenos2000 += numAcidentes;
                contCidadesMenos2000++;
            }
        }

        // Exibe resultados
        System.out.println("Maior índice de acidentes pertence à cidade " + codCidadeMaior + " com " + maiorIndiceAcidentes + " acidentes.");
        System.out.println("Menor índice de acidentes pertence à cidade " + codCidadeMenor + " com " + menorIndiceAcidentes + " acidentes.");
        System.out.println("Média de veículos nas cinco cidades: " + (double) somaVeiculos / 5);

        if (contCidadesMenos2000 == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + (double) somaAcidentesMenos2000 / contCidadesMenos2000);
        }

        input.close();
    }
}