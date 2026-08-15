package co.krakedev.artesanal.test;

import co.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		
		Maquina rubia= new Maquina("Pilsener", "Cerveza fria",0.02, 8000, "001");
		rubia.imprimir();
		
		rubia.llenarMaquina();
		
		rubia.imprimir();
		
		Maquina negra = new Maquina("Club", "Cerveza buena", 0.03, "002");
		negra.imprimir();
		
		negra.llenarMaquina();
		
		negra.imprimir();
	}

}
