package com.loiane.cursojava.basico.aula41;

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

	@Override
	public String obterEtiquetaEndereco() {
		String newEndereco = "Endere�o do aluno: ";
		newEndereco += super.getEndereco();

		return newEndereco;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("IMPRIMINDO ENDERE�O DO ALUNO");
		System.out.println(this.obterEtiquetaEndereco());
	}

}
