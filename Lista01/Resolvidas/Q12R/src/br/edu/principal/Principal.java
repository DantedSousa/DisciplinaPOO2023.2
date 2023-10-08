package br.edu.principal;

public class Principal {
public static void main(String[] args) {
	double n1 = 2;
	double n2 = 3;
	double n1n2 = Math.pow(n1, n2);
	double n2n1 = Math.pow(n2, n1);
	System.out.println("O primeiro número é "+n1+" e o segundo é "+n2);
	System.out.println("o primeiro número elevado pelo segundo é igual a: "+ n1n2);
	System.out.println("o segundo número elevado pelo primeiro é igual a: "+ n2n1);

}
}
