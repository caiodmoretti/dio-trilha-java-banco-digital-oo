package banco.dominio.conta;

import banco.dominio.IConta;
import banco.dominio.pessoa.Cliente;

public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;
	private static int AGENCIA_PADRAO = 1;
	
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO++;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if(this.saldo < valor) {
			throw new IllegalArgumentException("Saldo insuficiente para saque.");
		}
		this.saldo = this.saldo - valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo +  valor;
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Saldo da conta: "+this.saldo);
		
	}

	public static int getSEQUENCIAL() {
		return SEQUENCIAL;
	}

	public static void setSEQUENCIAL(int sEQUENCIAL) {
		SEQUENCIAL = sEQUENCIAL;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static int getAgenciaPadrao() {
		return AGENCIA_PADRAO;
	}

}
