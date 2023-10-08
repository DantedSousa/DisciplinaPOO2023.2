package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0;
        int cont_f1 = 0, menor_idade = 0;
        double media_idade = 0, perc = 0;
        String sexo, exp;

        System.out.println("Informe a idade, sexo (M ou F) e experiência no serviço (S ou N) de cada candidato:");
        System.out.println("Para encerrar, digite 0 para a idade.");

        do {
            idade = scanner.nextInt();
            if (idade != 0) {
                sexo = scanner.next();
                exp = scanner.next();

                if (sexo.equals("F") && exp.equals("S")) {
                    if (tot == 0) {
                        menor_idade = idade;
                        tot = 1;
                    } else if (idade < menor_idade) {
                        menor_idade = idade;
                    }
                }

                if (sexo.equals("M")) {
                    tot_m++;
                    if (idade > 45) {
                        cont_m1++;
                    }

                    if (exp.equals("S")) {
                        soma1 += idade;
                        cont_m2++;
                    }
                }

                if (sexo.equals("F")) {
                    tot_f++;
                    if (idade < 21 && exp.equals("S")) {
                        cont_f1++;
                    }
                }
            }
        } while (idade != 0);

        System.out.println("Número de candidatos do sexo feminino: " + tot_f);
        System.out.println("Número de candidatos do sexo masculino: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência.");
        } else {
            media_idade = (double) soma1 / cont_m2;
            System.out.println("Idade média dos homens com experiência: " + media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.println("Porcentagem de homens com mais de 45 anos: " + perc + "%");
        }

        System.out.println("Número de mulheres com idade inferior a 21 anos e com experiência: " + cont_f1);
        if (tot == 0) {
            System.out.println("Nenhuma mulher com experiência.");
        } else {
            System.out.println("Menor idade entre as mulheres com experiência: " + menor_idade);
        }

        scanner.close();
    }
}