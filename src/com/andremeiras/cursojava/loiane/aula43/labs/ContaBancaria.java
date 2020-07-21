package com.andremeiras.cursojava.loiane.aula43.labs;

public class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if ((saldo - valor) >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public void depositar(double valor) {
		this.saldo += valor;

	}

	@Override
	public String toString() {
		
		String s = "\n\n"; 
		s += "ContaBancaria";
		s += "\nnomeCliente: " + nomeCliente;
		s += "\nnumConta: " + numConta;
		s += "\nsaldo: " + saldo;
		s += "\n";
		
		return s;
		
	}

}
