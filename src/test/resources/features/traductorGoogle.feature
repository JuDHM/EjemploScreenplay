#Author: juandiegohm00@gmail.com

@Regresion
Feature: Traducir palabras en distintos idiomas
  Quiero ingresar a Google Translator 
  A traducir palabras entre diferentes idiomas

  @CasoExitoso
  Scenario: Traducir de ingles a español
    Given Que Juan quiere usar el traductor de google
    When El traduce la palabra table del ingles al español
    Then El deberia ver la palabra mesa en la pantalla