package co.krakedev.artesanal.testNegocio;

import co.krakedev.artesanal.Maquina;
import co.krakedev.artesanal.Negocio;

public class TestNegocio {

	public static void main(String[] args) {
		Maquina nueva= new Maquina("Cerveza Club", "Cerveza fria", 0.02, 8000, "005");
		
		Negocio n1= new Negocio("Mi Negocio", nueva);
		
		System.out.println("Nombre: "+ n1.getNombre());
		System.out.println("Maquina: "+n1.getMaquinaA());
		
		Maquina m1= n1.getMaquinaA();
		double capacidad =m1.getCapacidadMaxima();
		
	}

}
