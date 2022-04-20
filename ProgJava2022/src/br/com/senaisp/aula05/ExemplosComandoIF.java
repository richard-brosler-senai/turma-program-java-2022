package br.com.senaisp.aula05;

public class ExemplosComandoIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intIdade = 45;
		// Uso do condicional IF sem blocos
		if (intIdade >= 18)
			System.out.println("Voc� � maior!");
		// Uso do condicional IF com bloco
		if (intIdade >= 60) {
			System.out.println("Voc� � adulto");
			System.out.println("Voc� � sexagen�rio");
		}
		// Uso do condicional IF sem blocos e do ELSE sem blocos
		if (intIdade >= 18 && intIdade <= 25)
			System.out.println("Voc� � um maior Joven!");
		else
			System.out.println("Voc� � menor ou maior de 25 anos!");
		// Uso do condicional IF com bloco e do ELSE com bloco
		if (intIdade >= 18 && intIdade <= 25) {
			System.out.println("Voc� � um maior Joven!");
		} else {
			System.out.println("Voc� � menor ou maior de 25 anos!");
		}
		int intValor;
		// Uso do condicional IF encadeado
		if (intIdade >= 18 && intIdade <= 25) {
			System.out.println("Voc� tem idade entre 18 e 25!");
			intValor = 10;
		} else if (intIdade >= 26 && intIdade <= 35) {
			System.out.println("Voc� tem idade entre 26 e 35!");
			intValor = 15;
		} else {
			System.out.println("Voc� tem idade menor que 18 ou maior que 35!");
			intValor = 20;
		}
		System.out.println("teste " + intValor);

		
	}

}
