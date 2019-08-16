package br.ce.jhenck.suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.jhenck.core.DriverFactory;
import br.ce.jhenck.pages.LoginPage;
import br.ce.jhenck.tests.ContaTest;
import br.ce.jhenck.tests.MovimentacaoTest;
import br.ce.jhenck.tests.RemoverMovimentacaoContaTest;
import br.ce.jhenck.tests.ResumoTest;
import br.ce.jhenck.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void reset(){
		page.acessarTelaInicial();
		
		page.setEmail("jch@jch.com");
		page.setSenha("1234");
		page.entrar();
		
		page.resetar();
		
		DriverFactory.killDriver();
	}
}
