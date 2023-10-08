package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int qtdeMenor18 = 0;
			double mediaIdadeTotal = 0;
			double mediaAlturaTotal = 0;
			int totalJogadores = 5 * 11; // 5 times com 11 jogadores cada
			int totalAcima80Kg = 0;

			for (int contTime = 1; contTime <= 5; contTime++) {
			    double mediaIdadeTime = 0;

			    for (int contJog = 1; contJog <= 11; contJog++) {
			        System.out.println("Time " + contTime + " - Jogador " + contJog);
			        System.out.print("Idade: ");
			        int idade = input.nextInt();
			        System.out.print("Peso (kg): ");
			        double peso = input.nextDouble();
			        System.out.print("Altura (metros): ");
			        double altura = input.nextDouble();

			        if (idade < 18) {
			            qtdeMenor18++;
			        }

			        mediaIdadeTime += idade;
			        mediaAlturaTotal += altura;

			        if (peso > 80) {
			            totalAcima80Kg++;
			        }
			    }

			    mediaIdadeTime /= 11;
			    mediaIdadeTotal += mediaIdadeTime;
			}

			mediaIdadeTotal /= 5;
			mediaAlturaTotal /= totalJogadores;
			double porcentagemAcima80Kg = (double) totalAcima80Kg / totalJogadores * 100;

			System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtdeMenor18);
			System.out.println("Média das idades dos jogadores de cada time: " + mediaIdadeTotal);
			System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturaTotal);
			System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porcentagemAcima80Kg + "%");
		}
    }
}