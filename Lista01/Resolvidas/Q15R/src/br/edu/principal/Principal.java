package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pFab, percD, percI, vlrD, vlrI, pFinal;

        System.out.print("Digite o preço de fábrica: ");
        pFab = sc.nextDouble();
        System.out.print("Digite a porcentagem de distribuidor: ");
        percD = sc.nextDouble();
        System.out.print("Digite a porcentagem de impostos: ");
        percI = sc.nextDouble();

        vlrD = pFab * percD / 100;
        vlrI = pFab* percI / 100;
        pFinal= pFab + vlrD + vlrI;

        System.out.println("Valor do distribuidor: " + vlrD);
        System.out.println("Valor dos impostos: " + vlrI);
        System.out.println("Preço final: " + pFinal);

    }
}
