
public class ContaCorrente {

	private Cliente cliente;
	private String numeroDaAgencia;
	private String numeroDaConta;
	private double saldo;
	private double limite = 100.0;
	private boolean premiada = true;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String numeroDaConta, String numeroDaAgencia) {
		this.numeroDaConta = numeroDaConta;
		this.numeroDaAgencia = numeroDaAgencia;
	}
	
	public ContaCorrente(String numeroDaConta, String numeroDaAgencia, Cliente cliente) {
		this(numeroDaConta, numeroDaAgencia);
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numero) {
		numeroDaConta = numero;
		
	}

	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
	
	
	
	
	
	
	
	
	
}
