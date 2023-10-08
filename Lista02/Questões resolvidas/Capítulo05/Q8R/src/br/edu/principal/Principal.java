package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o número de termos: ");
			int numTermos = input.nextInt();

			int num1 = 2;
			int num2 = 7;
			int num3 = 3;

			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);

			int i = 4;
			while (i <= numTermos) {
			    num1 *= 2;
			    System.out.println(num1);
			    i++;

			    if (i <= numTermos) {
			        num2 *= 3;
			        System.out.println(num2);
			        i++;
			    }

			    if (i <= numTermos) {
			        num3 *= 4;
			        System.out.println(num3);
			        i++;
			    }
			}
		}
    }
}