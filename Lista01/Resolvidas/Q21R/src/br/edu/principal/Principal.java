package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da escada (em metros): ");
        double z = sc.nextDouble();

        System.out.print("Digite a altura em que deseja pregar o quadro (em metros): ");
        double x = sc.nextDouble();
        
        double y = Math.sqrt(Math.pow(z, 2) - Math.pow(x, 2));

        System.out.println(" A escada deve estar a uma distância de " + y + " metros da parede.");

        sc.close();

	}

}
