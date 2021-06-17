package com.loiane.cursojava.basico.aula27.labs;

public class TestContaCorrente {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setLimite(200);
		
		cc.depositar(500);
		cc.calcularValorDisponivel();
		
		cc.sacar(201);
		cc.calcularValorDisponivel();
	}

}
