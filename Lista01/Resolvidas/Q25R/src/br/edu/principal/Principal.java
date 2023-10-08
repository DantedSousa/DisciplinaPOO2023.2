package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo do espetáculo: ");
        double custEspt = sc.nextDouble();

        System.out.print("Digite o preço do convite: ");
        double precoCvt = sc.nextDouble();

        int qtdCvts= (int) Math.ceil(custEspt/ precoCvt);

        System.out.println("A quantidade mínima de convites a serem vendidos é: " + qtdCvts);
	}

}
