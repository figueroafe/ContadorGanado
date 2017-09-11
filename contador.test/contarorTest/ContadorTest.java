package contarorTest;

import contador.Contador;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ContadorTest {

	Contador c;

	@Before
	public void setUp() {
		c = new Contador();
	}

	@Test
	public void queInicieEnCero() {
		Contador c = new Contador();
		Assert.assertEquals(0, c.mostrar());
	}

	@Test
	public void queCuenteEnUno() {
		Contador c = new Contador();
		c.contar();
		Assert.assertEquals(1, c.mostrar());
	}

	@Test
	public void queReinicieEnCero() {
		Contador c = new Contador();
		c.contar();
		c.reiniciar();
		Assert.assertEquals(0, c.mostrar());
	}

}
