package com.loiane.cursojava.basico.aula27;

public class TestCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é: " + autonomia + "km");
		System.out.println("A autonomia do carro é: " + van.obterAutonomia() + "km");
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Para andar 10 KM são necessários " + qtdCombustivel10 + " litros de combustível");
		System.out.println("Para andar 15 KM são necessários " + qtdCombustivel15 + " litros de combustível");
		
	}

}
