package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Requerimiento1.Soldado;

class TestSoldado {
	
	private Soldado soldado1;
	
	@BeforeEach
	void setUp() throws Exception {
		soldado1 = new Soldado();
	
	}

	@AfterEach
	void tearDown() throws Exception {
		soldado1 = null;
	}
	
	//Test puedeDisparar
	@Test 
	public void puedeDisparar() {
		soldado1.setNumeroBalas(10);
		
		assertTrue(soldado1.puedeDisparar());
	}
	
	@Test 
	public void noPuedeDispararConCeroBalas() {
		soldado1.setNumeroBalas(0);
		
		assertFalse(soldado1.puedeDisparar());
	}
	
	@Test 
	public void noPuedeDispararConBalasNegativas() {
		soldado1.setNumeroBalas(-10);
		
		assertFalse(soldado1.puedeDisparar());
	}
		
	//Test disparar
	@Test
	public void disparaConBalas() {
		Soldado soldado2 = new Soldado();
		soldado1.setNumeroBalas(5);
		soldado1.disparar(soldado2);
		
		assertTrue(soldado2.isEstaMuerto());	
	}
	//Este método siempre va a dar como resultado que el soldado ya está muerto, ya que resta automáticamente
	//una bala al soldado1 y mata directamente al soldado2 sin tener en cuenta cuantas balas tiene inicialemetne
	//el soldado1
	@Test
	public void dispararSinBalas() {
		Soldado soldado2 = new Soldado();
		soldado1.setNumeroBalas(0);
		soldado1.disparar(soldado2);
		
		assertTrue(soldado2.isEstaMuerto());
		
	}

	
}
