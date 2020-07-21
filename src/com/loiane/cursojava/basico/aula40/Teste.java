package com.loiane.cursojava.basico.aula40;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereco("Rua Pedro Zagonel, 308 - CIC");
		aluno.setEndereco("Avenida Silva Jardim, 700 - Agua Verde");
		professor.setEndereco("Marechal Floriano, 1001 - Centro");

		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

	}

}
