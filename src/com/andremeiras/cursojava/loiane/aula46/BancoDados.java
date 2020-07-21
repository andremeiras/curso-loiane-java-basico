package com.andremeiras.cursojava.loiane.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

	void abrirConexao();

	void fecharConexao();
}
