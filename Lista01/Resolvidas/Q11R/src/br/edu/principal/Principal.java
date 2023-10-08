package br.edu.principal;

public class Principal {
public static void main(String[] args) {
	double num = 9;
	double numquad = Math.pow(num, 2);
	double numcub = Math.pow(num, 3);
	double numraiz = Math.sqrt(num);
	double numraiz2 = Math.cbrt(num);
	System.out.println("O número "+ num + " ao quadrado é: " + numquad);
	System.out.println("O número "+ num + " ao cubo é: " + numcub);
	System.out.println("a raíz quadrada do número "+ num + " é: " + numraiz);
	System.out.println("a raíz cúbica do número "+ num + " é: " + numraiz2);
	
	
}
}
