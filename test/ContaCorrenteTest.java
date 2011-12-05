import static org.junit.Assert.*;

import org.junit.Test;


public class ContaCorrenteTest {

	@Test
	public void deveAtualizarSaldoAposSaque() {
		ContaCorrente cc = new ContaCorrente();
		cc.sacar(200.0);
		
		assertEquals(800.0, cc.getSaldo(), 0);
	}
	
	@Test
	public void deveAtualizarSaldoAposDeposito(){
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200.0);
		
		assertEquals(1200.0, cc.getSaldo(), 0);
	}

	
	
	
	
	
	
	
	
	
	
}
