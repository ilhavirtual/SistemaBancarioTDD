
public class ContaCorrente {

	private Cliente cliente = new Cliente();
	private String numeroDaAgencia;
	private String numeroDaConta;
	private double saldo = 1000.0;
	private double limite = 100.0;
	private boolean premiada = true;
	
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
