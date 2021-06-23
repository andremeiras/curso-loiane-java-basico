package com.loiane.cursojava.basico.aula34.rev01;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora.somar(2, 3);
		System.out.println("[+ ] \t- " + Calculadora.mostrarResultado());

		Calculadora.subtrair(10, 3);
		System.out.println("[- ] \t- " + Calculadora.mostrarResultado());

		Calculadora.multiplicar(5, 10);
		System.out.println("[x ] \t- " + Calculadora.mostrarResultado());

		Calculadora.dividir2Numeros(8, 2);
		System.out.println("[/ ] \t- " + Calculadora.mostrarResultado());

		Calculadora.elevarPotenciaN(3, 3);
		System.out.println("[n^] \t- " + Calculadora.mostrarResultado());

	}

}
