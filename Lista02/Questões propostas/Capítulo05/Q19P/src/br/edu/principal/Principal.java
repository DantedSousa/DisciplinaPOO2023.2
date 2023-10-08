package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char tipoAcao;
        double precoCompra, precoVenda, lucro, lucroTotal = 0;
        int acoesComLucroSuperior1000 = 0, acoesComLucroInferior200 = 0;

        while (true) {
            System.out.print("Digite o tipo da ação (ou 'F' para finalizar): ");
            tipoAcao = scanner.next().charAt(0);

            if (tipoAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço de compra da ação: ");
            precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda da ação: ");
            precoVenda = scanner.nextDouble();

            lucro = precoVenda - precoCompra;
            lucroTotal += lucro;

            System.out.println("Lucro da ação: R$ " + lucro);

            if (lucro > 1000) {
                acoesComLucroSuperior1000++;
            }

            if (lucro < 200) {
                acoesComLucroInferior200++;
            }
        }

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + acoesComLucroSuperior1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + acoesComLucroInferior200);
        System.out.println("Lucro total da empresa: R$ " + lucroTotal);

        scanner.close();
    }
}