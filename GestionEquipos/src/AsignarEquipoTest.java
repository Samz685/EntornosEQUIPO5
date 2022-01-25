import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest {

	/*Asignar jugador que no exista. 
	 * Debe dar error
	*/
	@Test
	void testSetJugadornulo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador null*/
		Jugador jugador = null;
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
		fail("El jugador no existe");
	}
	
	
	/*Asignar jugador que exista y tenga todos los campos v�lidos*/
	@Test
	void testSetJugador() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Espa�ol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	
	/*Asignar jugador que exista, pero su nombre sea inv�lido*/
	
	@Test
	void testSetJugadorNomInv() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "as";
		int edadValida = 20;
		String idiomaValido = "Espa�ol";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	
	/*Asignar jugador que exista, pero no tenga nombre */
	@Test
	void testSetJugadorSinNom() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		int edadValida = 20;
		String idiomaValido = "Espa�ol";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	
	//Asignar jugador que exista, pero su edad sea inv�lida
	
	@Test
	void testSetJugadorEdadInv() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 200;
		String idiomaValido = "Espa�ol";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	
	//Asignar jugador que exista, pero no tenga edad
	@Test
	void testSetJugadorSinEdad() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		String idiomaValido = "Espa�ol";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	
	}
	
	//Asignar jugador que exista, pero su idioma sea inv�lido
	
	@Test
	void testSetJugadorIdiomInv() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Japon�s";
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	
	//Asignar jugador que exista, pero no tenga idioma
	@Test
	void testSetJugadorNoIdiom() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
}