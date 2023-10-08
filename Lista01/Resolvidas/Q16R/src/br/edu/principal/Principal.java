package br.edu.principal;

import java.util.Scanner;

public class Principal {
	 public static void main(String                                                                                                                                                                                            [] args) {
	        Scanner sc = new Scanner(System.in);

	        double horasTbs, vlrSalarioMn, vlrHoraTb, vlrSalarioBr, imp, vlrSalarioLq;
	        
	        System.out.print("Digite as horas trabalhadas: ");
	        horasTbs = sc.nextDouble();
	        System.out.print("Digite o valor do salário mínimo: ");
	        vlrSalarioMn = sc.nextDouble();
	        
	        vlrHoraTb = vlrSalarioMn/ 2;
	        vlrSalarioBr = vlrHoraTb* horasTbs;
	        imp= vlrSalarioBr* 3 / 100;
	        vlrSalarioLq = vlrSalarioBr - imp;
	        
	        System.out.println("Valor do salário líquido: " + vlrSalarioLq);
	 }
}