package banco.dominio;

public interface IConta {
	void sacar(double valor);
	
	void depositar(double valor);
	
	void imprimirExtrato();
	
	double getSaldo();
}
