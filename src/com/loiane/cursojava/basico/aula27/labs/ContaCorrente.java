package com.loiane.cursojava.basico.aula27.labs;

public class ContaCorrente {

	int numero;
	double saldo;
	boolean especial = false;
	double limite;

	void sacar(double valor) {

		obterSaldoAtual();

		if (saldo > 0 && valor <= saldo) {
			this.saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso no valor de R$ " + valor);
			obterSaldoAtual();
		} else if (saldo + limite > 0 && valor <= saldo + limite) {
			this.saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso no valor de R$ " + valor);

			double limiteAtual = this.limite - valor;

			System.out.println("LIMITE UTILIZADO NO VALOR DE R$ " + valor);
			System.out.println("Limite atual: R$ " + limiteAtual);

			obterSaldoAtual();
		} else {
			System.out.println("Saldo insuficiente!");
			obterSaldoAtual();
		}
	}

	void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito no valor de R$ " + valor + " realizado com sucesso.");
		obterSaldoAtual();
	}

	void obterSaldoAtual() {
		System.out.println("Saldo atual: R$ " + this.saldo);
		System.out.println("Valor do limite: R$ " + this.limite);
		System.out.println("Valor total disponível para saque (incluindo o limite): R$ " + calcularValorDisponivel());
	}

	void setLimite(double valorLimite) {
		this.limite = valorLimite;
	}

	double calcularValorDisponivel() {
		double total = this.saldo + this.limite;
		return total;
	}

}
