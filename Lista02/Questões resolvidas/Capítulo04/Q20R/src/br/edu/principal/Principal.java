package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int codProd, codPais;
        double pesoQ, pesoG, preT, imp, valorT, preG;

        System.out.print("Digite o código do produto (1 a 10): ");
        codProd = sc.nextInt();

        System.out.print("Digite o peso em quilos: ");
        pesoQ = sc.nextDouble();

        System.out.print("Digite o código do país (1, 2 ou 3): ");
        codPais = sc.nextInt();

        pesoG = pesoQ * 1000;

        if (codProd >= 1 & codProd <= 4) {
            preG = 10;
        } else if (codProd >= 5 & codProd <= 7) {
            preG = 25;
        } else if (codProd >= 8 & codProd <= 10) {
            preG = 35;
        } else {
            System.out.println("Código de produto inválido.");
            return;
        }

        preT = pesoG * preG;

        if (codPais == 1) {
            imp = 0;
        } else if (codPais == 2) {
            imp = preT * 0.15;
        } else if (codPais == 3) {
            imp = preT * 0.25;
        } else {
            System.out.println("Código de país inválido.");
            return;
        }

        valorT = preT + imp;

        System.out.println("Peso em gramas: " + pesoG);
        System.out.println("Preço total: " + preT);
        System.out.println("Imposto: " + imp);
        System.out.println("Valor total: " + valorT);


	}

}
