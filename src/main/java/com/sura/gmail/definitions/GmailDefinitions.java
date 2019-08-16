package com.sura.gmail.definitions;

import java.util.List;

import com.sura.gmail.steps.GmailStep;
import com.sura.gmail.utils.Datos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class GmailDefinitions {
	
	@Steps
	GmailStep gmailstep;
	
	@Dado("^que ingreso a la pagina web de gmail$")
	public void queIngresoALaPaginaWebDeGmail() {
		gmailstep.abrirPaginaWeb();
		gmailstep.ingresarCredenciales();
	}

	@Cuando("^envio un correo con la información brindada$")
	public void envioUnCorreoConLaInformacionBrindada(List<Datos> conInformacion) {
		gmailstep.redactarCorreo(conInformacion);
	}

	@Entonces("^el correo se envia correctamente$")
	public void elCorreoSeEnviaCorrectamente(List<Datos> esperado) {
		gmailstep.verificarResultado(esperado);
	}
	
}
