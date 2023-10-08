package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 
		        Scanner sc= new Scanner(System.in);

		        System.out.print("Digite o ângulo da escada (em graus): ");
		        double ang = sc.nextDouble();

		        System.out.print("Digite a altura da parede (em metros): ");
		        double alt = sc.nextDouble();

		        
		        double angRad = Math.toRadians(ang);

		        
		        double compEscada = alt/ Math.sin(angRad);

		        System.out.println("A medida da escada é " + compEscada + " metros.");

		        sc.close();
		        
	}
}
