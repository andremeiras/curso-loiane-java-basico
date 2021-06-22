package com.loiane.cursojava.basico.aula25;
// Curso Java Básico - Aula 25
// Título: Orientação a Objetos: Classes e métodos simples

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
}
