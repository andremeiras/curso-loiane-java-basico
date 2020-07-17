package com.andremeiras.cursojava.loiane.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[3];

		System.out.print("Nome da agenda: ");
		agenda.setNome(sc.nextLine());

		for (int i = 0; i < 3; i++) {
			Contato c = new Contato();
			String nome;
			String telefone;
			String email;

			System.out.print("Nome do contato " + (i+1) + ": ");
			nome = sc.nextLine();
			c.setNome(nome);

			System.out.print("Telefone: ");
			telefone = sc.nextLine();
			c.setTelefone(telefone);

			System.out.print("E-mail: ");
			email = sc.nextLine();
			c.setEmail(email);

			contatos[i] = c;

		}

		agenda.setContatos(contatos);

		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}
	}
}
