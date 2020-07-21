package com.andremeiras.cursojava.loiane.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception");

			vetor[4] = 1;

			System.out.println("Esse texto não vai aparecer");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao tentar acessar um índice inexistente de um vetor");
		}

		System.out.println("Esse texto será impresso após a exception");
	}
}
