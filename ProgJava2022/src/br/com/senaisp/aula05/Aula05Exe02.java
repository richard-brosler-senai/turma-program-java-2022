package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Verifica��o de valores divisiveis por 3 e 5");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor a ser verificado:");
		int intVlr = sc.nextInt();
		if ( intVlr % 3 == 0 && intVlr % 5 == 0)
			System.out.println("O n�mero digitado � Divisivel por 3 e 5");
		else if (intVlr % 3 == 0)
			System.out.println("O n�mero digitado � divisivel por 3");
		else if (intVlr % 5 == 0)
			System.out.println("O n�mero digitado � divisivel 5");
		else
			System.out.println("O n�mero digitado n�o � divisivel por 3 ou 5");

	}

}
