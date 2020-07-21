package com.andremeiras.cursojava.loiane.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));

			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por 0.");
				System.out.println("Após esta linha nada mais será executado pois estamos usando o System.exit(0)");
				System.exit(0); // ao executar esta linha, nem mesmo o bloco finally será executado.
			} catch (Throwable e) {
				System.out.println("Ocorreu um erro");
				System.exit(0);
			} finally {
				System.out.println("Este bloco não será executado pois no catch() foi utilizado o System.exit(0)");
			}
		}
	}
}
