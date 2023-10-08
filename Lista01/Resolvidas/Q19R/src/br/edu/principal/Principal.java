package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite a altura de cada degrau (em metros): ");
	        int a_degrau = sc.nextInt();

	        System.out.println("Digite a altura que deseja alcançar (em metros): ");
	        int a_usuario = sc.nextInt();

	        int qtd_degraus= a_usuario/ a_degrau;

	        System.out.println("Você deve subir " + qtd_degraus + " degraus para atingir a altura desejada.");

	        sc.close();

	}

}
