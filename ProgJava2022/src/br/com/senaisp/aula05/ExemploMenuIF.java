package br.com.senaisp.aula05;

import java.util.Scanner;

public class ExemploMenuIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Menu principal");
		System.out.println("1 - Calcular Soma");
		System.out.println("2 - Calcular Subtra��o");
		System.out.println("3 - Calcular Multiplica��o");
		System.out.println("4 - Calcular Divis�o");
		System.out.println("Digite sua op��o:");
		Scanner sc = new Scanner(System.in);
		int intVlr1, intVlr2, intRes = 0;
		int intOpcao = sc.nextInt();

		System.out.println("Digite o primeiro valor:");
		intVlr1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		intVlr2 = sc.nextInt();

		if (intOpcao == 1) {
			intRes = intVlr1 + intVlr2;
		} else if (intOpcao == 2)
			intRes = intVlr1 - intVlr2;
		else if (intOpcao == 3)
			intRes = intVlr1 * intVlr2;
		else if (intOpcao == 4) {
			if (intVlr2 == 0)
				System.out.println("N�o � poss�vel dividir por zero");
			else
				intRes = intVlr1 / intVlr2;
		} else
			System.out.println("Voc� digitou uma opc��o inv�lida!");

		System.out.println("O resultado ser�: " + intRes);

	}

}
