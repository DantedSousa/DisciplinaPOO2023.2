package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        double n1, n2, n3, m, ne;
        
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        
        m = (n1 + n2 + n3) / 3;
        System.out.println("sua média aritmética: " + m);
        
        if (m >= 0 & m < 3) {
            System.out.println("você foi reprovado");
        } else if (m >= 3 & m < 7) {
            System.out.println("nota no exame");
            ne= 12 - m;
            System.out.println("você deve tirar nota " + ne+ " para ser aprovado");
        } else if (m >= 7 & m <= 10) {
            System.out.println("você foi aprovado");
        } else {
            System.out.println("a média fora do intervalo válido");
        }
        

	}

}
