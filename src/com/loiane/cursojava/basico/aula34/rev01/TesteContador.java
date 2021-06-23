package com.loiane.cursojava.basico.aula34.rev01;

public class TesteContador {

	public static void main(String[] args) {

		System.out.println(Contador.mostrarValorAtual());
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		System.out.println(Contador.mostrarValorAtual());

		Contador.decrementar();
		Contador.decrementar();
		Contador.decrementar();
		Contador.decrementar();
		Contador.decrementar();
		System.out.println(Contador.mostrarValorAtual());

		Contador.zerar();
		System.out.println(Contador.mostrarValorAtual());
		Contador.incrementar();
		Contador.decrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		System.out.println(Contador.mostrarValorAtual());
		Contador.zerar();
		System.out.println(Contador.mostrarValorAtual());
		Contador.incrementar();
		System.out.println(Contador.mostrarValorAtual());
		System.out.println(Contador.mostrarValorAtual());
		System.out.println(Contador.mostrarValorAtual());

	}
}
