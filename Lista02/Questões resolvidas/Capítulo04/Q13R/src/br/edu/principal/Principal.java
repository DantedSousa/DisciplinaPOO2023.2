package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        double sal, imp, aum, novoSal;
        
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1 - Imposto");
        System.out.println("2 - Novo salário");
        System.out.println("3 - Classificação");
        System.out.print("Digite a opção desejada: ");
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.print("Digite o salário: ");
                sal = sc.nextDouble();
                if (sal < 500) {
                    imp = sal * 5 / 100;
                } else if (sal >= 500 && sal <= 850) {
                    imp = sal * 10 / 100;
                } else {
                    imp = sal * 15 / 100;
                }
                System.out.println("Imposto a ser pago: " + imp);
                break;
            case 2:
                System.out.print("Digite o salário: ");
                sal = sc.nextDouble();
                if (sal > 1500) {
                    aum = 25;
                } else if (sal >= 750 && sal <= 1500) {
                    aum = 50;
                } else if (sal >= 450 && sal < 750) {
                    aum = 75;
                } else {
                    aum = 100;
                }
                novoSal = sal + aum;
                System.out.println("Novo salário: " + novoSal);
                break;
            case 3:
                System.out.print("Digite o salário: ");
                sal = sc.nextDouble();
                if (sal <= 700) {
                    System.out.println("Mal Remunerado");
                } else {
                    System.out.println("Bem Remunerado");
                }
                break;
            default:
                System.out.println("Opção Inválida");
        }

	}

}
