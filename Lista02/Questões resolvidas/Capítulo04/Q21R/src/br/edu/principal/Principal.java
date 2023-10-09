package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codEst, codC;
        double pesoT, pesoQ, preC, imp, valorT;

        System.out.print("Digite o código do estado (1 a 5): ");
        codEst = sc.nextInt();

        System.out.print("Digite o peso em toneladas: ");
        pesoT = sc.nextDouble();

        System.out.print("Digite o código da carga (10 a 40): ");
        codC = sc.nextInt();

        pesoQ = pesoT * 1000;

        if (codC >= 10 & codC <= 20) {
            preC = 100 * pesoQ;
        } else if (codC >= 21 & codC <= 30) {
            preC = 250 * pesoQ;
        } else if (codC >= 31 & codC <= 40) {
            preC = 340 * pesoQ;
        } else {
            System.out.println("Código de carga inválido.");
            return;
        }

        if (codEst == 1) {
            imp = 0.35 * preC;
        } else if (codEst == 2) {
            imp = 0.25 * preC;
        } else if (codEst == 3) {
            imp = 0.15 * preC;
        } else if (codEst == 4) {
            imp = 0.05 * preC;
        } else if (codEst == 5) {
            imp = 0;
        } else {
            System.out.println("Código de estado inválido.");
            return;
        }

        valorT = preC + imp;

        System.out.println("Peso em quilos: " + pesoQ);
        System.out.println("Preço da carga: " + preC);
        System.out.println("Imposto: " + imp);
        System.out.println("Valor total: " + valorT);


	}

}
