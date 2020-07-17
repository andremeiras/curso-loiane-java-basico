package com.andremeiras.cursojava.loiane.aula36;

  public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("André Meira");
		contato.setEmail("andremeirati@gmail.com");
//		contato.setEndereco("Willibaldo Kayser");
//		contato.setTelefone("(41) 9 9700-6885");

//		criar objeto Endereco
		Endereco end = new Endereco();
		end.setNomeRua("Willibaldo Kayser");
		end.setNumero(308);
		end.setComplemento("-");
		end.setCep(81170590);
		end.setCidade("Curitiba");
		end.setEstado("Paraná");
		contato.setEndereco(end);

//		Relacionamento tem-um Telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("41");
		telefone.setNumero("9 9700-6885");

		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("41");
		telefone2.setNumero("3398-1685");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

//		contato.setTelefone(telefone);
		contato.setTelefones(telefones);

//		Teste saída no console
		System.out.println(contato.getNome());
		System.out.println(contato.getEmail());
//		System.out.println(contato.getTelefone());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}

		/*
		 * if (contato != null && contato.getTelefone() != null) {
		 * System.out.println(contato.getTelefone().getTipo() + ": (" +
		 * contato.getTelefone().getDdd() + ") " + contato.getTelefone().getNumero()); }
		 */

		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());

			}
		}

	}

}
