package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
	String nome = sc.next();	
	sc = new Scanner(System.in);
	System.out.println("por gentileza sr." + nome + " Digite quanto dinheiro você ganha por mês(seu salario): ");
	double sal = sc.nextDouble();	
	double grat = sal * 5/100;
	double imp = sal * 7/100;
	double newsal = sal + grat - imp;
	System.out.println("o valor do seu salario base é R$" + sal);
	System.out.println("o valor do seu salario a receber é R$" + newsal);
}
}
