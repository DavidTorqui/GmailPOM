package com.sura.gmail.utils;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CredencialesTest {
	
	@Test
	public void usuarioTest() {
		Credenciales credenciales = new Credenciales();
		assertNotNull(credenciales.usuario());
	}
	
	@Test
	public void contraseniaTest() {
		Credenciales credenciales = new Credenciales();
		assertNotNull(credenciales.contrasenia());
	}

}
