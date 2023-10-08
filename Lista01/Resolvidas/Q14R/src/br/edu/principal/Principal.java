package br.edu.principal;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
    int hojeEmDia, anoNasc, idadeAtual, idadeFuturo;

    System.out.println("Digite o ano atual: ");
    hojeEmDia = sc.nextInt();
    System.out.println("Digite o ano de nascimento: ");
    anoNasc = sc.nextInt();

    idadeAtual = hojeEmDia - anoNasc;
    idadeFuturo = 2050 - anoNasc;

   
    System.out.println("Idade atual: " + idadeAtual);
    System.out.println("Idade em 2050: " + idadeFuturo);
	
	}
}
