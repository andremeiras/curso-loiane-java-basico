package com.loiane.cursojava.basico.aula43.labs;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** TESTE CONTA BANC�RIA ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta(12345);

		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);

		realizarSaque(contaSimples, 70);

		System.out.println(contaSimples);

		System.out.println("####");

		System.out.println("*** TESTE CONTA POUPAN�A ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupanca");
		contaPoupanca.setNumConta(100100);
		contaPoupanca.setDiaRendimento(20);

		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);

		realizarSaque(contaPoupanca, 70);

		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado. Novo saldo � de " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento. Novo saldo n�o calculado.");
		}
		
		System.out.println(contaPoupanca);

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso. Novo saldo: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "\nSaldo dispon�vel: " + conta.getSaldo());
		}
	}

}
