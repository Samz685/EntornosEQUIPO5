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
		
		fail("Carï¿½cter no permitido");
	}
	

	/**
	 * TC02 - Nombre (Numero carï¿½cteres < 4)
	 */
	@Test
	void testSetNombreJugador2() {
		Jugador jugador = new Jugador();
		String nombre= "Pep";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Carï¿½cteres introducidos insuficientes");
	}

	/**
	 * TC03 - Nombre (Numero carï¿½cteres minimo)
	 */
	@Test
	void testSetNombreJugador3() {
		Jugador jugador = new Jugador();
		String nombre= "Pepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
		fail("Carï¿½cteres introducidos insuficientes");
	}
	
	/**
	 * TC04 - Nombre (Numero caracteres maximo)
	 */
	@Test
	void testSetNombreJugador4() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepe";
		jugador.setNombreJugador(nombre);
		assertEquals(nombre, jugador.getNombreJugador());
		
		fail("Carï¿½cteres introducidos insuficientes");
	}
	
	/**
	 * TC05 - Nombre (Numero caracteres >20)
	 */
	@Test
	void testSetNombreJugador5() {
		Jugador jugador = new Jugador();
		String nombre= "PepePepePepePepePepeP";
		jugador.setNombreJugador(nombre);
		assertEquals(null, jugador.getNombreJugador());
		
		fail("Excedido numero caracteres permitido");
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
		
		fail("caracteres numericos no permitidos");
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
		
		fail("Caracter no valido");
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
		
		fail("Numeros negativos no permitidos");
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
	 * TC10 - Edad (Mayor edad). Mediante esta prueba el test debe ser valido, al introducir un numero mayor o igual a 18
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
		 * TC20 - Edad (Null). Mediante esta prueba el test NO debe ser valido, al introducir un caracter vacio en un campo numerico.
		 */
		@Test
		void testSetEdad12() {
			Jugador jug= new Jugador();
			int edad= 0;
			jug.setEdad(0);
			assertEquals(" ", jug.getEdad());
			
			
			fail("Caracter introducido no valido, el caracter introducido debe ser numerico, y mayor a 18");
	}

	/**
	 * TC13 - Idioma (Español). Mediante esta prueba, introduciremos un idioma valido. El test debera ser valido
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
	 * TC14 - Idioma (Aleman). Mediante esta prueba, introduciremos un idioma valido. El test debera ser valido
	 */
	@Test
	void testSetIdioma14() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Aleman";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
		
		fail("Todavia no se ha modificado el Getter.");
	}
	
	/**
	 * TC15 - Idioma (FrancÃ©s). Mediante esta prueba, introduciremos un idioma valido. El test debera ser vÃ¡lido
	 */
	@Test
	void testSetIdioma15() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= "Frances";
		 jug.setIdioma(idioma);
		 assertEquals(idioma, jug.getIdioma());
		
		fail("Todavia no se ha modificado el Getter.");
	}
	
	/**
	 * TC16 - Idioma (null). Mediante esta prueba, no introduciremos un idioma . El test no debera ser valido
	 */
	@Test
	void testSetIdioma16() {
		
		 Jugador jug= new Jugador();
		 
		 String idioma= " ";
		 jug.setIdioma(idioma);
		 assertEquals(null, jug.getIdioma());
		
		fail("Caracter introducido insuficiente");
	}
	/**
	 * TC17 - Idioma (Español). Mediante esta prueba, introduciremos un idioma distinto de los disponibles. El test debera ser no valido
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
