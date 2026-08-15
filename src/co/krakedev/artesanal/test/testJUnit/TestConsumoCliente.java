package co.krakedev.artesanal.test.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.krakedev.artesanal.Cliente;
import co.krakedev.artesanal.Maquina;
import co.krakedev.artesanal.Negocio;

public class TestConsumoCliente {
	
	@Test
	public void probarConsumo() {
		
		Maquina maquinaA= new Maquina("Pilsener", "Rubia", 0.002, 8000, "006");
		Negocio barMoe= new Negocio("Cerveceria Moe", maquinaA);
		Cliente gabriel= new Cliente("Gabriel", "171111111");
		
		barMoe.cargarMaquinaA();
		barMoe.consumirCervezaMaquinaA(gabriel, 100);
		
		assertEquals(7700, maquinaA.getCantidadActual(), 0.001);
		assertEquals(0.2, gabriel.getTotalConsumido(), 0.001);
		
		barMoe.consumirCervezaMaquinaA(gabriel, 200);
		
		assertEquals(7500, maquinaA.getCantidadActual(), 0.001);
		assertEquals(0.6, gabriel.getTotalConsumido(), 0.001);
		
	}

}
