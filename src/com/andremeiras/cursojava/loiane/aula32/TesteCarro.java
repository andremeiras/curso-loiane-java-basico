package com.andremeiras.cursojava.loiane.aula32;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		van.setCapCombustivel(100);
		van.setNumPassageiros(10);
		
		van.toString();
	}
}
