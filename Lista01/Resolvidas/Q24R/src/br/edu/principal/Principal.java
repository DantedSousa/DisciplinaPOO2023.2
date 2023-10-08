package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double horas;
		int hr, min;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da hora: ");
		horas = sc.nextDouble();
                
        hr = (int) horas; 
        min = (int) ((horas - hr) * 100); 
        
        int conversao = (hr * 60) + min;
        
        System.out.println("O valor convertido é: " + conversao + " minutos");

        
	}
}
	        
	    


