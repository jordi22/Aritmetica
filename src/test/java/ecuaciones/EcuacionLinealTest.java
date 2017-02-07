package ecuaciones;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import ecuacion.EcuacionLineal;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		assertThat(ecuacionLineal.operacionLineal(), is(0.0));
		// A partir de aquí, el código que comprueba que la solución es correcta
		
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		assertThat(ecuacionLineal.operacionLineal(), is(-1.0));

		// A partir de aquí, el código que comprueba que la solución es correcta
		
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		assertThat(ecuacionLineal.operacionLineal(), is(-0.5));

		// A partir de aquí, el código que comprueba que la solución es correcta
	}
	
	@Test
	public void xEsCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(0, 1); // x + 1 = 0
		assertThat(ecuacionLineal.operacionLineal(), is(-1.0));
		
	}
}
