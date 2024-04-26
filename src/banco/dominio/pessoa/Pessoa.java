package banco.dominio.pessoa;

import banco.dominio.IPessoa;

public abstract class Pessoa implements IPessoa {

	protected String cpf;
	protected String nome;
	protected String telefone;
	
	public Pessoa(String cpf, String nome, String telefone) {

		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
