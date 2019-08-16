package com.sura.gmail.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.gmail.com")
public class GmailPage extends PageObject{
	
	@FindBy(xpath="//input[contains(@type,\'email\')]")
	WebElementFacade txtUsuario;
	
	@FindBy(xpath="//input[contains(@type,\'password\')]")
	WebElementFacade txtContrasenia;
	
	@FindBy(xpath="//span[contains(text(),\'Siguiente\')]")
	WebElementFacade btnSiguienteUsuario;
	
	public void ingresarUsuario(String usuario) {
		txtUsuario.type(usuario);
	}
	
	public void ingresarContrasenia(String contrasenia) {
		txtContrasenia.type(contrasenia);
	}
	
	public void clickSiguiente() {
		btnSiguienteUsuario.click();
	}
	
}
