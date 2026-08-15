package co.krakedev.artesanal.test.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import co.krakedev.artesanal.Maquina;

public class TestServirJUnit {

    @Test
    public void testServirCervezaExitoso() {
        // Preparación: Máquina con capacidad y cantidad actual de 8000 ml a $0.02 el ml
        Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02, 8000, "001");
        maquina.llenarMaquina(); // Asegura el estado inicial con 7800 ml disponibles

        // Ejecución: Servir 500 ml
        // Valor esperado a pagar: 500 * 0.02 = 10.0
        // Cantidad restante esperada: 8000 - 500 = 7500 ml
        double valorAPagar = maquina.servirCerveza(500);

        // Verificaciones
        assertEquals(10.0, valorAPagar, 0.0001);
        assertEquals(7300.0, maquina.getCantidadActual(), 0.0001);
    }

    @Test
    public void testServirCervezaTotalidadDisponible() {
        // Preparación: Máquina recargada con 1000 ml a $0.02 el ml
        Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02, 8000, "001");
        maquina.recargarCerveza(1000);

        // Ejecución: Servir exactamente los 1000 ml disponibles
        // Valor esperado a pagar: 1000 * 0.02 = 20.0
        // Cantidad restante esperada: 0 ml
        double valorAPagar = maquina.servirCerveza(1000);

        // Verificaciones
        assertEquals(20.0, valorAPagar, 0.0001);
        assertEquals(0.0, maquina.getCantidadActual(), 0.0001);
    }

    @Test
    public void testServirCervezaInsuficiente() {
        // Preparación: Máquina con solo 300 ml disponibles
        Maquina maquina = new Maquina("Pilsener", "Cerveza", 0.02, 8000, "001");
        maquina.recargarCerveza(300);

        // Ejecución: Intentar servir 500 ml (no hay suficiente)
        double valorAPagar = maquina.servirCerveza(500);

        // Verificaciones: No debe cobrar (0.0) y la cantidad actual debe mantenerse intacta (300 ml)
        assertEquals(0.0, valorAPagar, 0.0001);
        assertEquals(300.0, maquina.getCantidadActual(), 0.0001);
    }
}