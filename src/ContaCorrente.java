
public class ContaCorrente {

	Cliente cliente = new Cliente();
	String numeroDaAgencia;
	String numeroDaConta;
	private double saldo = 1000.0;
	double limite = 100.0;
	boolean premiada = true;
	
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}
}
