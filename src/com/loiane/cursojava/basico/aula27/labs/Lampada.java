package com.loiane.cursojava.basico.aula27.labs;

public class Lampada {

	boolean ligada = false;

	void ligar() {
		ligada = true;
		System.out.println("A lampada está acesa!");
	}
	
	void desligar() {
		ligada = false;
		System.out.println("A lampada está apagada!");
	}

}
