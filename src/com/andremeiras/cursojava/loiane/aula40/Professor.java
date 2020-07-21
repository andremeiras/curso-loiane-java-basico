package com.andremeiras.cursojava.loiane.aula40;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}

	@Override
	public String obterEtiquetaEndereco() {
		String newEndereco = "Endereço do professor: ";
		newEndereco += super.getEndereco();

		return newEndereco;
	}

}
