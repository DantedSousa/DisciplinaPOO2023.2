package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
	double num, i, f, a;
	num = 23;
	i = (int) num;
	f = num - i;
	a = (int) Math.round(num);
	
	System.out.println("Parte inteira: "+ i);
	System.out.println("Parte fracionária: " + f);
	System.out.println("Arredondado: " + a);

	}

}
