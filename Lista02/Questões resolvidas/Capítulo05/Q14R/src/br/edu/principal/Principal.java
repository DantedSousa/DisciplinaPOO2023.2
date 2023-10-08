package br.edu.principal;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        System.out.println("Digite o valor inicial da dívida: ");
        double valorInicial = leitor.nextDouble();
        
        double juros = 0;
        int numParcelas = 1;
        double total = valorInicial;
        double valorParcela = valorInicial;
        
        System.out.println("Valor da dívida\tValor dos juros\tQuantidade de parcelas\tValor da parcela");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(df.format(total) + "\t" + df.format(juros) + "\t" + (numParcelas == 1 ? numParcelas + "\t\t" : numParcelas + "\t") + df.format(valorParcela));
            
            juros += (i == 0) ? 10 : 5;
            numParcelas += (i == 0) ? 2 : 3;
            
            double valorJuros = (valorInicial * juros) / 100;
            total = valorInicial + valorJuros;
            valorParcela = total / numParcelas;
        }
        
        leitor.close();
    }
}