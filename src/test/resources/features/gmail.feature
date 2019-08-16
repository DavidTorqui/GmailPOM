#language:es
#Author: your.email@your.domain.com

@tag
Característica: Como administrador de la pagina web de Gmail
								Quiero realizar el envio de un correo 
								Para verificar que el envio sea exitoso

  @tag1
  Esquema del escenario: Enviar un correo electronico
    Dado que ingreso a la pagina web de gmail
    Cuando envio un correo con la información brindada
    |correoDestino   |asunto  |mensaje  |
    |<correoDestino>|<asunto>|<mensaje>|
    Entonces el correo se envia correctamente
    |resultado  |
    |<resultado>|
  
  Ejemplos:
  |correoDestino				|asunto				|mensaje												|resultado			 |
  |arley1856@hotmail.com|Prueba Gmail |Hola estoy probando el correo  |Mensaje enviado.| 
  