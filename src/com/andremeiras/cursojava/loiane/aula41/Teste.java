package com.andremeiras.cursojava.loiane.aula41;

import com.andremeiras.cursojava.loiane.aula41.Aluno;
import com.andremeiras.cursojava.loiane.aula41.Pessoa;
import com.andremeiras.cursojava.loiane.aula41.Professor;

public class Teste {

	public static void main(String[] args) {

//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		aluno.setEndereco("Ol� endere�o do aluno");
		professor.setEndereco("Ol� endere�o do professor");

		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
