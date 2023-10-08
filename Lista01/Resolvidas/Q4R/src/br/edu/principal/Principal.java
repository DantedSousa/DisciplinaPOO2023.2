package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
	String nome = sc.next();	
	sc = new Scanner(System.in);
	System.out.println("por gentileza sr." + nome + " Digite quanto dinheiro você ganha por mês(seu salario): ");
	double sal = sc.nextDouble();	
	double newsal = sal + sal *25/100;
	System.out.println("o valor do seu salario base é de R$" + sal);
	System.out.println("seu salario com um aumento de 25% é R$" + newsal);
	
	
	
	
	
	
	
	
}
}
