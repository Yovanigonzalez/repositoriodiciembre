package org.prueba.unitaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.servicio.junit.ServicioJunit;

/*
 * REGLAS UNITARIAS
 * 
 * 1.- HEREDAD DE LA CLSE TESTCASE
 * 2.- CREAR EL METODO TEST
 * 3.- TODOS LOS METODOS DEBEN DE LLEVAR LA ANOTACION @TEST
 * 4.- EL NOMBDE DE LOS METODOS DEBE EMPEZAR CON tesNameMethod
 * 
 * 
 */
class PruebaUnitaria {

	private ServicioJunit ServicioJunit;
	
	@Test
	public void test() {
		ServicioJunit = new ServicioJunit();
	}
	
	@Test
	public void testSalarioBono() {
		test();
		assertTrue(ServicioJunit.salarioBono(20000.0, 5000.0) == 25000.0);
	}
	
	@Test
	public void testSalarioPrestamo() {
		test();
		assertEquals(15000.0, ServicioJunit.salarioPrestamo(20000.0, 5000.0));
	}
	
	@Test
	public void testSalarioMes() {
		test();
		assertEquals(100000.0, ServicioJunit.salarioporMes(20000.0, 5));
	}

}
