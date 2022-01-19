import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Syzer
 *
 */
class JugadorTest {

	/**
	 * TC01 - Nombre (Numero Caracteres Negativo)
	 */
	@Test
	void testSetNombreJugador1() {
		Jugador jugador = new Jugador();
		String nombre= "-100";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Carácter no permitido");
	}
	

	/**
	 * TC02 - Nombre (Numero carácteres < 4)
	 */
	@Test
	void testSetNombreJugador2() {
		Jugador jugador = new Jugador();
		String nombre= "Pep";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Carácteres introducidos insuficientes");
	}

	/**
	 * TC03 - Nombre (Numero carácteres minimo)
	 */
	@Test
	void testSetNombreJugador3() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
		fail("Carácteres introducidos insuficientes");
	}
	
	/**
	 * TC04 - Nombre (Numero carácteres maximo)
	 */
	@Test
	void testSetNombreJugador4() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
		fail("Carácteres introducidos insuficientes");
	}
	
	/**
	 * TC05 - Nombre (Numero carácteres >20)
	 */
	@Test
	void testSetNombreJugador5() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepeP";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Excedido número carácteres permitido");
	}
	
	/**
	 * TC05 - TC07 - Nombre (Caracteres Numericos)
	 */
	@Test
	void testSetNombreJugador6() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe34";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Carácteres númericos no permitidos");
	}
	/**
	 * TC05 - TC18 - Nombre (Null)
	 */
	@Test
	void testSetNombreJugador7() {
		Jugador jugador = new Jugador();
		String nombre= " ";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Campo nombre vacio");
	}
	
	/**
	 * TC08 - Edad (Caracter)
	 */
	@Test
	void testSetEdad8() {
		Jugador jugador = new Jugador();
		int edad= "Pe";
		jugador.setEdad(edad);
		assertEquals(0, jugador.getEdad());
		
		fail("Carácter no válido");
	}
	
	/**
	 * TC11 - Edad (Numero Negativo)
	 */
	@Test
	void testSetEdad9() {
		Jugador jugador = new Jugador();
		int edad= 10;
		jugador.setEdad(edad);
		assertEquals(0, jugador.getEdad());
		
		fail("Números negativos no permitidos");
	}
	/**
	 * TC09 - Edad (Menor edad)
	 */
	@Test
	void testSetEdad10() {
		Jugador jugador = new Jugador();
		int edad= 17;
		jugador.setEdad(edad);
		assertEquals(0, jugador.getEdad());
		
		fail("Menor de edad no permitido");
	}
}
