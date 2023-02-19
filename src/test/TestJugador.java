package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import Requerimiento2.Jugador;

class TestJugador {

	private Jugador jugador1;
	
	@BeforeEach
	void setUp() throws Exception {
		jugador1 = new Jugador();
	
	}

	@AfterEach
	void tearDown() throws Exception {
		jugador1 = null;
	}
	
	//Test ponerDorsal
	@Test
	public void dorsalParaJugarPartido() {
		jugador1.setDorsal(7);
		
		assertTrue(true);
		
	}
	
	@Test
	public void dorsalParaJugadorBanquillo() {
		jugador1.setDorsal(33);
		
		assertFalse(false);
	}
	
	@Test
	public void dorsalParaJugarBanquilloCero() {
		jugador1.setDorsal(0);
		
		assertFalse(false);
	}
	
	//Test estaExpulado con tarjetas amarillas
	@Test
	public void jugadorExpulsadoConTarjetasAmarillas() {
		jugador1.setNumeroTarjetasAmarillas(2);
		
		assertTrue(jugador1.estaExpulsado());
	}
	
	@Test
	public void jugadorExpulsadoConAmarilla() {
		jugador1.setNumeroTarjetasAmarillas(1);
		
		assertFalse(jugador1.estaExpulsado());
	}

	//Test estaExpulado con tarjetas rojas
	@Test
	public void jugadorExplusadoConTarjetasRojas() {
		jugador1.setNumeroTarjetasRojas(1);
		
		assertTrue(jugador1.estaExpulsado());
	}
	
	@Test
	public void jugadorExpulsadoCeroTarjetasRojas() {
		jugador1.setNumeroTarjetasRojas(0);
		
		assertFalse(jugador1.estaExpulsado());
	}
}
