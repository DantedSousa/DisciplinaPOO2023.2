package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEspectadores = 15;
        int somaIdadesOtimo = 0;
        int quantidadeRegular = 0;
        int quantidadeBom = 0;

        for (int i = 1; i <= totalEspectadores; i++) {
            System.out.print("Digite a idade do espectador " + i + ": ");
            int idade = scanner.nextInt();

            System.out.print("Digite a opinião do espectador " + i + " (ótimo - 3, bom - 2, regular - 1): ");
            int opiniao = scanner.nextInt();

            if (opiniao == 3) {
                somaIdadesOtimo += idade;
            } else if (opiniao == 1) {
                quantidadeRegular++;
            } else if (opiniao == 2) {
                quantidadeBom++;
            }
        }

        double mediaIdadesOtimo = (double) somaIdadesOtimo / totalEspectadores;
        double percentagemBom = (double) (quantidadeBom * 100) / totalEspectadores;

        System.out.println("Média das idades das pessoas que responderam ótimo: " + mediaIdadesOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: " + quantidadeRegular);
        System.out.println("Percentagem de pessoas que responderam bom: " + percentagemBom + "%");

        scanner.close();
    }
}