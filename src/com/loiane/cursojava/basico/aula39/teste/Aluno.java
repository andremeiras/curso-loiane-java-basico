package com.loiane.cursojava.basico.aula39.teste;

import com.loiane.cursojava.basico.aula39.Pessoa;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovacao() {
		return true;
	}

	public void verificarAcesso() {
		this.nomeVisibilidade = "asdfadfads";
		super.nomeVisibilidade = "234adswfads";
		
	}

}