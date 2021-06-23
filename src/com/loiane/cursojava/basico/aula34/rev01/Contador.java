package com.loiane.cursojava.basico.aula34.rev01;

public class Contador {

	private static int contadorInstancias;

	// cada vez que a classe for chamada adicionar ao contador
	public static void incrementar() {
		contadorInstancias++;
	}

	// diminuir o contador
	public static void decrementar() {
		contadorInstancias--;
	}
	
	// zerar o contador de instâncias
	public static void zerar() {
		contadorInstancias = 0;

	}

	// mostrar a quantidade de vezes que a classe foi instanciada
	public static String mostrarValorAtual() {
		String result;

		result = "A classe foi instanciada " + contadorInstancias + " vezes.";

		return result;
	}
}
