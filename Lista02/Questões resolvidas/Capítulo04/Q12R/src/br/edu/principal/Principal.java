package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int cargo;
        double sal, aum, novoSal;
        
        System.out.println("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
        cargo = sc.nextInt();
        
        System.out.println("Digite o valor do salário: ");
        sal = sc.nextDouble();
        
        switch (cargo) {
            case 1:
                System.out.println("O cargo é Escriturário");
                aum = sal * 50 / 100;
                novoSal = sal + aum;
                break;
            case 2:
                System.out.println("O cargo é Secretário");
                aum = sal * 35 / 100;
                novoSal = sal + aum;
                break;
            case 3:
                System.out.println("O cargo é Caixa");
                aum = sal* 20 / 100;
                novoSal= sal + aum;
                break;
            case 4:
                System.out.println("O cargo é Gerente");
                aum = sal* 10 / 100;
                novoSal = sal + aum;
                break;
            case 5:
                System.out.println("O cargo é Diretor");
                aum = 0; 
                novoSal = sal;
                break;
            default:
                System.out.println("Cargo Inexistente!");
                aum = 0;
                novoSal = sal;
        }
        
        if (cargo >= 1 & cargo <= 5) {
            System.out.println("O valor do aumento é: " + aum);
            System.out.println("O novo salário é: " + novoSal);
        }

	}

}
