package br.com.senaisp.aula09;

public class Aula09Exe05a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intLinha = 1;
		int intColuna;
		while (intLinha < 10) {
			intColuna = 1;
			while (intColuna < 10) {
				if (intLinha == intColuna || intLinha + intColuna == 10)
					System.out.print(intLinha + "-" + intColuna + " ");
				else
					System.out.print("    ");
				intColuna++;
			}
			System.out.println();
			intLinha++;
		}
	}

}
