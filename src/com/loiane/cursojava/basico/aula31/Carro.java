package com.loiane.cursojava.basico.aula31;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {

	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.out.println("Construtor com 2 parâmetros");
	}

	
	private double divideKMPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km.");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia() foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		return this.divideKMPorConsumoCombustivel(km);
	}
}
