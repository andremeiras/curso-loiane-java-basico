package com.loiane.cursojava.basico.aula26;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	// método sem retorno
	void exibirAutonomia() {
		// utilizando o método que faz o cálculo da autonomia
		System.out.println("A autonomia do carro é: " + obterAutonomia() + " km");
	}
	
	// criando método com retorno
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

}
