package com.sura.gmail.utils;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Credenciales {
	
	private String correo;
	private String password;
	
	public void credenciales() {
		Logger logger = Logger.getLogger("com.sura.gmail.utils.Credenciales");
		Properties properties = new java.util.Properties();
		try {
			properties.load(new java.io.FileInputStream("credenciales.properties"));
		} catch (IOException e) {
			logger.log(Level.WARNING,"Fallo la carga de las Propiedades",e);
		}
		correo = properties.getProperty("usuario");
		password = properties.getProperty("contrasenia");
	}
	
	public String usuario() {
		credenciales();
		return correo;
	}
	
	public String contrasenia() {
		credenciales();
		return password;
	}
	
}
