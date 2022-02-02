import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *
 */

/**
 *
 * @author Bilal
 *
 */

class EquipoTest {

	/**
	 * TC01 - Nombre (Numero Caracteres Negativo).Introduciremos un n�mero  negativo en el campo de nombre, por lo
	 * .  que el test debe dar error.
	 */
	@Test
	void testSetNombreEquipo() {
		Equipo equ=new Equipo();
		String nombre="-100";
		equ.setNombreEquipo("-100");
		assertEquals(nombre,equ.getNombreEquipo(),"No se pueden introducir caracteres numericos para el nombre");


	}

	/**
	 * TC07 - Nombre (Numero Caracteres Num�ricos).Introduciremos un n�mero en el campo de nombre, por lo que el test
	 * debe dar error.
	 * .
	 */
	@Test
	void testSetNombreEquipo2() {
		Equipo equ=new Equipo();
		String nombre="20";
		equ.setNombreEquipo("20");
		assertEquals(nombre,equ.getNombreEquipo(),"No se pueden introducir caracteres n�mericos para el nombre");

	}

	/**
	 *
	 * @author Arturo
	 *
	 */

	/**
	 * TC02 - Nombre (Numero caracteres < 4) Introduciremos menos caracteres de los minimos necesarios en el campo nombre
	 * el test debe de dar error.
	 */
	@Test
	void testSetNombreEquipoMenorMinimo() {
		Equipo equipo = new Equipo();
		String nombre = "Equ";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo(),"El nombre tiene que ser mas largo de 4 caracteres");

	}

	/**
	 * TC03 - Nombre (Numero caracteres = 4) Introduciremos los caracteres minimos necesarios en el campo nombre
	 * el test debe de dar okey.
	 */
	@Test
	void testSetNombreEquipoMinimo() {
		Equipo equipo = new Equipo();
		String nombre = "equi";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}

	/**
	 * TC04 - Nombre (Numero caracteres = 20) Introduciremos el maximo numero de caracteres en el campo nombre
	 * el test debe de dar okey.
	 */
	@Test
	void testSetNombreEquipoMaximo() {
		Equipo equipo = new Equipo();
		String nombre = "Equipo de prueba car";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo());
	}

	/**
	 * TC05 - Nombre (Numero caracteres > 20) Introduciremos mas caracteres del maximo permitido en el campo nombre
	 * el test debe de dar error.
	 */
	@Test
	void testSetNombreEquipoMayorMaximo() {
		Equipo equipo = new Equipo();
		String nombre = "Equipo de prueba caracteres largos";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo(),"El nombre del equipo no puede tener mas de 20 caracteres");

	}

	/**
	 * TC18 - Nombre (Null) No introduciremos nada en el campo nombre, por lo que el test debe dar error.
	 */
	@Test
	void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String nombre = "";
		equipo.setNombreEquipo(nombre);
		assertEquals(nombre,equipo.getNombreEquipo(),"El nombre del equipo no puede estar vacio");

	}

	/**
	 * TC23 - Ranking (Numero negativo) Introduciremos un numero negativo en el campo de ranking,
	 * el test debe dar error.
	 */
	@Test
	void testSetRankingEquipoMenorNegativo() {
		Equipo equipo = new Equipo();
		int rank = -2;
		equipo.setRanking(rank);
		//assertEquals(null,equipo.getRanking(),"El ranking del equipo no puede ser negativo");
		assertNull(equipo.getRanking());

	}

	/**
	 * TC24 - Ranking (Caracter) Introduciremos un caracter en el campo de ranking,
	 * el test debe dar error.
	 */
	@Test
	void testSetRankingEquipoCaracter() {
		Equipo equipo = new Equipo();
		char rank = 'a';
		equipo.setRanking(rank);
		//assertEquals(null,equipo.getRanking(),"El ranking del equipo no puede contener caracteres");
		assertNull(equipo.getRanking());

	}

	/**
	 * TC25 - Ranking (Valor minimo) Introduciremos el valor minimo en el campo de ranking,
	 * el test debe dar okey.
	 */
	@Test
	void testSetRankingEquipoMinimo() {
		Equipo equipo = new Equipo();
		int rank = 0;
		equipo.setRanking(rank);
		assertEquals(rank,equipo.getRanking());
	}

	/**
	 * TC26 - Ranking (Valor maximo) Introduciremos el valor maximo en el campo de ranking,
	 * el test debe dar okey.
	 */
	@Test
	void testSetRankingEquipoMaximo() {
		Equipo equipo = new Equipo();
		int rank = 10;
		equipo.setRanking(rank);
		assertEquals(rank,equipo.getRanking());
	}

	/**
	 * TC27 - Ranking (Vacio) Dejaremos el campo de ranking vacio,
	 * el test debe dar error.
	 */
	@Test
	void testSetRankingEquipoVacio() {
		Equipo equipo = new Equipo();
		int rank= 0;
		equipo.setRanking(rank);
		//assertEquals(0,equipo.getRanking(),"El ranking del equipo no puede estar vacio");
		assertNull(equipo.getRanking());
	}

}