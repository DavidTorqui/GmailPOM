package com.sura.gmail.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Esperar {
	
	private Esperar() {
	    throw new IllegalStateException("Utility class");
	  }
	
	public static void segundos(int segundos) {
		Logger logger = Logger.getLogger("com.sura.gmail.utils.Esperar");
		int tiempo = segundos * 1000;
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			logger.log(Level.WARNING,"Fallo la espera",e);
			Thread.currentThread().interrupt();
		}
	}

}
