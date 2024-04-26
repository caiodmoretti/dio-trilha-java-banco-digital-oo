package banco.dominio.pessoa;

public class Funcionario extends Pessoa {
	
	protected String cargo;

	public Funcionario(String cpf, String nome, String telefone, String cargo) {
		super(cpf, nome, telefone);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


}
