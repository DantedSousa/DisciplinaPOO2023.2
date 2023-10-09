package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double notaT, avalS, e, m;
        
        System.out.println("Digite a nota do trabalho de laboratório: ");
        notaT= sc.nextDouble();
        
        System.out.println("Digite a nota da avaliação semestral: ");
        avalS= sc.nextDouble();
        
        System.out.println("Digite a nota do exame final: ");
        e = sc.nextDouble();
        
        m = (notaT * 2 + avalS* 3 + e * 5) / 10;
        
        System.out.println("Média ponderada: " + m);
        
        if (m >= 8 & m <= 10) {
            System.out.println("Obteve conceito A");
        } else if (m >= 7 & m < 8) {
            System.out.println("Obteve conceito B");
        } else if (m >= 6 & m < 7) {
            System.out.println("Obteve conceito C");
        } else if (m >= 5 & m < 6) {
            System.out.println("Obteve conceito D");
        } else if (m >= 0 & m < 5) {
            System.out.println("Obteve conceito E");
        } else {
            System.out.println("Média fora do intervalo válido");
        }
        
        
		

	}

}
