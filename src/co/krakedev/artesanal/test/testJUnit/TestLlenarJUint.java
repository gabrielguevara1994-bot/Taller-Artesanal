package co.krakedev.artesanal.test.testJUnit;

import co.krakedev.artesanal.Maquina;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestLlenarJUint {
	
	@Test
	
	public void testLlenarMaquina(){
		
		Maquina rubia= new Maquina("Pilsener", "Cerveza", 0.02, 8000, "001");
		rubia.llenarMaquina();
		
		assertEquals(7800, rubia.getCantidadActual(), 0.0001);
		
	}

}
