package com.loiane.cursojava.basico.aula34.labs;

public class Contador {

	private static int cont;

	public static void incrementar() {
		cont++;
		obterValor();
	}

	public static void decrementar() {
		cont--;
		obterValor();
	}

	public static void zerar() {
		cont = 0;
		obterValor();
	}

	public static int obterValor() {
		System.out.println(cont);
		return cont;
	}

}
