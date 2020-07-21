package com.loiane.cursojava.basico.aula50;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (Exception e) {
				System.out.println("Usar o Log4J para gravar logs ao invés de exibir uma String.");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
