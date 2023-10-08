package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salMin = sc.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida pela residência: ");
        double consumoQuilowatts = sc.nextDouble();
        
        double valorQw = salMin / 5;
        double valorTotal = valorQw * consumoQuilowatts;
        double desconto = valorTotal * 15 / 100;
        double valorComDesconto = valorTotal - desconto;

        System.out.println("Valor de cada quilowatt: R$" + valorQw);
        System.out.println("Valor a ser pago pela residência: R$" + valorTotal);
        System.out.println("Valor a ser pago com desconto de 15%: R$" + valorComDesconto);

        sc.close();
		
	}
}
