package edd;

import org.junit.*;

public class TestFecha {

	private Fecha fechaa = new Fecha(7,10,2035);
	private Fecha fechab = new Fecha(33,10,2035);
	private Fecha fechac = new Fecha(0,10,2035);
	private Fecha fechad = new Fecha(30,2,2035);
	private Fecha fechae = new Fecha(7,0,2035);
	private Fecha fechaf = new Fecha(7,13,2035);
	private Fecha fechag = new Fecha(7,10,-23);
	private Fecha fechah = new Fecha(29,2,400);
	private Fecha fechai = new Fecha(29,2,399);

	@Before
	public void setUp() {
	}

	@Test
	public void testFecha() {
		org.junit.Assert.assertTrue(fechaa.valida());
		org.junit.Assert.assertFalse(fechab.valida());
		org.junit.Assert.assertFalse(fechac.valida());
		org.junit.Assert.assertFalse(fechad.valida());
		org.junit.Assert.assertFalse(fechae.valida());
		org.junit.Assert.assertFalse(fechaf.valida());
		org.junit.Assert.assertFalse(fechag.valida());
		org.junit.Assert.assertTrue(fechah.valida());
		org.junit.Assert.assertFalse(fechai.valida());
	}

}
