package br.com.senaisp.aula06;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Aula06Exe01 {
	static final double pi = 3.1415;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResp = 1; //1 - sim, 2 - n�o
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		//come�ando o la�o de repeti��o
		while (intResp != 2) {
			//Limpando a tela (s� funciona no terminal)
			System.out.print("\033[H\033[2J");  
			System.out.flush(); 
			//Fim da limpeza de tela
			System.out.println("Programa de calculo de �rea de cilindro");
			System.out.println("Digite o raio do cilindro:");
			double dblRaio = sc.nextDouble();
			System.out.println("Digite a altura do cilindro:");
			double dblAltura = sc.nextDouble();
			double dblArea = 2 * pi * dblRaio * ( dblRaio + dblAltura);
			System.out.println("A �rea calculada � " + dblArea);
			System.out.println("Deseja continuar? (1-sim/2-n�o):");
			intResp = sc.nextInt();
		}
	}

}
