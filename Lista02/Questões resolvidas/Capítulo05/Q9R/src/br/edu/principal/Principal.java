package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int ta = 0; // Total de alunos aprovados
			int te = 0; // Total de alunos em exame
			int tr = 0; // Total de alunos reprovados
			double mediaClasse = 0; // Média da classe

			for (int cont = 1; cont <= 6; cont++) {
			    System.out.println("Digite as notas do aluno " + cont + ":");
			    double n1 = input.nextDouble();
			    double n2 = input.nextDouble();

			    double media = (n1 + n2) / 2;
			    System.out.println("Média do aluno " + cont + ": " + media);

			    if (media <= 3) {
			        tr++;
			        System.out.println("Situação: Reprovado");
			    } else if (media < 7) {
			        te++;
			        System.out.println("Situação: Exame");
			    } else {
			        ta++;
			        System.out.println("Situação: Aprovado");
			    }

			    mediaClasse += media;
			}

			System.out.println("Total de alunos aprovados: " + ta);
			System.out.println("Total de alunos em exame: " + te);
			System.out.println("Total de alunos reprovados: " + tr);
			mediaClasse /= 6;
			System.out.println("Média da classe: " + mediaClasse);
		}
    }
}