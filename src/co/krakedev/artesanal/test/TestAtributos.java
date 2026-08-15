package co.krakedev.artesanal.test;

import co.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		
		Maquina rubia = new Maquina("Pilsener", "Cerveza rubia", 0.02);
		rubia.imprimir();
		
		rubia.setNombreCerveza("Golden Ale");
		rubia.setDescripcion("Cerveza con aroma mas intenso");
		rubia.imprimir();
		
	}
	
	

}
