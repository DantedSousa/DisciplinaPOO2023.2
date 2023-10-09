package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h_i, m_i, h_f, m_f, h_d, m_d;
        
        System.out.println("Digite o horário inicial:");
        System.out.print("Hora: ");
        h_i = sc.nextInt();
        System.out.println("Minuto: ");
        m_i = sc.nextInt();
        
        System.out.println("Digite o horário final:");
        System.out.println("Hora: ");
        h_f = sc.nextInt();
        System.out.println("Minuto: ");
        m_f = sc.nextInt();
        
        if (m_i > m_f) {
            m_f += 60;
            h_f--;
        }
        
        if (h_i > h_f) {
            h_f += 24;
        }
        
        m_d = m_f - m_i;
        h_d = h_f - h_i;
        
        System.out.println("O jogo durou " + h_d + " hora(s) e " + m_d + " minuto(s)");
        
		
		
	}

}
