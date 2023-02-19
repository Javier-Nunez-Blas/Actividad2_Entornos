package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Soldado;



class SoldadoTest extends Soldado{

	@Test
	 public void testPuedeDisparar() {
		
		setNumeroBalas(1);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = puedeDisparar();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		setNumeroBalas(0);
		boolean resultadoEsperado1 = true;
		boolean resultadoObtenido1 = puedeDisparar();
		assertNotEquals(resultadoEsperado1, resultadoObtenido1);
		
		setNumeroBalas(-1);
		boolean resultadoEsperado2 = true;
		boolean resultadoObtenido2 = puedeDisparar();
		assertNotEquals(resultadoEsperado2, resultadoObtenido2);
	}
		

	@Test
	 public void testDisparar() {
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(2);
		soldado1.setEstaMuerto(false);
		disparar(soldado1);
		
		boolean resultadoEsperado = soldado1.getEstaMuerto();
		boolean resultadoObtenido = true;
		assertEquals(resultadoEsperado, resultadoObtenido);
	
	}
	

}
