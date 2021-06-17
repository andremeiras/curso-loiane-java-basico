package com.loiane.cursojava.basico.aula27;

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
	
	// criando método com retorno do tipo double e com passagem de parâmetro que será utilizado para calcular o consumo com base na km
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}

}
