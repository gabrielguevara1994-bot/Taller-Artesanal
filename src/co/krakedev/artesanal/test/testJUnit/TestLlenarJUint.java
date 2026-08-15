package co.krakedev.artesanal.test.testJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import co.krakedev.artesanal.Maquina;

public class TestLlenarJUint {
	
	@Test
	
	public void testLlenarMaquina(){
		
		Maquina rubia= new Maquina("Pilsener", "Cerveza", 0.02, 8000);
		rubia.llenarMaquina();
		
		assertEquals(7999, rubia.getCantidadActual(), 0.0001);
	}

}
