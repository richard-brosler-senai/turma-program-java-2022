package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo de empr�stimo da PM Bauru");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do sal�rio bruto:");
		double dblSalario = sc.nextDouble();
		System.out.println("Digite o valor da parcela a ser contratada:");
		double dblParcela = sc.nextDouble();
		//verificando se � poss�vel contrair a d�vida :-)
		if (dblSalario * 30 / 100.00 >= dblParcela)
			System.out.println("Parab�ns, seu empr�stimo foi aprovado!");
		else
			System.out.println("Infelizmente seu empr�stimo n�o foi aprovado! :-(");
		
	}

}
