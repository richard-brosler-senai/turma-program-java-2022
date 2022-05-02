package br.com.senaisp.aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intRes = 1; // 1- continua, 2-n�o continua
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		// Relativo a venda
		int intCodProd, intQtdeProd;
		double dblPrecoUnit, dblPrecoTotal, dblTotalVenda;
		String strProdDesc;
		do { //la�o para continuar s/n
			dblTotalVenda = 0;
			System.out.println("Bem vindo ao sistema de frente caixa");
			do { //la�o para venda do cupom fiscal
				// Tratando a entrada de dados do produto
				do {
					System.out.println("Digite o c�digo do produto: (0 - fim da venda)");
					intCodProd = sc.nextInt();
				} while (intCodProd < 0);
				//s� posso digita descri��o, pre�o e etc se codproduto > 0
				if (intCodProd > 0) {
					sc.nextLine(); // interceptar o enter do c�digo do produto
					System.out.println("Digite a descri��o do produto:");
					strProdDesc = sc.nextLine();
					// tratando a entrada de dados da quantidade
					do {
						System.out.println("Digite a quantidade de produto:");
						intQtdeProd = sc.nextInt();
					} while (intQtdeProd <= 0);
					// tratando o pre�o unit�rio do item
					do {
						System.out.println("Digite o pre�o unit�rio do produto:");
						dblPrecoUnit = sc.nextDouble();
					} while (dblPrecoUnit <= 0);
					// calculando o pre�o total
					dblPrecoTotal = intQtdeProd * dblPrecoUnit;
					//acumulando o valor
					dblTotalVenda += dblPrecoTotal;
					System.out.println("O valor total do item "+ strProdDesc +
									   " foi " + dblPrecoTotal);
				}

			} while (intCodProd != 0);
			//Mostrando o total geral da venda
			System.out.println("O valor total da venda foi " + dblTotalVenda);
			//Tratamento para continua��o
			do {
				System.out.println("Deseja continuar? (1-sim,2-n�o)");
				intRes = sc.nextInt();
			} while (intRes != 1 && intRes != 2);
			//
		}while (intRes != 2);
		sc.close();
	}

}
