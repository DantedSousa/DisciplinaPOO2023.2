package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] faixaEtaria = new int[5];
        int totalPessoas = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            
            totalPessoas++;

            if (idade <= 15) {
                faixaEtaria[0]++;
            } else if (idade <= 30) {
                faixaEtaria[1]++;
            } else if (idade <= 45) {
                faixaEtaria[2]++;
            } else if (idade <= 60) {
                faixaEtaria[3]++;
            } else {
                faixaEtaria[4]++;
            }
        }

        System.out.println("Quantidade de pessoas em cada faixa etária:");
        System.out.println("1a Faixa Etária (Até 15 anos): " + faixaEtaria[0] + " pessoas");
        System.out.println("2a Faixa Etária (De 16 a 30 anos): " + faixaEtaria[1] + " pessoas");
        System.out.println("3a Faixa Etária (De 31 a 45 anos): " + faixaEtaria[2] + " pessoas");
        System.out.println("4a Faixa Etária (De 46 a 60 anos): " + faixaEtaria[3] + " pessoas");
        System.out.println("5a Faixa Etária (Acima de 60 anos): " + faixaEtaria[4] + " pessoas");

        double porcentagemPrimeiraFaixa = (double) faixaEtaria[0] / totalPessoas * 100;
        double porcentagemUltimaFaixa = (double) faixaEtaria[4] / totalPessoas * 100;

        System.out.println("Porcentagem de pessoas na primeira faixa etária com relação ao total de pessoas: " + porcentagemPrimeiraFaixa + "%");
        System.out.println("Porcentagem de pessoas na última faixa etária com relação ao total de pessoas: " + porcentagemUltimaFaixa + "%");

        scanner.close();
    }
}