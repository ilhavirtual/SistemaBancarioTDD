import static org.junit.Assert.*;

import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void deveAtualizarSaldoAposSaque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1000.0);
		cc.sacar(200.0);
		
		assertEquals(800.0, cc.getSaldo(), 0);
	}
	
	@Test
	public void deveAtualizarSaldoAposDeposito(){
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1000.0);
		cc.depositar(200.0);
		
		assertEquals(1200.0, cc.getSaldo(), 0);
	}

	@Test
	public void deveInicializarNumeroDaContaEDaAgenciaAoCriar(){
		ContaCorrente cc = new ContaCorrente("1235-6", "234-7");
		
		assertEquals("1235-6", cc.getNumeroDaConta());
		assertEquals("234-7", cc.getNumeroDaAgencia());
	}
	
	@Test
	public void deveAlterarNumeroDaContaAoSetar(){
		ContaCorrente cc = new ContaCorrente();
		cc.setNumeroDaConta("1235-6");
		
		assertEquals("1235-6", cc.getNumeroDaConta());
	}
	
	@Test
	public void deveInicializarContaComNumerosECliente(){
		Cliente cliente = new Cliente("jose");
		ContaCorrente cc = new ContaCorrente("1235-6", "345-8", cliente);
		cc.setNumeroDaConta("1235-6");
		
		assertEquals("1235-6", cc.getNumeroDaConta());
		assertEquals("345-8", cc.getNumeroDaAgencia());
		assertEquals("jose", cc.getCliente().getNome());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
