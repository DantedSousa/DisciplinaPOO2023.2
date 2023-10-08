package br.edu.principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double peso, racaoGato1, racaoGato2, totalFinal;
        System.out.println("Digite o peso do saco de ração");
        peso = sc.nextDouble();
        System.out.println("Digite a quantidade de ração para o primeiro gato (Em gramas)");
        racaoGato1 = sc.nextDouble();
        System.out.println("Digite a quantidade de ração para o segundo gato (Em gramas)");
        racaoGato2 = sc.nextDouble();
        
        racaoGato1 /= 1000;
        racaoGato2 /= 1000;

        totalFinal = peso - 5 * (racaoGato1 + racaoGato2);
        System.out.println("Toatal final da ração no saco: " + totalFinal + " kg");
 
	}
}