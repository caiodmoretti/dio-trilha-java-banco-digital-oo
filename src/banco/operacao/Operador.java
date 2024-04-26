package banco.operacao;

import banco.dominio.IConta;

public class Operador implements IOperador {

	@Override
	public void realizarTransferencia(IConta origem, IConta destino, double valor) {
		if(origem.getSaldo() < valor) {
			throw new IllegalArgumentException("Saldo não é suficiente para transferência.");
		}
		origem.sacar(valor);
		destino.depositar(valor);	
	}

}
