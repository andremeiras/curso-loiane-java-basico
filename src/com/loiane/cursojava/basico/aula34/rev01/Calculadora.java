package com.loiane.cursojava.basico.aula34.rev01;

/*
 * 2. Escreva  uma  classe  Calculadora  que  tenha  os  seguintes  métodos:  
 * somar,   subtrair,  multiplicar,  dividir  (dois  números),  elevar  à  
 * potência  n.   Desenvolva  um  programa  para  testar  essa  classe.  
 */
public class Calculadora {

	private static int n1;
	private static int n2;
	private static int result;

	public static void somar(int n1, int n2) {
		result = n1 + n2;
	}

	public static void subtrair(int n1, int n2) {
		result = n1 - n2;
	}

	public static void dividir2Numeros(int n1, int n2) {
		result = n1 / n2;
	}

	public static void elevarPotenciaN(int n, int p) {
		Math.pow(n, p);
	}

}