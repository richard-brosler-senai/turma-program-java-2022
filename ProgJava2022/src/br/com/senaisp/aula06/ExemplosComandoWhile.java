package br.com.senaisp.aula06;

public class ExemplosComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValor = 10;
		while (intValor > 0){
			if (intValor % 2 == 0)
				System.out.println("O n�mero " + intValor + " � par");
			else 
				System.out.println("O n�mero " + intValor + " � impar");
			intValor--;
		}
	}
}
