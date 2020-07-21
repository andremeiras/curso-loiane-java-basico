package com.andremeiras.cursojava.loiane.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception");

			vetor[4] = 1;

			System.out.println("Esse texto n�o vai aparecer");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao tentar acessar um �ndice inexistente de um vetor");
		}

		System.out.println("Esse texto ser� impresso ap�s a exception");
	}
}
