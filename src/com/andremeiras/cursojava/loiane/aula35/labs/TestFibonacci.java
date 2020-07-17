package com.andremeiras.cursojava.loiane.aula35.labs;

public class TestFibonacci {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {
			int fibonacci = CalculadoraFibonacci.fibonacci(i);
			System.out.print(fibonacci + " ");
		}

	}

}
