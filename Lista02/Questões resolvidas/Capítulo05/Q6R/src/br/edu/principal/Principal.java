package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 450.0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o código do funcionário: ");
            int codigo = scanner.nextInt();
            
            System.out.print("Digite o número de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            
            System.out.print("Digite o turno de trabalho (M - matutino, V - vespertino, N - noturno): ");
            String turno = scanner.next().toUpperCase();
            
            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.print("Turno inválido. Digite novamente (M/V/N): ");
                turno = scanner.next().toUpperCase();
            }
            
            System.out.print("Digite a categoria (G - gerente, O - operário): ");
            String categoria = scanner.next().toUpperCase();
            
            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.print("Categoria inválida. Digite novamente (G/O): ");
                categoria = scanner.next().toUpperCase();
            }
            
            double valorHora;
            if (categoria.equals("G")) {
                valorHora = (turno.equals("N")) ? (salarioMinimo * 0.18) : (salarioMinimo * 0.15);
            } else {
                valorHora = (turno.equals("N")) ? (salarioMinimo * 0.13) : (salarioMinimo * 0.10);
            }
            
            double salarioInicial = horasTrabalhadas * valorHora;
            
            double auxilioAlimentacao;
            if (salarioInicial <= 300) {
                auxilioAlimentacao = salarioInicial * 0.20;
            } else if (salarioInicial < 600) {
                auxilioAlimentacao = salarioInicial * 0.15;
            } else {
                auxilioAlimentacao = salarioInicial * 0.05;
            }
            
            double salarioFinal = salarioInicial + auxilioAlimentacao;
            
            System.out.println("Código: " + codigo);
            System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
            System.out.println("Valor da Hora Trabalhada: " + valorHora);
            System.out.println("Salário Inicial: " + salarioInicial);
            System.out.println("Auxílio Alimentação: " + auxilioAlimentacao);
            System.out.println("Salário Final: " + salarioFinal);
            System.out.println();
        }
        
        scanner.close();
    }
}