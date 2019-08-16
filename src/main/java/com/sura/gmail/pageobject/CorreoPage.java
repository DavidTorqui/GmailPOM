package com.sura.gmail.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CorreoPage extends PageObject{
	
	@FindBy(xpath="//div[contains(text(),\'Redactar\')]")
	WebElementFacade btnRedactar;

	@FindBy(xpath="//textarea[contains(@name,\'to\')]")
	WebElementFacade txtCorreoDestino;
	
	@FindBy(xpath="//input[contains(@name,\'subjectbox\')]")
	WebElementFacade txtAsunto;
	
	@FindBy(xpath="//div[contains(@role, \'textbox\')]")
	WebElementFacade txtMensaje;
	
	@FindBy(xpath="//div[contains(@data-tooltip, \'Enviar\')]")
	WebElementFacade btnEnviar;
	
	@FindBy(xpath="//span[contains(text(), \"Mensaje enviado\")]")
	WebElementFacade lblResultado;	
	
	public void clickRedactar() {
		btnRedactar.click();
	}
	
	public void ingresarCorreoDestino(String destino) {
		txtCorreoDestino.type(destino);
	}
	
	public void ingresarAsunto(String asunto) {
		txtAsunto.type(asunto);
	}
	
	public void ingresarMensaje(String mensaje) {
		txtMensaje.type(mensaje);
	}
	
	public void clickEnviar() {
		btnEnviar.click();
	}
	
	public String verificarResultado() {
		return lblResultado.getText();
	}
	
}
