package banco.aplicacao;

import banco.dominio.*;

import banco.dominio.conta.*;
import banco.dominio.pessoa.Cliente;
import banco.operacao.*;
public class Teste {

	public static void main(String[] args) {
		Cliente cliente_1 = new Cliente("123456789", "John", "2298765423");
		Cliente cliente_2 = new Cliente("123456789", "Paul", "2298765423");
		Conta conta_corrente = new ContaCorrente(cliente_1);
		Conta conta_poupanca = new ContaPoupanca(cliente_2);
		
		IOperador operador = new Operador();
		
		conta_corrente.depositar(1000);
		
		operador.realizarTransferencia(conta_corrente, conta_poupanca, 250);
		
		conta_corrente.imprimirExtrato();
		
		conta_poupanca.imprimirExtrato();
		
		

	}

}
