package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExemplosTiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aqui estamos fazendo uma soma
		int intSoma = 5 + 2;
		System.out.println("Soma: " + intSoma);
		//Aqui estamos fazendo uma subtra��o
		int intSubtracao = 5 - 2;
		System.out.println("Subtra��o: " + intSubtracao);
		//Aqui estamos fazendo uma multiplica��o
		int intMultiplicacao = 3 * 2;
		System.out.println("Multiplica��o: " + intMultiplicacao);
		//Aqui estamos fazendo uma divis�o inteira (nesse caso temos 2 inteiros)
		int intDivisao = 3 / 2;
		System.out.println("Divis�o Inteira: " + intDivisao);
		//Aqui estamos fazendo uma divis�o com ponto flutuante.
		double dblDivisao = 3.00 / 2.00;
		System.out.println("Divis�o: " + dblDivisao);
		//Aqui estamos fazendo o resto de uma divis�o
		int intResto = 3 % 2;
		System.out.println("Resto: " + intResto);
		//Usando somente o print (n�o o println)
		System.out.print("Mostrando um valor");
		System.out.println("Outro valor");
		//Utilizando entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		//Nesse ponto iremos solicitar ao usu�rio a entrada de dados
		String strNome = sc.nextLine();
		System.out.println("Ol� " + strNome);		
	}

}
