package co.krakedev.artesanal.test;

import co.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {

		boolean resultado;

		Maquina rubia = new Maquina("Pilsener", "Cerveza fria", 0.02, 8000, "001");

		System.out.println("===Estado Inicial===");

		rubia.imprimir();

		System.out.println("===Recarga 1===");

		resultado = rubia.recargarCerveza(3000);

		System.out.println("¿Se recargo correctamente? " + resultado);

		rubia.imprimir();

		System.out.println("===Recarga 2===");

		resultado = rubia.recargarCerveza(2000);

		System.out.println("¿Se recargo correctamente? " + resultado);

		rubia.imprimir();
		System.out.println("===Recarga 3===");

		resultado = rubia.recargarCerveza(2900);

		System.out.println("¿Se recargo correctamente? " + resultado);

		rubia.imprimir();

	}

}
