package com.sura.gmail.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import com.sura.gmail.pageobject.CorreoPage;
import com.sura.gmail.pageobject.GmailPage;
import com.sura.gmail.utils.Credenciales;
import com.sura.gmail.utils.Datos;
import com.sura.gmail.utils.Esperar;

import net.thucydides.core.annotations.Step;

public class GmailStep {
	
	private GmailPage gmailPage;
	private CorreoPage correoPage;
	
	@Step
	public void abrirPaginaWeb() {
		gmailPage.open();
	}
	
	@Step
	public void ingresarCredenciales() {
		Credenciales credenciales = new Credenciales();
		gmailPage.ingresarUsuario(credenciales.usuario());
		gmailPage.clickSiguiente();
		Esperar.segundos(2);
		gmailPage.ingresarContrasenia(credenciales.contrasenia());
		gmailPage.clickSiguiente();
		Esperar.segundos(30);
		
	}
	
	@Step
	public void redactarCorreo(List<Datos> informacion) {
		correoPage.clickRedactar();
		correoPage.ingresarCorreoDestino(informacion.get(0).getCorreoDestino());
		correoPage.ingresarAsunto(informacion.get(0).getAsunto());
		correoPage.ingresarMensaje(informacion.get(0).getMensaje());
		correoPage.clickEnviar();
		Esperar.segundos(5);
	}
	
	@Step
	public void verificarResultado(List<Datos> informacion) {
		assertThat(informacion.get(0).getResultado(), containsString(correoPage.verificarResultado()));
	}

}
