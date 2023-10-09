package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salB, imp, grat, salLiq;
        int t;

        System.out.print("Digite o salário base: ");
        salB = sc.nextDouble();

        System.out.print("Digite o tempo de serviço (em anos): ");
        t = sc.nextInt();

        if (salB < 200) {
            imp = 0;
        } else if (salB <= 450) {
            imp = 0.03 * salB;
        } else if (salB < 700) {
            imp = 0.08 * salB;
        } else {
            imp = 0.12 * salB;
        }

        System.out.println("Imposto: " + imp);

        if (salB > 500) {
            if (t <= 3) {
                grat = 20;
            } else {
                grat = (t < 6) ? 35 : 33;
            }
        } else {
            grat = (t <= 3) ? 23 : 30;
        }

        System.out.println("Gratificação: " + grat);

        salLiq = salB - imp + grat;

        System.out.println("Salário líquido: " + salLiq);

        if (salLiq <= 350) {
            System.out.println("Classificação A");
        } else if (salLiq < 600) {
            System.out.println("Classificação B");
        } else {
            System.out.println("Classificação C");
        }

	}

}
