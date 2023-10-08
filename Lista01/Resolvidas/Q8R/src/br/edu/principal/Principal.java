package br.edu.principal;

public class Principal {
public static void main(String[] args) {
	double dep = 142;
	double taxa = 45;
	double total = 0;
	double rend = 0;
	System.out.println("O deposito feito foi de R$" + dep + " E a taxa colocada foi de R$" + taxa);
	rend = dep * taxa/100;
	total = dep + rend;
	
	System.out.println("O rendimento foi de R$" + rend);
	System.out.println("O dinheiro total é de R$" + total);
}
}
