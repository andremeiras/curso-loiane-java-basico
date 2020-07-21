package com.loiane.cursojava.basico.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.print("Entre com um número decimal: ");
		try {
			double num = leNumero();
			System.out.println("Você digitou: " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace(); // SEMPRE, POR SEGURANÇA, JOGAR O PRINTSTACKTRACE EM LOG
		}

	}

	public static double leNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}
}
