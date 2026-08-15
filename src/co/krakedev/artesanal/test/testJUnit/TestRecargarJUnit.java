package co.krakedev.artesanal.test.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import co.krakedev.artesanal.Maquina;
public class TestRecargarJUnit {
	
	@Test
	public void testRecargaExitosa() {
		
		Maquina rubia= new Maquina("Pilsener", "Cerveza", 0.02, 8000, "001");
		
		boolean resultado=rubia.recargarCerveza(3000);
		
		assertTrue(resultado);
		assertEquals(3000, rubia.getCantidadActual(), 0.0001);
	}

}
