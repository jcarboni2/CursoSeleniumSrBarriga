package br.ce.jhenck.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.jhenck.core.BaseTest;
import br.ce.jhenck.pages.HomePage;
import br.ce.jhenck.pages.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
	}
}
