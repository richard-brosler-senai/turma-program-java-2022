package br.com.senaisp.aula08;

import java.util.Scanner;

public class Aula08Exe02 {

	public static void main(String[] args) {
		int intContador = 0, intSoma = 0;
		int intNumero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa M�dia de n�meros positivos");
		do {
			System.out.println("Digite um n�mero positivo: " + 
					"(negativo finaliza o programa)");
			intNumero = sc.nextInt();
			if (intNumero >= 0) {
				intContador++;
				intSoma+=intNumero;
			}
		} while (intNumero >= 0);
		//Temos que testar se nenhum valor foi computado
		if (intContador>0)
			System.out.println("A M�dia de n�meros " + 
						"positivos digitados foi de " + 
							(intSoma/ intContador));
		sc.close();
	}

}
