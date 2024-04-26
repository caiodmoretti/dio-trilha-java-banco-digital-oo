package banco.operacao;

import banco.dominio.IConta;

public interface IOperador {
	void realizarTransferencia(IConta origem, IConta destino, double valor);

}
