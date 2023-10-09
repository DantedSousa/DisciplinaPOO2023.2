package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        double salMin, nht, coef, salB, imp, grat, aux, salLiq;
        String tur, cat;

        System.out.print("Digite o salário mínimo: ");
        salMin = sc.nextDouble();

        System.out.print("Digite o turno (M - Matutino, V - Vespertino, N - Noturno): ");
        tur = sc.next();

        System.out.print("Digite a categoria (O - Operário, G - Gerente): ");
        cat = sc.next();

        System.out.print("Digite o número de horas trabalhadas: ");
        nht = sc.nextDouble();

        if (tur.equals("M")) {
            coef = 0.10 * salMin;
        } else if (tur.equals("V")) {
            coef = 0.15 * salMin;
        } else {
            coef = 0.12 * salMin;
        }

        System.out.println("Coeficiente: " + coef);

        salB = nht * coef;
        System.out.println("Salário bruto: " + salB);

        if (cat.equals("O")) {
            if (salB >= 300) {
                imp = 0.05 * salB;
            } else {
                imp = 0.03 * salB;
            }
        } else {
            if (salB >= 400) {
                imp = 0.06 * salB;
            } else {
                imp = 0.04 * salB;
            }
        }

        System.out.println("Imposto: " + imp);

        if (tur.equals("N") & nht > 80) {
            grat = 50;
        } else {
            grat = 30;
        }

        System.out.println("Gratificação: " + grat);

        if (cat.equals("O") || coef <= 25) {
            aux = (1.0 / 3) * salB;
        } else {
            aux = 0.5 * salB;
        }

        System.out.println("Auxílio: " + aux);

        salLiq = salB - imp + grat + aux;

        System.out.println("Salário líquido: " + salLiq);

        if (salLiq < 350) {
            System.out.println("Mal Remunerado");
        } else if (salLiq >= 350 & salLiq <= 600) {
            System.out.println("Normal");
        } else {
            System.out.println("Bem Remunerado");
        }

	}

}
