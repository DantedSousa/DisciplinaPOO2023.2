package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double angulo, anguloRed;
        int voltas = 0;

        System.out.print("Digite o ângulo em graus: ");
        angulo = sc.nextDouble();

        if (angulo > 360 || angulo < -360) {
            voltas = (int) (angulo / 360);
            anguloRed = angulo % 360;
        } else {
            anguloRed = angulo;
        }

        if (anguloRed == 0 || anguloRed == 90 || anguloRed == 180 || anguloRed == 270
                || anguloRed == 360 || anguloRed == -90 || anguloRed == -180 || anguloRed == -270
                || anguloRed == -360) {
            System.out.println("Está em cima de algum dos eixos");
        } else if ((anguloRed > 0 & anguloRed < 90) || (anguloRed< -270 & anguloRed> -360)) {
            System.out.println("1º Quadrante");
        } else if ((anguloRed > 90 & anguloRed < 180) || (anguloRed < -180 & anguloRed > -270)) {
            System.out.println("2º Quadrante");
        } else if ((anguloRed> 180 & anguloRed < 270) || (anguloRed < -90 & anguloRed > -180)) {
            System.out.println("3º Quadrante");
        } else if ((anguloRed > 270 & anguloRed < 360) || (anguloRed < 0 & anguloRed > -90)) {
            System.out.println("4º Quadrante");
        }

        if (voltas != 0) {
            System.out.println(voltas + " volta(s) no sentido " + (angulo < 0 ? "horário" : "anti-horário"));
        }

	}

}
