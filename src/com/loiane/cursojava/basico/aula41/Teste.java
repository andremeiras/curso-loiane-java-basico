package com.loiane.cursojava.basico.aula41;

import com.loiane.cursojava.basico.aula41.Aluno;
import com.loiane.cursojava.basico.aula41.Pessoa;
import com.loiane.cursojava.basico.aula41.Professor;

public class Teste {

	public static void main(String[] args) {

//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		aluno.setEndereco("Olá endereço do aluno");
		professor.setEndereco("Olá endereço do professor");

		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
