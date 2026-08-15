package co.krakedev.artesanal.test.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.krakedev.artesanal.Cliente;
import co.krakedev.artesanal.Negocio;


public class TestAsignarCodigoClientes {
	
	@Test
	
	public void asignarCodigo() {
		Negocio barDeMoe= new Negocio();
		Cliente mario= new Cliente("Mario", "1711979805");
		Cliente andres= new Cliente("Andres", "1711111111");
		barDeMoe.asignarCodigoCliente(mario);
		barDeMoe.asignarCodigoCliente(andres);
		
		assertEquals(100, mario.getCodigo());
		assertEquals(101, andres.getCodigo());
		
	}

}
