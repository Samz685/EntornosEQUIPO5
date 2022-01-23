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
		
		fail("Car�cter no permitido");
	}
	

	/**
	 * TC02 - Nombre (Numero car�cteres < 4)
	 */
	@Test
	void testSetNombreJugador2() {
		Jugador jugador = new Jugador();
		String nombre= "Pep";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Car�cteres introducidos insuficientes");
	}

	/**
	 * TC03 - Nombre (Numero car�cteres minimo)
	 */
	@Test
	void testSetNombreJugador3() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
		fail("Car�cteres introducidos insuficientes");
	}
	
	/**
	 * TC04 - Nombre (Numero car�cteres maximo)
	 */
	@Test
	void testSetNombreJugador4() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
		fail("Car�cteres introducidos insuficientes");
	}
	
	/**
	 * TC05 - Nombre (Numero car�cteres >20)
	 */
	@Test
	void testSetNombreJugador5() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepeP";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Excedido n�mero car�cteres permitido");
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
		
		fail("Car�cteres n�mericos no permitidos");
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
		int edad= 0;
		jugador.setEdad(0);
		assertEquals("pe", jugador.getEdad());
		
		fail("Car�cter no v�lido");
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
		
		fail("N�meros negativos no permitidos");
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

	/**
	 * TC10 - Edad (Mayor edad). Mediante esta prueba el test debe ser válido, al introducir un número mayor o igual a 18
	 */
	@Test
	void testSetEdad11() {
		Jugador jug= new Jugador();
		int edad= 20;
		jug.setEdad(edad);
		assertEquals(edad, jug.getEdad());
		
		
		fail("Todavia no se ha modificado el Getter.");
	}
		
		/**
		 * TC20 - Edad (Null). Mediante esta prueba el test NO debe ser válido, al introducir un carácter vacio en un campo numérico.
		 */
		@Test
		void testSetEdad12() {
			Jugador jug= new Jugador();
			int edad= 0;
			jug.setEdad(0);
			assertEquals(" ", jug.getEdad());
			
			
			fail("Carácter introducido no válido, el caracter introducido debe ser numérico, y mayor a 18");
	}

	/**
	 * TC13 - Idioma (Español). Mediante esta prueba, introduciremos un idioma válido. El test deberá ser válido
	 */
	@Test
	void testSetIdioma13() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Español";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
		
		fail("Todavia no se ha modificado el Getter.");
	}
	
	/**
	 * TC14 - Idioma (Alemán). Mediante esta prueba, introduciremos un idioma válido. El test deberá ser válido
	 */
	@Test
	void testSetIdioma14() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Alemán";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
		
		fail("Todavia no se ha modificado el Getter.");
	}
	
	/**
	 * TC15 - Idioma (Francés). Mediante esta prueba, introduciremos un idioma válido. El test deberá ser válido
	 */
	@Test
	void testSetIdioma15() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Francés";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
		
		fail("Todavia no se ha modificado el Getter.");
	}
	
	/**
	 * TC16 - Idioma (null). Mediante esta prueba, no introduciremos un idioma . El test no deberá ser válido
	 */
	@Test
	void testSetIdioma16() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= " ";
		 jug.setIdioma(idioma);
		 assertEquals(null, jug.getIdioma());
		
		fail("Carácter introducido insuficiente");
	}
	/**
	 * TC17 - Idioma (Español). Mediante esta prueba, introduciremos un idioma distinto de los disponibles. El test deberá ser no válido
	 */
	@Test
	void testSetIdioma17() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Chino";
		 jug.setIdioma(idioma);
		 assertEquals(null, jug.getIdioma());
		
		fail("El idioma introducido no es correcto.");
	}
}
