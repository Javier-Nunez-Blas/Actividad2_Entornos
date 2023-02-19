package JUnit5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Jugador;


class JugadorTest extends Jugador{

	@Test
	public void testDorsal() {
		
		Jugador jugador = new Jugador();
		
		jugador.ponerDorsal(1);
		int resultadoObtenido = jugador.getDorsal();
		int resultadoEsperado = 1;
		assertEquals(resultadoObtenido, resultadoEsperado);
		
		
		jugador.ponerDorsal(5);
		int resultadoObtenido1 = jugador.getDorsal();
		int resultadoEsperado1 = 5;
		assertEquals(resultadoObtenido1, resultadoEsperado1);
		
		jugador.ponerDorsal(30);
		int resultadoObtenido2 = jugador.getDorsal();
		int resultadoEsperado2 = 30;
		assertEquals(resultadoObtenido2, resultadoEsperado2);
		
		jugador.ponerDorsal(0);
		int resultadoObtenido3 = jugador.getDorsal();
		int resultadoEsperado3 = -1;
		assertEquals(resultadoObtenido3, resultadoEsperado3);
		
		jugador.ponerDorsal(31);
		int resultadoObtenido4 = jugador.getDorsal();
		int resultadoEsperado4 = -1;
		assertEquals(resultadoObtenido4, resultadoEsperado4);
	}
	
	
	
	
	@Test
	public void testExpulsion() {
		
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasAmarillas(1);
		boolean resultadoObtenido = jugador.estaExpulsado();
		boolean resultadoEsperado = false;
		assertEquals(resultadoObtenido, resultadoEsperado);
		
		Jugador jugador1 = new Jugador();
		
		jugador1.setNumeroTarjetasAmarillas(2);
		boolean resultadoObtenido1 = jugador1.estaExpulsado();
		boolean resultadoEsperado1 = true;
		assertEquals(resultadoObtenido1, resultadoEsperado1);
		
		Jugador jugador2 = new Jugador();
		
		jugador2.setNumeroTarjetasRojas(0);
		boolean resultadoObtenido2 = jugador2.estaExpulsado();
		boolean resultadoEsperado2 = false;
		assertEquals(resultadoObtenido2, resultadoEsperado2);
		
		Jugador jugador3 = new Jugador();
		
		jugador3.setNumeroTarjetasRojas(1);
		boolean resultadoObtenido3= jugador3.estaExpulsado();
		boolean resultadoEsperado3 = true;
		assertEquals(resultadoObtenido3, resultadoEsperado3);
		
		
	}

}
